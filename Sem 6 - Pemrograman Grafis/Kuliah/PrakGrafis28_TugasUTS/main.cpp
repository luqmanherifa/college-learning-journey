#ifdef APPLE
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif

#include <stdlib.h>


void initGL()
{
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

void display_x(){
//depan_x
glBegin(GL_POLYGON);
    glColor3f(0, 0, 0);
    glVertex3f(0, 10, 3);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(1, 10, 3);
    glVertex3f(2, 9, 3);
    glVertex3f(3, 10, 3);
    glVertex3f(4, 10, 3);
    glVertex3f(3, 8, 3);
    glVertex3f(4, 5, 3);
    glVertex3f(3, 5, 3);
    glVertex3f(2, 7, 3);
    glVertex3f(1, 5, 3);
    glVertex3f(0, 5, 3);
    glVertex3f(1, 8, 3);
    glVertex3f(0, 10, 3);
glEnd();

//belakang_x
glBegin(GL_POLYGON);
    glColor3f(0, 0, 0);
    glVertex3f(0, 10, 2);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(1, 10, 2);
    glVertex3f(2, 9, 2);
    glVertex3f(3, 10, 2);
    glVertex3f(4, 10, 2);
    glVertex3f(3, 8, 2);
    glVertex3f(4, 5, 2);
    glVertex3f(3, 5, 2);
    glVertex3f(2, 7, 2);
    glVertex3f(1, 5, 2);
    glVertex3f(0, 5, 2);
    glVertex3f(1, 8, 2);
    glVertex3f(0, 10, 2);
glEnd();
}

void display_kubus(){
//depan
glBegin(GL_POLYGON);
    glColor3f(0, 0, 0);
    glVertex3f(5, 5, 5);
    glVertex3f(5, 0, 5);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(0, 0, 5);
    glVertex3f(0, 5, 5);
glEnd();

//belakang
glBegin(GL_POLYGON);
    glColor3f(0, 0, 0);
    glVertex3f(5, 0, 0);
    glVertex3f(5, 5, 0);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(0, 5, 0);
    glVertex3f(0, 0, 0);
glEnd();

//atas
glBegin(GL_POLYGON);
    glColor3f(0, 0, 0);
    glVertex3f(5, 5, 5);
    glVertex3f(5, 5, 0);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(0, 5, 0);
    glVertex3f(0, 5, 5);
glEnd();

//bawah
glBegin(GL_POLYGON);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(5, 0, 0);
    glVertex3f(5, 0, 5);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(0, 0, 5);
    glVertex3f(0, 0, 0);
glEnd();

//kiri
glBegin(GL_POLYGON);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(0, 0, 0);
    glVertex3f(0, 0, 5);
    glVertex3f(0, 5, 5);
    glVertex3f(0, 5, 0);
glEnd();

//kanan
glBegin(GL_POLYGON);
    glColor4f(1.0, 0.0, 1.0, 0.0);
    glVertex3f(5, 0, 0);
    glVertex3f(5, 0, 5);
    glVertex3f(5, 5, 5);
    glVertex3f(5, 5, 0);
glEnd();
}

void display_1(){
    //depan
    glBegin(GL_POLYGON);
        glColor3f(0, 0, 0);
        glVertex3f(8, 5, 3);
        glVertex3f(9, 5, 3);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(9, 9, 3);
        glVertex3f(8, 9, 3);
    glEnd();

    //belakang
    glBegin(GL_POLYGON);
        glColor3f(0, 0, 0);
        glVertex3f(8, 5, 2);
        glVertex3f(9, 5, 2);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(9, 9, 2);
        glVertex3f(8, 9, 2);
    glEnd();

    //kanan
    glBegin(GL_POLYGON);
        glColor3f(0, 0, 0);
        glVertex3f(9, 5, 2);
        glVertex3f(9, 9, 2);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(9, 9, 3);
        glVertex3f(9, 5, 3);
    glEnd();

    //kiri
    glBegin(GL_POLYGON);
        glColor3f(0, 0, 0);
        glVertex3f(8, 5, 2);
        glVertex3f(8, 9, 2);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(8, 9, 3);
        glVertex3f(8, 5, 3);
    glEnd();

    //atas
    glBegin(GL_POLYGON);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(8, 9, 3);
        glVertex3f(8, 9, 2);
        glVertex3f(9, 9, 2);
        glVertex3f(9, 9, 3);
    glEnd();

    //bawah
    glBegin(GL_POLYGON);
        glColor3f(0, 0, 0);
        glVertex3f(9, 5, 3);
        glVertex3f(9, 5, 2);
        glVertex3f(8, 5, 2);
        glVertex3f(8, 5, 3);
    glEnd();
}

void display_8(){
    //depan
    glBegin(GL_POLYGON);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(13, 9, 3);
        glColor3f(0, 0, 0);
        glVertex3f(12, 5, 3);
        glVertex3f(13, 9, 3);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(10, 0, 3);
        glVertex3f(12, 5, 3);
        glVertex3f(10, 9, 3);
    glEnd();

    //belakang
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(13, 9, 2);
        glColor3f(0, 0, 0);
        glVertex3f(12, 5, 2);
        glVertex3f(13, 9, 2);
        glColor4f(1.0, 0.0, 1.0, 0.0);
        glVertex3f(10, 0, 2);
        glVertex3f(12, 5, 2);
        glVertex3f(10, 9, 2);
    glEnd();
}

void display()
{
    const double t = glutGet(GLUT_ELAPSED_TIME) / 1000.0;
    const double a = t*4.0;

    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();


    glTranslatef(-10.0, 0.0, -70.0);
    glRotated(a,1,0,0);

    glPushMatrix();
        glColor3f(0, 0, 0);
        glTranslatef(0, 0, 0);
        display_x();
    glPopMatrix();

    glPushMatrix();
        glColor3f(0, 0, 0);
        glTranslatef(0, 0, 0);
        display_1();
    glPopMatrix();

    glPushMatrix();
        glColor3f(0, 0, 0);
        glTranslatef(0, 0, 0);
        display_8();
    glPopMatrix();

    glPushMatrix();
        glTranslatef(0, 0, 0);
        display_kubus();
    glPopMatrix();

    glFlush();
    glutSwapBuffers();
}

int main(int argc, char **argv)
{
  glutInit(&argc, argv);
  glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH);
  glutInitWindowSize(1280, 720);
  glutInitWindowPosition(50, 50);
  glutCreateWindow("Tugas UTS - 171 111 118");
  glutDisplayFunc(display);
  glutReshapeFunc(reshape);
  initGL();
  glutTimerFunc(0, timer, 0);
  glutMainLoop();
  return 0;
}
