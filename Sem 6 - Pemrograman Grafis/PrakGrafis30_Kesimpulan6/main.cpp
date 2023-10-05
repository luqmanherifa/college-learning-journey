/*
* GLUT Shapes Demo
*
* Written by Nigel Stewart November 2003
*
* This program is test harness for the sphere, cone
* and torus shapes in GLUT.
*
* Spinning wireframe and smooth shaded shapes are
* displayed until the ESC or q key is pressed.  The
* number of geometry stacks and slices can be adjusted
* using the + and - keys.
*/

#ifdef __APPLE__
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif

#include <stdlib.h>

float Cx = 5.0f, Cy = 0.0f, Cz = 5.0f;
float Lx = 0.0f, Ly = 0.0f, Lz = -20.0f;

float linear[] = {0.0f, 0.0f, -1.0f}; //deklarasi vektor untuk maju
float lateral[] = {1.0f, 0.0f, 0.0f}; //deklarasi vektor untuk gerakan ke kanan
float vertical[] = {0.0f, 1.0f, 0.0f}; //deklarasi vektor untuk gerakan naik

void Tabung(){
    float BODY_LENGTH=2.0f;
    float BODY_RADIUS=1.0f;
    int SLICES=30;
    int STACKS=30;
    GLUquadric *q = gluNewQuadric();
    gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
    gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup atas
    glTranslatef(0.0f, 0.0f, BODY_LENGTH);
    gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup bawah
}

void vectorMovement(float toMove[], float magnitude, float direction){
    float speedX = toMove[0]*magnitude*direction;
    float speedY = toMove[1]*magnitude*direction;
    float speedZ = toMove[2]*magnitude*direction;
    Cx += speedX;
    Cy += speedY;
    Cz += speedZ;
    Lx += speedX;
    Ly += speedY;
    Lz += speedZ;
}

void display(){
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glLoadIdentity();
    gluLookAt(Cx, Cy, Cz,Lx, Ly, Lz,0, 1, 0);
    glPushMatrix();
    glTranslatef(3.0f, -1.0f, -5.0f);
    glRotatef(-90.0f,1.0f,0.0f,0.0f);
    glRotatef(180.0f,0.0f,0.0f,1.0f);
    Tabung();
    glPopMatrix();
    glFlush();
    glutSwapBuffers();
}

void timer (int value){
    glutPostRedisplay();
    glutTimerFunc(15 , timer ,0);
}

void reshape(GLsizei width, GLsizei height){if (height == 0) height = 1;
    GLfloat aspect = (GLfloat)width / (GLfloat)height;
    glViewport(0, 0, width, height);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(45.0f, aspect, 1.0f, 20.0f);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
}
void keyFunction(unsigned char key, int x, int y){// Agar fungsi ini bekerja, pastikan CapsLock menyala
    switch(key){
        case 83: //tombol S
            vectorMovement(linear, 2.0f, -1.0f);
        break;
        case 65: //tombol A
            vectorMovement(lateral, 2.0f, -1.0f);
        break;
    }
}

void keyControl(int k, int x, int y) {
    switch(k) {
        case GLUT_KEY_UP: //tombol atas
            vectorMovement(vertical, 2.0f, -1.0f);
        break;
    }
}

int main(int argc, char **argv){
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH);
    glutInitWindowSize(640, 480);
    glutInitWindowPosition(50, 50);
    glutCreateWindow("Kesimpulan 6 - 171111118");
    glutDisplayFunc(display);
    glutReshapeFunc(reshape);
    glutSpecialFunc(keyControl);
    glutKeyboardFunc(keyFunction);
    glutTimerFunc(0, timer, 0);
    glutMainLoop();
    return 0;
}
