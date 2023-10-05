package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * Grafis04_TugasUTS.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Grafis04_TugasUTS implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Tugas UTS - Luqman Al 171 111 118");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Grafis04_TugasUTS());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {             
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }
    private float view_rotx = 110.0f;
    private float view_roty = 110.0f;
    private int oldMouseX;
    private int oldMouseY;

    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_FLAT);
           
        drawable.addMouseListener((MouseListener) this);
        drawable.addMouseMotionListener((MouseMotionListener) this);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { 
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
       GL gl = drawable.getGL();
        GLU glu = new GLU();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        glu.gluLookAt(4,4,4,0,0,0,0,0,1);
        gl.glTranslatef(-1.0f, -6.0f, -4.0f);     
        gl.glRotatef(view_rotx, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(view_roty, 0.0f, 1.0f, 0.0f);
        
        //--------------------------------------------------------          
        
        //buat E
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
            gl.glVertex3f(0.4f, 2.0f, 0.0f);
            gl.glVertex3f(0.4f, 0.0f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
            gl.glVertex3f(1.0f, 2.0f, 0.0f);
            gl.glVertex3f(1.0f, 1.6f, 0.0f);
            gl.glVertex3f(0.0f, 1.6f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 0.8f, 0.0f);
            gl.glVertex3f(0.0f, 0.8f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 0.4f, 0.0f);
            gl.glVertex3f(1.0f, 0.4f, 0.0f);
            gl.glVertex3f(1.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glEnd();

        //buat E sisi
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 0.0f, 1.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.5f);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.0f);
            gl.glVertex3f(1.0f, 1.6f, 0.0f);
            gl.glVertex3f(1.0f, 1.6f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 1.6f, 0.5f);
            gl.glVertex3f(1.0f, 1.6f, 0.0f);
            gl.glVertex3f(0.4f, 1.6f, 0.0f);
            gl.glVertex3f(0.4f, 1.6f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.4f, 1.6f, 0.5f);
            gl.glVertex3f(0.4f, 1.6f, 0.0f);
            gl.glVertex3f(0.4f, 1.2f, 0.0f);
            gl.glVertex3f(0.4f, 1.2f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.4f, 1.2f, 0.5f);
            gl.glVertex3f(0.4f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 1.2f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 1.2f, 0.5f);
            gl.glVertex3f(1.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 0.8f, 0.0f);
            gl.glVertex3f(1.0f, 0.8f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 0.8f, 0.5f);
            gl.glVertex3f(1.0f, 0.8f, 0.0f);
            gl.glVertex3f(0.4f, 0.8f, 0.0f);
            gl.glVertex3f(0.4f, 0.8f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.4f, 0.8f, 0.5f);
            gl.glVertex3f(0.4f, 0.8f, 0.0f);
            gl.glVertex3f(0.4f, 0.4f, 0.0f);
            gl.glVertex3f(0.4f, 0.4f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 0.4f, 0.5f);
            gl.glVertex3f(1.0f, 0.4f, 0.0f);
            gl.glVertex3f(0.4f, 0.4f, 0.0f);
            gl.glVertex3f(0.4f, 0.4f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 0.4f, 0.5f);
            gl.glVertex3f(1.0f, 0.4f, 0.0f);
            gl.glVertex3f(1.0f, 0.0f, 0.0f);
            gl.glVertex3f(1.0f, 0.0f, 0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 0.0f, 0.5f);
            gl.glVertex3f(1.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.5f);
        gl.glEnd();
        
        //buat E depan
        gl.glBegin(GL.GL_POLYGON);
            gl.glColor3f(1.5f, 0.5f, 1.5f);
            gl.glVertex3f(0.0f, 0.0f, 0.5f);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(0.4f, 2.0f, 0.5f);
            gl.glVertex3f(0.4f, 0.0f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 1.6f, 0.5f);
            gl.glVertex3f(0.0f, 1.6f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 1.2f, 0.5f);
            gl.glVertex3f(1.0f, 1.2f, 0.5f);
            gl.glVertex3f(1.0f, 0.8f, 0.5f);
            gl.glVertex3f(0.0f, 0.8f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 0.4f, 0.5f);
            gl.glVertex3f(1.0f, 0.4f, 0.5f);
            gl.glVertex3f(1.0f, 0.0f, 0.5f);
            gl.glVertex3f(0.0f, 0.0f, 0.5f);
        gl.glEnd(); //end E
        
        gl.glTranslatef(2.0f, 0.0f, 0.0f); //posisi E
        
        //--------------------------------------------------------        
        
        gl.glTranslatef(0.0f, 0.0f, 0.0f); //posisi F
        
        //buat F
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
            gl.glVertex3f(0.4f, 2.0f, 0.0f);
            gl.glVertex3f(0.4f, 0.0f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
            gl.glVertex3f(1.0f, 2.0f, 0.0f);
            gl.glVertex3f(1.0f, 1.6f, 0.0f);
            gl.glVertex3f(0.0f, 1.6f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 0.8f, 0.0f);
            gl.glVertex3f(0.0f, 0.8f, 0.0f);
        gl.glEnd();
        
        //buat F sisi
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 0.0f, 1.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.5f);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.0f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.0f);
            gl.glVertex3f(1.0f, 1.6f, 0.0f);
            gl.glVertex3f(1.0f, 1.6f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 1.6f, 0.5f);
            gl.glVertex3f(1.0f, 1.6f, 0.0f);
            gl.glVertex3f(0.4f, 1.6f, 0.0f);
            gl.glVertex3f(0.4f, 1.6f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.4f, 1.6f, 0.5f);
            gl.glVertex3f(0.4f, 1.6f, 0.0f);
            gl.glVertex3f(0.4f, 1.2f, 0.0f);
            gl.glVertex3f(0.4f, 1.2f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.4f, 1.2f, 0.5f);
            gl.glVertex3f(0.4f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 1.2f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 1.2f, 0.5f);
            gl.glVertex3f(1.0f, 1.2f, 0.0f);
            gl.glVertex3f(1.0f, 0.8f, 0.0f);
            gl.glVertex3f(1.0f, 0.8f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(1.0f, 0.8f, 0.5f);
            gl.glVertex3f(1.0f, 0.8f, 0.0f);
            gl.glVertex3f(0.4f, 0.8f, 0.0f);
            gl.glVertex3f(0.4f, 0.8f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.4f, 0.8f, 0.5f);
            gl.glVertex3f(0.4f, 0.8f, 0.0f);
            gl.glVertex3f(0.4f, 0.0f, 0.0f);
            gl.glVertex3f(0.4f, 0.0f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.4f, 0.0f, 0.5f);
            gl.glVertex3f(0.4f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 0.0f, 0.5f);
        gl.glEnd();
        
        //buat F depan
        gl.glBegin(GL.GL_POLYGON);
            gl.glColor3f(1.5f, 0.5f, 1.5f);
            gl.glVertex3f(0.0f, 0.0f, 0.5f);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(0.4f, 2.0f, 0.5f);
            gl.glVertex3f(0.4f, 0.0f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 2.0f, 0.5f);
            gl.glVertex3f(1.0f, 1.6f, 0.5f);
            gl.glVertex3f(0.0f, 1.6f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
            gl.glVertex3f(0.0f, 1.2f, 0.5f);
            gl.glVertex3f(1.0f, 1.2f, 0.5f);
            gl.glVertex3f(1.0f, 0.8f, 0.5f);
            gl.glVertex3f(0.0f, 0.8f, 0.5f);
        gl.glEnd(); //end F
 
        //--------------------------------------------------------
        
        gl.glTranslatef(3.0f, 1.0f, 0.0f); //posisi Cube
        
        //buat Cube
        gl.glBegin(GL.GL_POLYGON);
            gl.glColor3f(1.0f, 0.0f, 1.0f);
            gl.glVertex3f(1.0f, 1.0f, -1.0f);
            gl.glVertex3f(-1.0f, 1.0f, -1.0f);
            gl.glVertex3f(-1.0f, 1.0f, 1.0f);
            gl.glVertex3f(1.0f, 1.0f, 1.0f);
      
            gl.glVertex3f(1.0f, -1.0f, 1.0f);
            gl.glVertex3f(-1.0f, -1.0f, 1.0f);
            gl.glVertex3f(-1.0f, -1.0f, -1.0f);
            gl.glVertex3f(1.0f, -1.0f, -1.0f);
      
            gl.glVertex3f(1.0f, 1.0f, 1.0f);
            gl.glVertex3f(-1.0f, 1.0f, 1.0f);
            gl.glVertex3f(-1.0f, -1.0f, 1.0f);
            gl.glVertex3f(1.0f, -1.0f, 1.0f);

            gl.glVertex3f(1.0f, -1.0f, -1.0f);
            gl.glVertex3f(-1.0f, -1.0f, -1.0f);
            gl.glVertex3f(-1.0f, 1.0f, -1.0f);
            gl.glVertex3f(1.0f, 1.0f, -1.0f);

            gl.glVertex3f(-1.0f, 1.0f, 1.0f);
            gl.glVertex3f(-1.0f, 1.0f, -1.0f);
            gl.glVertex3f(-1.0f, -1.0f, -1.0f);
            gl.glVertex3f(-1.0f, -1.0f, 1.0f);

            gl.glVertex3f(1.0f, 1.0f, -1.0f);
            gl.glVertex3f(1.0f, 1.0f, 1.0f);
            gl.glVertex3f(1.0f, -1.0f, 1.0f);
            gl.glVertex3f(1.0f, -1.0f, -1.0f);
      gl.glEnd(); //end Cube
      gl.glFlush();
    }
   
    public void mousePressed(MouseEvent e){
        oldMouseX=e.getX();
        oldMouseY=e.getY();
    }
    public void mouseDragged(MouseEvent e){
        int x=e.getX();
        int y=e.getY();
        Dimension size=e.getComponent().getSize();
        float thetaY=360.0f*((float)(x-oldMouseX)/(float)size.width);
        float thetaX=360.0f*((float)(oldMouseY-y)/(float)size.height);
        oldMouseX=x;
        oldMouseY=y;
        view_rotx+=thetaX;
        view_roty+=thetaY;
    }
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) { } 
    public void mouseClicked(MouseEvent e){ }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
}