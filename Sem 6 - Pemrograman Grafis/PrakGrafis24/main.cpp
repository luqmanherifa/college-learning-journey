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

void PRISMA_() {
    //A B C
    glBegin(GL_POLYGON);
        glVertex3f(0, 0, 0);
        glVertex3f(2.5f, 0, 2.5f);
        glVertex3f(5, 0, 0);
        glVertex3f(0, 0, 0);
    glEnd();
    //D E F
    glBegin(GL_POLYGON);
        glVertex3f(0, 5, 0);
        glVertex3f(2.5f, 5, 2.5f);
        glVertex3f(5, 5, 0);
        glVertex3f(0, 5, 0);
    glEnd();
    //A B E D
    glBegin(GL_POLYGON);
        glColor3f(1,0,0);
        glVertex3f(0, 0, 0);
        glVertex3f(2.5f, 0, 2.5f);
        glVertex3f(2.5f, 5, 2.5f);
        glVertex3f(0, 5, 0);
        glVertex3f(0, 0, 0);
    glEnd();
    //B C F E
    glBegin(GL_POLYGON);
        glColor3f(0,0,1);
        glVertex3f(2.5f, 0, 2.5f);
        glVertex3f(5, 0, 0);
        glVertex3f(5, 5, 0);
        glVertex3f(2.5f, 5, 2.5f);
        glVertex3f(2.5f, 0, 2.5f);
    glEnd();
    //A C F D
    glBegin(GL_POLYGON);
        glColor3f(0,1,0);
        glVertex3f(0, 0, 0);
        glVertex3f(5, 0, 0);
        glVertex3f(5, 5, 0);
        glVertex3f(0, 5, 0);
        glVertex3f(0, 0, 0);
    glEnd();
}

void display()
{
    const double t = glutGet(GLUT_ELAPSED_TIME) / 1000.0;
    const double a = t*10.0;

    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    glTranslatef(-3.0, 0.0, -20.0);
    glColor3f(0, 0, 0);
    glRotated(45,1,0,0);
    glRotated(a,0,1,0);
    PRISMA_();

    glFlush();
    glutSwapBuffers();
}

int main(int argc, char **argv)
{
  glutInit(&argc, argv);
  glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH);
  glutInitWindowSize(640, 480);
  glutInitWindowPosition(50, 50);
  glutCreateWindow("Tugas 3");
  glutDisplayFunc(display);
  glutReshapeFunc(reshape);
  initGL();
  glutTimerFunc(0, timer, 0);
  glutMainLoop();
  return 0;
}
