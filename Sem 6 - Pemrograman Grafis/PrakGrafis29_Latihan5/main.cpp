#ifdef __APPLE__
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif

#include <stdlib.h>
#include "stdio.h"

float R_Z=0.0f, R_X=0.0f, R_Y=0.0f;
float T_Z= -16.0f, T_X=0.0f, T_Y=0.0f;
int kamera_x =0, kamera_y =0, kamera_z =0;
//Untuk Material
float amb_R = 0.0215f, amb_G = 0.1745f, amb_B = 0.0215f, amb_Alpha = 0.55f;
float diff_R = 0.07568f, diff_G=0.61424f, diff_B=0.07568f, diff_Alpha=0.55f;
float spec_R = 0.633f, spec_G=0.727811f, spec_B=0.633f, spec_Alpha =0.55f;
float v_shine = 25.6f;
//Untuk Cahaya
float L_amb_R = 1.0f, L_amb_G = 1.0f, L_amb_B = 1.0f, L_amb_Alpha = 1.0f;
float L_diff_R = 1.0f, L_diff_G=1.0f, L_diff_B=1.0f, L_diff_Alpha=1.0f;
float L_spec_R = 1.0f, L_spec_G=1.0f, L_spec_B=1.0f, L_spec_Alpha =1.0f;

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

void display(){
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glLoadIdentity();
	gluLookAt(kamera_x, kamera_y, kamera_z,
		T_X, T_Y, T_Z,
		0, 1, 0);
	glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
	//Pencahayaan
	float light_ambient[]={L_amb_R, L_amb_G, L_amb_B, L_amb_Alpha};
	float light_diffuse[]={L_diff_R, L_diff_G, L_diff_B, L_diff_Alpha};
	float light_specular[]={L_spec_R, L_spec_G, L_spec_B, L_spec_Alpha};
	float light_position[]={0.0f,0.0f,20.0f,0.0f};
	glLightfv(GL_LIGHT0,GL_AMBIENT,light_ambient);
	glLightfv(GL_LIGHT0,GL_DIFFUSE,light_diffuse);
	glLightfv(GL_LIGHT0,GL_SPECULAR,light_specular);
	glLightfv(GL_LIGHT0,GL_POSITION,light_position);
	glEnable(GL_LIGHTING);
	glEnable(GL_LIGHT0);
	//Material
	float amb[]={amb_R, amb_G, amb_B, amb_Alpha };
	float diff[]={diff_R, diff_G, diff_B, diff_Alpha};
	float spec[]={spec_R, spec_G, spec_B, spec_Alpha};
	float shine=v_shine;
	glMaterialfv(GL_FRONT_AND_BACK,GL_AMBIENT,amb);
	glMaterialfv(GL_FRONT_AND_BACK,GL_DIFFUSE,diff);
	glMaterialfv(GL_FRONT_AND_BACK,GL_SPECULAR,spec);
	glMaterialf(GL_FRONT_AND_BACK,GL_SHININESS,shine);
	//Perintah untuk Translasi sesuai nilai X,Y dan Z
	glTranslatef(-T_X, T_Y, T_Z);
	// Membuat posisi objek tabung berdiri tegak
	glRotatef(-90.0f,1.0f,0.0f,0.0f);
	glRotatef(180.0f,0.0f,0.0f,1.0f);
	//Perintah untuk Rotasi sesuai nilai X,Y dan Z
	glRotatef(R_Z,0.0f,0.0f,1.0f);
	glRotatef(R_X,1.0f,0.0f,0.0f);
	glRotatef(R_Y,0.0f,1.0f,0.0f);
	Tabung();
	glFlush();
	glutSwapBuffers();
}

void timer(int value){
	glutPostRedisplay();
	glutTimerFunc(15, timer, 0);
}

void reshape(GLsizei width, GLsizei height){
	if (height == 0) height = 1;
	GLfloat aspect = (GLfloat)width / (GLfloat)height;
	glViewport(30, 6, width, height);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluPerspective(45.0f, aspect, 1.0f, 20.0f);
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
}

void keyFunction(unsigned char key, int x, int y){
	// Agar fungsi ini bekerja, pastikan CapsLock menyala
	switch(key){
		case 66: // Tombol B untuk objek berwarna Ungu
			amb_R=0.2125f; amb_G=0.1275f; amb_B=0.054f; amb_Alpha=1.0f;
			diff_R=0.714f; diff_G=0.4284f; diff_B=0.18144f; diff_Alpha=1.0f;
			spec_R=0.393548f; spec_G=0.271906f; spec_B=0.166721f; spec_Alpha=1.0f;
			v_shine =25.6f;
		break;
		case 71: // Tombol G untuk objek berwarna Light Blue
			amb_R=0.24725f; amb_G=0.1995f; amb_B=0.0745f; amb_Alpha=1.0f;
			diff_R=0.75164f; diff_G=0.60648f; diff_B=0.22648f; diff_Alpha=1.0f;
			spec_R=0.75164f; spec_G=0.60648f; spec_B=0.22648f; spec_Alpha=1.0f;
			v_shine =51.2f;
		break;
		case 80: // Tombol P untuk objek cahaya Ungu
			L_amb_R=1.0f; L_amb_G=0.0f; L_amb_B=1.0f; L_amb_Alpha=1.0f;
			L_diff_R=1.0f; L_diff_G=0.0f; L_diff_B=1.0f; L_diff_Alpha=1.0f;
			L_spec_R=1.0f; L_spec_G=0.0f; L_spec_B=1.0f; L_spec_Alpha =1.0f;
		break;
		case 78: // Tombol M untuk objek cahaya merah
			L_amb_R=1.0f; L_amb_G=0.0f; L_amb_B=0.0f; L_amb_Alpha=1.0f;
			L_diff_R=1.0f; L_diff_G=0.0f; L_diff_B=0.0f; L_diff_Alpha=1.0f;
			L_spec_R=1.0f; L_spec_G=0.0f; L_spec_B=0.0f; L_spec_Alpha =1.0f;
		break;
	}
}

int main(int argc, char **argv){
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH);
	glutInitWindowSize(640, 480);
	glutInitWindowPosition(50, 50);
	glutCreateWindow("3D Control - 171111118");
	glutDisplayFunc(display);
	glutReshapeFunc(reshape);
	glutKeyboardFunc(keyFunction);
	glutTimerFunc(0, timer, 0);
	glutMainLoop();
	return 0;
}
