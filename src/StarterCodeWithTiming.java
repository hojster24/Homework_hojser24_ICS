import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.event.ChangeListener;


public class StarterCodeWithTiming extends JApplet implements MouseListener, MouseMotionListener,KeyListener,Runnable
{
	Random rand = new Random(); 
	int ballX = rand.nextInt(500);
	int ballY = rand.nextInt(500);
	int changeInX = rand.nextInt(10);
	int changeInY = rand.nextInt(10);

    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        setFocusable(true);

        Container screen = getContentPane();
        screen.setBackground(Color.white);
        screen.setLayout (new FlowLayout() );

    }

    public void paint (Graphics g)
    {
        super.paint(g);
        g.fillOval(ballX,ballY, 25,25);
    }

    //Update (the method below) gets called every frame 
    public void update()
    {
        ballX = ballX + changeInX;
        ballY = ballY + changeInY;
        repaint();
        if(ballX>=getWidth()||ballX<=0)
        {
        	changeInX=-changeInX;
        }
        if(ballY>=getWidth()||ballY<=0)
        {
        	changeInY=-changeInY;
        }

    }

    //This is the method that will be called if a key is pressed
    //It is neccessary if you are using getKeyCode()
    public void keyPressed(KeyEvent e)
    {
        char theChar=e.getKeyChar();
        int theCode=e.getKeyCode();       
    }

    //This is the method that will be called if a key is released
    //It is unneccessary to use this method, but you must include it
    public void keyReleased(KeyEvent e)
    {  
    }

    //This is the method that will be called if a key is typed, however you cant use getKeyCode, so
    // you are better to use keyPressed
    public void keyTyped(KeyEvent e)
    {    
    }

    //when someone presses the mouse button
    public void mousePressed(MouseEvent e)
    {     
        int x=e.getX();
        int y=e.getY();
    }

    //when someone releases the mouse button
    public void mouseReleased(MouseEvent e)
    {     

    }

    // when the mouse enters the applet
    public void mouseEntered(MouseEvent e)
    {     

    }

    //when the mouse leaves the applet
    public void mouseExited(MouseEvent e)
    {     

    }

    //when the mouse button is clicked
    public void mouseClicked(MouseEvent e)
    {
        requestFocus(); //this bring the focus make to the main progra

    }

    //the mouse button is pressed and the mouse makes a significantly large movement
    public void mouseDragged(MouseEvent e)
    {

    }

    //the mouse makes a significantly large movement
    public void mouseMoved(MouseEvent e)
    {
    }

    public void actionPerformed(ActionEvent thisEvent)
    {
        Object source = thisEvent.getSource();
        /* Uncomment below for actions
        if (source == testButton)
        {

        }
         */ 
    }

    public int findRandom (int start, int end)
    {
        int multiplier = end-start+1;
        int random = (int) (Math.random()*multiplier)+start;
        return random;
    }

    public Color findRandomColor ()
    {
        int red= (int)(256 * Math.random());
        int green= (int)(256 * Math.random());
        int blue= (int)(256 * Math.random());
        Color randomColor=new Color(red,green,blue);
        return randomColor;
    } 

    /*********************************************************************************************/
    /* BELOW IS FOR ANIMATION.  THE ONLY THING THAT YOU NEED TO CHANGE IS DELAY */

    int frame;
    int delay=50;   // this is the time of the delay in milliseconds.
    Thread animator;

    /**
     * This method is called when the applet becomes visible on
     * the screen. Create a thread and start it.
     */
    public void start()
    {
        animator = new Thread(this);
        animator.start();
    }

    /**
     * This method is called by the thread that was created in
     * the start method. It does the main animation.
     */
    public void run()
    {
        // Remember the starting time
        long tm = System.currentTimeMillis();
        while (Thread.currentThread() == animator)
        {
            // Display the next frame of animation.
            update();
            try
            {
                tm += delay;
                Thread.sleep(Math.max(0, tm - System.currentTimeMillis()));
            }
            catch (InterruptedException e)
            {
                break;
            }
            // Advance the frame
            frame++;
        }
    }

    /**
     * This method is called when the applet is no longer
     * visible. Set the animator variable to null so that the
     * thread will exit before displaying the next frame.
     */
    public void stop()
    {
        animator = null;
    }

}