import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.image.*;
import java.util.Random;

public class HWJ14_BallDrop extends JApplet implements MouseListener, MouseMotionListener,ActionListener,KeyListener,Runnable
{

	BufferedImage offScreen;
	JTextField j=new JTextField(5);
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		setFocusable(true);

		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );
		screen.add(j);
		//below is for our offscreen buffer image.  Make it as large 
		offScreen = new BufferedImage(2000, 2000, BufferedImage.TYPE_INT_RGB);     
	}

	public void paint (Graphics g)
	{
		g.drawImage(offScreen,0,0,this);
	}

	int ballX = 250;
	int ballY = 10;
	int changeY = 5;
	int speedMod = 1;
	int changeX = 0;
	boolean togglePH = true;
	public void update()
	{
		Random rand = new Random();
		ballX = ballX + changeX;
		ballY = ballY + changeY;
		changeY = changeY + speedMod;
		Graphics g=getGraphics();      
		Graphics oG=offScreen.getGraphics();
		super.paint(oG); 
		oG.setColor(Color.black); 
		oG.fillOval(ballX,ballY,20,20);
		g.drawImage(offScreen,0,0,this); 
		if(ballX>=getWidth()||ballX<=0)
		{
			changeX = -changeX;  
		}
		if(ballY>=getWidth())
		{
			changeY=-changeY+speedMod;
			speedMod++;
			changeX = rand.nextInt(20)-10;
			if(speedMod == 8)
			{
				ballX = 250;
				ballY = 10;
				changeY = 5;
				speedMod = 1;
				changeX = 0;
				
			}
		}
		System.out.println("ballY: "+ballY+ " changeY: "+changeY+" speedMod: "+speedMod);


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