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

	            float Cx = 0.0f, Cy = 2.5f, Cz = 0.0f;
	            float Lx = 0.0f, Ly = 2.5f, Lz = -20.0f;
	            float sudut_x = 0.0f;
	            float sudut_x2 = 0.0f;
	            float sudut_z = 0.0f;
	            float sudut_z2 = 0.0f;
	            float sudut_y = 0.0f;
	            float sudut_y2 = 0.0f;
	            float toRadians(float angle){
	    return angle * M_PI / 180;}
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
	                Vector sumbu_z, sumbu_x, sumbu_y;
	            void Tabung(){
	                float amb[] = {0.34f, 0.34f, 0.34f, 1.0f};
	                float diff[] = {0.41f, 0.41f, 0.41f, 1.0f};
	                float spec[] = {0.11f, 0.11f, 0.11f, 1.0f};
	                float shine = 200.0f;
	                glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, amb);
	                glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, diff);
	                glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, spec);
	                glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS, shine);
	                float BODY_LENGTH = 5.0f;
	                float BODY_RADIUS = 2.0f;
	                int SLICES = 30;
	                int STACKS = 30;
	                GLUquadric *q= gluNewQuadric();
	                gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
	                gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
	                glTranslatef(0.0f, 0.0f, BODY_LENGTH);
	                gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
	                }
	            static void BigBox(){
	                float amb[]={0.0f, 0.5f, 0.0f, 1.0f};
	                float diff[]={0.0f, 0.5f, 0.0f, 1.0f};
	                float spec[]={0.0f, 0.5f, 0.0f, 1.0f};
	                float shine=0.0f;
	                glMaterialfv(GL_FRONT,GL_AMBIENT,amb);
	                glMaterialfv(GL_FRONT,GL_DIFFUSE,diff);
	                glMaterialfv(GL_FRONT,GL_SPECULAR,spec);
	                glMaterialf(GL_FRONT_AND_BACK,GL_SHININESS,shine);
	                glBegin(GL_QUADS);
	                glVertex3f(-10000.0f, 0.0f, -10000.0f);
	                glVertex3f(10000.0f, 0.0f, -10000.0f);
	                glVertex3f(10000.0f, 0.0f, 10000.0f);
	                glVertex3f(-10000.0f, 0.0f, 10000.0f);
	                glEnd();
	 }
	 /* ini adalah function untuk melakukan pergerakan.
	 magnitude adalah besarnya gerakan sedangkan direction digunakan untuk menentukan arah.
	 gunakan -1 untuk arah berlawanan dengan vektor awal.*/
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
	            void initGL(){
	                sumbu_z.set_values(0.0f, 0.0f, -1.0f);
	                sumbu_x.set_values(1.0f, 0.0f, 0.0f);
	                sumbu_y.set_values(0.0f, 1.0f, 0.0f);
	                float ambient[] = {1.0f, 1.0f, 1.0f, 1.0f};
	                float diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
	                float position[] = {1.0f, 1.0f, 1.0f, 0.0f};
	                glLightfv(GL_LIGHT0, GL_AMBIENT, ambient);
	                glLightfv(GL_LIGHT0, GL_DIFFUSE, diffuse);
	                glLightfv(GL_LIGHT0, GL_POSITION, position);
	                glEnable(GL_LIGHT0);
	                glEnable(GL_LIGHTING);
	                glEnable(GL_DEPTH_TEST);
	                glClearColor(0.0f, 0.0f, 1.0f, 1.0f);
	                glShadeModel(GL_SMOOTH);
	                }
	            void reshape(GLsizei width, GLsizei height){
	                if (height == 0) height = 1;
	                GLfloat aspect = (GLfloat)width / (GLfloat)height;
	                glViewport(0, 0, width, height);
	                glMatrixMode(GL_PROJECTION);
	                glLoadIdentity();
	                gluPerspective(45.0f, aspect, 1.0f, 20.0f);
	                glMatrixMode(GL_MODELVIEW);
	                glLoadIdentity();
	                }
	            void display(){
	                glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);// Reset the current matrix to the "identity"
	                glLoadIdentity();// Move the "drawing cursor" around
	                gluLookAt(Cx, Cy, Cz,Lx, Ly, Lz,sumbu_y.x, sumbu_y.y, sumbu_y.z);
	                glPushMatrix();
	                glTranslatef(0.0f, 5.0f, -15.0f);
	                glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
	                Tabung();
	                glPopMatrix();
	                glPushMatrix();
	                BigBox();
	                glPopMatrix();
	                glFlush();
	                glutSwapBuffers();
	                }
	            void timer(int value){
	                glutPostRedisplay();
	                glutTimerFunc(15, timer, 0);
	                }
	            void keyControl(int k, int x, int y) {
	                switch(k) {
	                    case GLUT_KEY_UP: //arrow up
	                    vectorMovement(sumbu_y, 2.0f, 1.0f);
	                    break;
	                    case GLUT_KEY_DOWN: //arrow down
	                    vectorMovement(sumbu_y, 2.0f, -1.0f);
	                    break;
	            }
	                }
	            void keyFunction(unsigned char key, int x, int y){// Agar fungsi ini bekerja, pastikan CapsLock menyala
	                switch(key){
	                    case 87: // W
	                    vectorMovement(sumbu_x, 2.0f, 1.0f);
	                    break;
	                    case 83: // S
	                    vectorMovement(sumbu_x, 2.0f, -1.0f);
	                    break;
	                    case 68: // D
	                    vectorMovement(sumbu_z, 2.0f, 1.0f);
	                    break;
	                    case 65: // A
	                    vectorMovement(sumbu_z, 2.0f, -1.0f);
	                    break;
	                    case 74: // J
	                    sudut_z += 15.0f;
	                    sumbu_z.vectorRotation(sumbu_y, sudut_z - sudut_z2);
	                    //memutar vecto r sumbu z terhadap x (target, patokan)
	                    sumbu_x.vectorRotation(sumbu_y, sudut_z - sudut_z2);
	                    cameraRotation(sumbu_y, sudut_z - sudut_z2);// look at
	                    sudut_z2 = sudut_z;
	                    break;
	    }
	        }
	            int main(int argc, char **argv){
	                    glutInit(&argc, argv);
	                    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
	                    glutInitWindowSize(800, 600);
	                    glutInitWindowPosition(50, 50);
	                    glutCreateWindow("Latihan7");
	                    glutDisplayFunc(display);
	                    glutReshapeFunc(reshape);
	                    initGL();
	                    glutTimerFunc(0, timer, 0);
	                    glutSpecialFunc(keyControl);
	                    glutKeyboardFunc(keyFunction);
	                    glutMainLoop();
	                    return EXIT_SUCCESS;
	                    }
