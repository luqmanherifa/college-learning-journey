#ifdef _APPLE_
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif

#include <stdlib.h>
#include <math.h>

float Cx = 0.0f, Cy = 2.5f, Cz = 0.0f;
float Lx = 0.0f, Ly = 2.5f, Lz = -20.0f;
float angle_depanBelakang = 0.0f;
float angle_depanBelakang2 = 0.0f;
float angle_samping = 0.0f;
float angle_samping2 = 0.0f;
float angle_vertikal = 0.0f;
float angle_vertikal2 = 0.0f;
float silinderAngle = 90.0f;
bool ori = true, silinder = false, kamera = false;

float toRadians(float angle){
    return angle * M_PI / 180;
}

class Vector{
    public:
    float x, y, z;
    void set_values (float startX, float startY, float startZ){
        x = startX;
        y = startY;
        z = startZ;
    }
    void vectorRotation(Vector refs, float angle){
        Vector temp = refs;
        float magnitude = sqrt(pow(temp.x, 2) + pow(temp.y, 2) + pow(temp.z, 2)) ;
        temp.x = temp.x / magnitude;
        temp.y = temp.y / magnitude;
        temp.z = temp.z / magnitude;
        float dot_product = (x * temp.x)+(y * temp.y)+(z * temp.z);
        float cross_product_x = (y * temp.z) - (temp.z * z);
        float cross_product_y = -((x * temp.z) - (z * temp.x));
        float cross_product_z = (x * temp.y) - (y * temp.x);
        float last_factor_rodrigues = 1.0f - cos(toRadians(fmod(angle, 360.0f))) ;
        x = (x * cos(toRadians(fmod(angle, 360.0f)))) + (cross_product_x * sin(toRadians(fmod(angle, 360.0f)))) + (dot_product * last_factor_rodrigues * x);
        y = (y * cos(toRadians(fmod(angle, 360.0f)))) + (cross_product_y * sin(toRadians(fmod(angle, 360.0f)))) + (dot_product * last_factor_rodrigues * y);
        z = (z * cos(toRadians(fmod(angle, 360.0f)))) + (cross_product_z * sin(toRadians(fmod(angle, 360.0f)))) + (dot_product * last_factor_rodrigues * z);
    }
};

Vector depanBelakang, samping, vertikal;

void vectorMovement(Vector toMove, float magnitude, float direction){
    float speedX = toMove.x * magnitude * direction;
    float speedY = toMove.y * magnitude * direction;
    float speedZ= toMove.z * magnitude * direction;
    Cx += speedX;
    Cy += speedY;
    Cz += speedZ;
    Lx += speedX;
    Ly += speedY;
    Lz += speedZ;
}

void cameraRotation(Vector refer, double angle){
    float M = sqrt(pow(refer.x, 2) + pow(refer.y, 2) + pow(refer.z, 2));
    float Up_x1 = refer.x / M;
    float Up_y1 = refer.y / M;
    float Up_z1 = refer.z / M;
    float VLx = Lx - Cx;
    float VLy = Ly - Cy;
    float VLz = Lz - Cz;
    float dot_product = (VLx * Up_x1) + (VLy * Up_y1) + (VLz * Up_z1);
    float cross_product_x = (Up_y1 * VLz) - (VLy * Up_z1);
    float cross_product_y = -((Up_x1 * VLz) - (Up_z1 * VLx));
    float cross_product_z = (Up_x1 * VLy) - (Up_y1 * VLx);
    float last_factor_rodrigues = 1.0f - cos(toRadians(angle));
    float Lx1 = (VLx * cos(toRadians(angle))) + (cross_product_x * sin(toRadians (angle))) + (dot_product * last_factor_rodrigues * VLx);
    float Ly1 = (VLy * cos(toRadians(angle))) + (cross_product_y * sin(toRadians (angle))) + (dot_product * last_factor_rodrigues * VLy);
    float Lz1 = (VLz * cos(toRadians(angle))) + (cross_product_z * sin(toRadians (angle))) + (dot_product * last_factor_rodrigues * VLz);
    Lx = Lx1+Cx;
    Ly = Ly1+Cy;
    Lz = Lz1+Cz;
}

void initGL()
{
      depanBelakang.set_values(0.0f, 0.0f, -1.0f);
      samping.set_values(1.0f, 0.0f, 0.0f);
      vertikal.set_values(0.0f, 1.0f, 0.0f);
      glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
      glClearDepth(1.0f);
      glEnable(GL_DEPTH_TEST);
      glDepthFunc(GL_LEQUAL);
      glShadeModel(GL_SMOOTH);
      glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
}

void timer(int value)
{
  glutPostRedisplay();
  glutTimerFunc(15, timer, 0);
}

void reshape(GLsizei width, GLsizei height)
{
  if (height == 0)
      height = 1;
      GLfloat aspect = (GLfloat)width / (GLfloat)height;
      glViewport(0, 0, width, height);
      glMatrixMode(GL_PROJECTION);
      glLoadIdentity();
      gluPerspective(45.0f, aspect, 0.1f, 100.0f);
}

void chargerLaptop() {
    //bagian atas charger
    glBegin(GL_POLYGON);
        glColor3d(0,1,0);
        glVertex3d(0, 5, 0);
        glVertex3d(20, 5, 0);
        glVertex3d(20, 5, 10);
        glVertex3d(0, 5, 10);
    glEnd();

    //bagian bawah charger
    glBegin(GL_POLYGON);
        glColor3d(0,0,1);
        glVertex3d(0, 0, 0);
        glVertex3d(20, 0, 0);
        glVertex3d(20, 0, 10);
        glVertex3d(0, 0, 10);
    glEnd();

    //bagian depan charger
    glBegin(GL_POLYGON);
        glColor3d(1,0,1);
        glVertex3d(0, 5, 10);
        glVertex3d(20, 5, 10);
        glVertex3d(20, 0, 10);
        glVertex3d(0, 0, 10);
    glEnd();

    //bagian belakang charger
    glBegin(GL_POLYGON);
        glColor3d(1,0,0);
        glVertex3d(0, 5, 0);
        glVertex3d(20, 5, 0);
        glVertex3d(20, 0, 0);
        glVertex3d(0, 0, 0);
    glEnd();

    //bagian kanan charger
    glBegin(GL_POLYGON);
        glColor3d(1,0,0);
        glVertex3d(20, 5, 0);
        glVertex3d(20, 5, 10);
        glVertex3d(20, 0, 10);
        glVertex3d(20, 0, 0);
    glEnd();

    //bagian kiri charger
    glBegin(GL_POLYGON);
        glColor3d(1,0,0);
        glVertex3d(0, 5, 0);
        glVertex3d(0, 5, 10);
        glVertex3d(0, 0, 10);
        glVertex3d(0, 0, 0);
    glEnd();

    //-------------------------------

    //bagian sisi kiri kabel
    glBegin(GL_POLYGON);
        glColor3d(1,1,0);
        glVertex3d(20, 4, 4);
        glVertex3d(20, 2, 4);
        glVertex3d(20, 2, 6);
        glVertex3d(20, 4, 6);
    glEnd();

    //bagian sisi kanan kabel
    glBegin(GL_POLYGON);
        glColor3d(0,1,0);
        glVertex3d(50, 4, 4);
        glVertex3d(50, 2, 4);
        glVertex3d(50, 2, 6);
        glVertex3d(50, 4, 6);
    glEnd();

    //bagian sisi atas kabel
    glBegin(GL_POLYGON);
        glColor3d(1,0,0);
        glVertex3d(50, 4, 4);
        glVertex3d(50, 4, 6);
        glVertex3d(20, 4, 6);
        glVertex3d(20, 4, 4);
    glEnd();

    //bagian sisi bawah kabel
    glBegin(GL_POLYGON);
        glColor3d(1,1,0);
        glVertex3d(50, 2, 4);
        glVertex3d(50, 2, 6);
        glVertex3d(20, 2, 6);
        glVertex3d(20, 2, 4);
    glEnd();

    //bagian sisi depan kabel
    glBegin(GL_POLYGON);
        glColor3d(0,1,1);
        glVertex3d(20, 4, 6);
        glVertex3d(50, 4, 6);
        glVertex3d(50, 2, 6);
        glVertex3d(20, 2, 6);
    glEnd();

    //bagian sisi belakang kabel
    glBegin(GL_POLYGON);
        glColor3d(1,0,1);
        glVertex3d(20, 4, 4);
        glVertex3d(50, 4, 4);
        glVertex3d(50, 2, 4);
        glVertex3d(20, 2, 4);
    glEnd();

    //-------------------------------

    //bagian sisi kiri kabel
    glBegin(GL_POLYGON);
        glColor3d(1,1,0);
        glVertex3d(-20, 4, 4);
        glVertex3d(-20, 2, 4);
        glVertex3d(-20, 2, 6);
        glVertex3d(-20, 4, 6);
    glEnd();

    //bagian sisi kanan kabel
    glBegin(GL_POLYGON);
        glColor3d(0,1,0);
        glVertex3d(0, 4, 4);
        glVertex3d(0, 2, 4);
        glVertex3d(0, 2, 6);
        glVertex3d(0, 4, 6);
    glEnd();

    //bagian sisi atas kabel
    glBegin(GL_POLYGON);
        glColor3d(1,0,0);
        glVertex3d(0, 4, 4);
        glVertex3d(0, 4, 6);
        glVertex3d(-20, 4, 6);
        glVertex3d(-20, 4, 4);
    glEnd();

    //bagian sisi bawah kabel
    glBegin(GL_POLYGON);
        glColor3d(1,1,0);
        glVertex3d(0, 2, 4);
        glVertex3d(0, 2, 6);
        glVertex3d(-20, 2, 6);
        glVertex3d(-20, 2, 4);
    glEnd();

    //bagian sisi depan kabel
    glBegin(GL_POLYGON);
        glColor3d(0,1,1);
        glVertex3d(-20, 4, 6);
        glVertex3d(0, 4, 6);
        glVertex3d(0, 2, 6);
        glVertex3d(-20, 2, 6);
    glEnd();

    //bagian sisi belakang kabel
    glBegin(GL_POLYGON);
        glColor3d(1,0,1);
        glVertex3d(-20, 4, 4);
        glVertex3d(0, 4, 4);
        glVertex3d(0, 2, 4);
        glVertex3d(-20, 2, 4);
    glEnd();

}

void keyControl(int k, int x, int y) {
    switch(k) {
        case GLUT_KEY_UP: //arrow up
            vectorMovement(vertikal, 2.0f, 1.0f);
        break;
        case GLUT_KEY_DOWN: //arrow down
            vectorMovement(vertikal, 2.0f, -1.0f);
        break;
        case GLUT_KEY_LEFT: //arrow left
            angle_depanBelakang += 15.0f;
            samping.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
            vertikal.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
            //cameraRotation(vertikal, angle_samping-angle_samping2);
            angle_depanBelakang2 = angle_depanBelakang;
        break;
        case GLUT_KEY_RIGHT: //arrow right
            angle_depanBelakang -= 15.0f;
            samping.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
            vertikal.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
            //cameraRotation(vertikal, angle_samping-angle_samping2);
            angle_depanBelakang2 = angle_depanBelakang;
        break;
    }
}

void keyFunction(unsigned char key, int x, int y){

    //pastikan tombol CAPSLOCK ON

    switch(key){
        case 87: //tombol huruf W
            if (silinder){
                silinder = true;
            } else {
                silinder = true;
            }
        break;
        case 83: //tombol huruf S
            if (silinder){
                silinder = false;
            } else {
                silinder = false;
            }
            break;
    }

}

void display()
{
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluLookAt(Cx, Cy, Cz,
    Lx, Ly, Lz,
    vertikal.x, vertikal.y, vertikal.z);


    glPushMatrix();
        glTranslatef(-10.0, 0.0, -100.0);
        glRotatef(silinderAngle, 1.0f, 0.0f, 0.0f);
        glColor3f(1,0.4,0.2);
        chargerLaptop();
    glPopMatrix();
    if (silinder){
        silinderAngle += 2.0f;
    }


    glFlush();
    glutSwapBuffers();
}

int main(int argc, char **argv)
{
  glutInit(&argc, argv);
  glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH);
  glutInitWindowSize(854, 480);
  glutInitWindowPosition(50, 50);
  glutCreateWindow("171111118 - TA Praktikum Grafis");
  glutDisplayFunc(display);
  glutReshapeFunc(reshape);
  initGL();
  glutTimerFunc(0, timer, 0);
  glutSpecialFunc(keyControl);
  glutKeyboardFunc(keyFunction);
  glutMainLoop();
  return EXIT_SUCCESS;
}
