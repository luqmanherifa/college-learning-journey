	#ifdef __APPLE__
	#include <GLUT/glut.h>
	#else
	#include <GL/glut.h>
	#endif
	#include <stdlib.h>

	static void display()
	{
	    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	    glClearColor(1.0, 1.0, 1.0, 1.0);
	    glLoadIdentity();
	    glColor3f(0.0, 0.0, 0.0);

	    glBegin(GL_LINE_STRIP);
	        glVertex2d(-0.42,0.77);
	        glVertex2d(-0.60,0.77);
	        glVertex2d(-0.64,1);
	        glVertex2d(-0.68,0.77);
	        glVertex2d(-0.86,0.77);
	        glVertex2d(-0.7,0.68);
	        glVertex2d(-0.77,0.43);
	        glVertex2d(-0.64,0.63);
	        glVertex2d(-0.51,0.43);
	        glVertex2d(-0.58,0.68);
	        glVertex2d(-0.42,0.77);
	    glEnd();

	    glutSwapBuffers();
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
