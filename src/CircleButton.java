import java.util.Random;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


//notice that I say implements actionlistener, this is to say that I will be listening for actions
public class CircleButton extends JApplet implements ActionListener, Runnable  
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton generateOval = new JButton("Create Oval");
	JButton Clear = new JButton("Clear");

	public void init ()
	{
		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );
		screen.add(generateOval);
		screen.add(Clear);

		generateOval.addActionListener(this);
		Clear.addActionListener(this);
	}

	int width = 0;
	int height = 0;

	public void actionPerformed(ActionEvent thisEvent) 
	{
		Object source = thisEvent.getSource();
		if(source == generateOval)
		{
			for(int x = 0; x < 300; x++)
			{
				Graphics g = getGraphics();
				Random rand = new Random();
				height = rand.nextInt(100);
				width = rand.nextInt(100);
				int x1 = rand.nextInt(500);
				int y = rand.nextInt(500);

				g.setColor(findRandomColor());
				g.fillOval(x1, y, width, height);
			}
		}
		if(source == Clear)
		{
			Graphics g = getGraphics();
			super.paint(g);
		}
	}
	public Color findRandomColor(){
		Random rand = new Random();
		int r = rand.nextInt(255);
		int gr = rand.nextInt(255);
		int b = rand.nextInt(255);
		Color random = new Color(r,gr,b);
		return random;
	}
	public void update()
	{
		Graphics g = getGraphics();
		Random rand = new Random();
		height = rand.nextInt(100);
		width = rand.nextInt(100);
		int x1 = rand.nextInt(500);
		int y = rand.nextInt(500);

		g.setColor(findRandomColor());
		g.fillOval(x1, y, width, height);
	 
	}
	 
	 
	/*********************************************************************************************/
	/* BELOW IS FOR ANIMATION.  THE ONLY THING THAT YOU NEED TO CHANGE IS DELAY */
	 
	int frame;
	int delay=0;   // this is the time of the delay in milliseconds.
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


