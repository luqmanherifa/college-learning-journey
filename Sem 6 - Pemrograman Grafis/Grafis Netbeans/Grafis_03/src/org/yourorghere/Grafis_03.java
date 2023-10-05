package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * Grafis_03.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Grafis_03 implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Grafis_03());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
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

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
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
	  
	        // Clear the drawing area  
	        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);  
	        // Reset the current matrix to the "identity"  
	        gl.glLoadIdentity();  
	  
	        // Move the "drawing cursor" around  
	        gl.glTranslatef(-1.5f, 0.0f, -6.0f);  
	          
	        double x1,y1,x2,y2;  
	        double PI = 3.14;  
	        double twoPI = 2 * PI;  
	        double radius = 181;  
	  
	        x1 = 0;  
	        y1 = 0;  
	        gl.glColor3f(0.5f, 0.78f, 0.1f);  
	  
	        gl.glBegin(GL.GL_TRIANGLE_FAN);  
	            for (double i = PI; i <= twoPI; i += 0.001)  
	            {  
	                x2 = y1*radius+cos(i);  
	                y2 = x1*radius+sin(i);  
	                  
	                gl.glVertex2d(-x2,-y2);  
	            }  
	  
	        gl.glEnd();  
	  
	        // Flush all drawing operations to the graphics card  
	        gl.glFlush();  
	    }  
	  
	    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {  
	    }  
	}