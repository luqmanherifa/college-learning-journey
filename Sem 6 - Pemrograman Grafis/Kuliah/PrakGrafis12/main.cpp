	#ifdef __APPLE__
	#include <GLUT/glut.h>
	#else
	#include <GL/glut.h>
	#endif
	#include <stdlib.h>

	void display(){
	    glClearColor(1.0, 1.0, 1.0, 1.0);
	    glClear(GL_COLOR_BUFFER_BIT);
	    glColor3f(0.0, 0.0, 0.0);

	    glBegin (GL_LINE_LOOP);
	        glVertex2f(-0.50f, -0.50f);
	        glVertex2f(0.50f, -0.50f);
	        glVertex2f(0.0f, 0.50f);
	    glEnd();

	    glFlush();
	    glutPostRedisplay();
	}

	int main(int argc, char** argv){
	    glutInit(&argc, argv);
	    glutInitDisplayMode(GLUT_SINGLE);
	    glutInitWindowSize(500, 500);
	    glutInitWindowPosition(100, 100);
	    glutCreateWindow("OpenGL - First window demo");
	    glutDisplayFunc(display);
	    glutMainLoop();
	return 0;
	}
