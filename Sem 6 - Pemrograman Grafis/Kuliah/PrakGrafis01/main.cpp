	#ifdef __APPLE__
	#include <GLUT/glut.h>
	#else
	#include <GL/glut.h>
	#endif

	#include <stdlib.h>

	void display(){
	    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	    glClearColor(1.0, 1.0, 1.0, 1.0);
	    glLoadIdentity();
	    glColor3f(0.0, 0.0, 0.0); //Warna hitam
	    glBegin(GL_TRIANGLES);
	    glVertex3f(0.0f, 0.5f, 0.0f);
	    glVertex3f(-0.5f, -0.5f, 0.0f);
	    glVertex3f(0.5f, -0.5f, 0.0f);
	    glEnd();
	    glFlush();
	    glutPostRedisplay();
	}

	int main(int argc, char** argv) {
	    glutInit(&argc, argv);
	    glutInitDisplayMode(GLUT_SINGLE);
	    glutInitWindowSize(500, 500);
	    glutInitWindowPosition(100, 100);
	    glutCreateWindow("OpenGL - First window demo");
	    glutDisplayFunc(display);
	    glutMainLoop();
	return 0;
	}
