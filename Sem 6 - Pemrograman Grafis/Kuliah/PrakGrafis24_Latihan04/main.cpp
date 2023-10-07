#ifdef _APPLE_
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif

#include <stdlib.h>


void initGL()
{
    float ambient[] = {1,1,1,1};
    float diffuse[] = {1,1,1,1};
    float position[] = {1,1,1,0};

    glLightfv(GL_LIGHT0, GL_AMBIENT, ambient);
    glLightfv(GL_LIGHT0, GL_DIFFUSE, diffuse);
    glLightfv(GL_LIGHT0, GL_POSITION, position);

    glEnable(GL_LIGHT0);
    glEnable(GL_NORMALIZE);
    glEnable(GL_DEPTH_TEST);
    //glEnable(GL_COLOR_MATERIAL);
    glEnable(GL_LIGHTING);

    glClearColor(1,0,1,0);
    glShadeModel(GL_SMOOTH);
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

void Ball(){
    float radius=1;
    int slices=30;
    int stacks=30;
    GLUquadric * q = gluNewQuadric();
    gluSphere(q, radius, slices, stacks);
}

void Cylinder(){
    GLUquadric * q = gluNewQuadric();
    gluCylinder(q, 1, 1, 2, 30, 30);
    gluDisk(q, 0, 1, 30, 30);
    glTranslatef(0, 0, 2);
    gluDisk(q, 0, 1, 30, 30);
}

void display()
{
    const double t = glutGet(GLUT_ELAPSED_TIME) / 1000.0;
    const double a = t*10.0;

    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    glTranslatef(0.0, 2.0, -15.0);

    glPushMatrix();
        Ball();
    glPopMatrix();
    glPushMatrix();
        glTranslatef(0, -3, 0);
        glRotatef(30, 0, 1, 0);
        glRotatef(-30, 1, 0, 0);
        Cylinder();
    glPopMatrix();

    glFlush();
    glutSwapBuffers();
}

int main(int argc, char **argv)
{
  glutInit(&argc, argv);
  glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH);
  glutInitWindowSize(640, 480);
  glutInitWindowPosition(50, 50);
  glutCreateWindow("Latihan 04 - 171111118");
  glutDisplayFunc(display);
  glutReshapeFunc(reshape);
  initGL();
  glutTimerFunc(0, timer, 0);
  glutMainLoop();
  return 0;
}
