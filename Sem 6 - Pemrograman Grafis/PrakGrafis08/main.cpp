	#ifdef __APPLE__
	#include <GLUT/glut.h>
	#else
	#include <GL/glut.h>
	#endif

	#include <stdlib.h>

	void initGL(){
	    glClearColor(1.0f, 0.0f, 1.0f, 1.0f);
	    glClearDepth(1.0f);
	    glEnable(GL_DEPTH_TEST);
	    glDepthFunc(GL_LEQUAL);
	    glShadeModel(GL_SMOOTH);
	    glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
	}

	void timer(int value){
	    glutPostRedisplay();
	    glutTimerFunc(15, timer, 0);
	}

	void reshape(GLsizei width, GLsizei height){
	    if (height == 0)
	        height = 1;
	    GLfloat aspect = (GLfloat)width / (GLfloat)height;
	    glViewport(0, 0, width, height);
	    glMatrixMode(GL_PROJECTION);
	    glLoadIdentity();
	    gluPerspective(45.0f, aspect, 0.1f, 100.0f);
	}

	void garis(){
	    glBegin(GL_LINES);
	        glColor3f(0, 0, 0); // red
	        glVertex3f(0,0,0);
	        glVertex3f(3,0,0);
	    glEnd();
	}

	void display()  {
	    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	        glClearColor(1.0, 1.0, 1.0, 1.0);
	        glLoadIdentity();
	        glColor3f(0.0, 0.0, 0.0);
	    glBegin(GL_QUADS);
	        glVertex2d(-0.2,0);
	        glVertex2d(0.1,0);
	        glVertex2d(0.1,0.1);
	        glVertex2d(-0.2,0.1);
	    glEnd();
	    glBegin(GL_QUADS);
	        glVertex2d(-0.1,0);
	        glVertex2d(-0.1,-0.25);
	        glVertex2d(0,-0.25);
	        glVertex2d(0,0);
	    glEnd();
	    glutSwapBuffers();
	    glutPostRedisplay();
	}

	int main(int argc, char **argv){
	    glutInit(&argc, argv);
	    glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH);
	    glutInitWindowSize(640, 480);
	    glutInitWindowPosition(50, 50);
	    glutCreateWindow("praktikum 1");
	    glutDisplayFunc(display);
	    glutReshapeFunc(reshape);
	    initGL();
	    glutTimerFunc(0, timer, 0);
	    glutMainLoop();
	return 0;
	}
