import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Random;

public class HenryJones_MouseMovement extends JApplet implements MouseListener, MouseMotionListener,ActionListener 
//Code by Henry Jones (hojster24@gmail.com)
//this code will be a bit late due to a bug i had to fix when i first launched the code this morning, i did 
//do extra swing, and a lot of extra code to get that to work

{  
	JCheckBox colorsButton = new JCheckBox("Colors");
	JTextField booleanState = new JTextField("booleanState");
	
	JCheckBox snowmanButton = new JCheckBox("Snowmen");
	JTextField booleanState2 = new JTextField("booleanState");
	
	JCheckBox circleButton = new JCheckBox("circle");
	JTextField booleanState3 = new JTextField("booleanState");
	
	JCheckBox rainbowButton = new JCheckBox("rainbow");
	JTextField booleanState4 = new JTextField("booleanState");


	Color background = Color.white;
	private static final long serialVersionUID = 1L;

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		Container screen = getContentPane();
		screen.setBackground(background);
		screen.setLayout (new FlowLayout() );
		screen.add(colorsButton);
		screen.add(booleanState);
		screen.add(snowmanButton);
		screen.add(booleanState2);
		screen.add(circleButton);
		screen.add(booleanState3);
		screen.add(rainbowButton);
		screen.add(booleanState4);

		colorsButton.setSelected(false);
		snowmanButton.setSelected(false);
		circleButton.setSelected(false);

		snowmanButton.addActionListener(this);
		colorsButton.addActionListener(this);
		circleButton.addActionListener(this);
		rainbowButton.addActionListener(this);

		booleanState.setText(""+colorsOn);
		booleanState2.setText(""+snowmanOn);
		booleanState3.setText(""+circleOn);
		booleanState4.setText(""+rainbowOn);
	}

	boolean colorsOn = false;
	boolean snowmanOn = false;
	boolean circleOn = false;
	boolean rainbowOn = false;

	int circleX;
	int circleY;
	int snowmanX;
	int snowmanY;
	int rainX;
	int rainY;

	public void paint (Graphics g)
	{
		super.paint(g);  

		if(circleOn == true)
		{
			Random rand = new Random();
			circleX = rand.nextInt(500);
			circleY = rand.nextInt(500);
			g.fillOval(circleX, circleY, 25, 25);
		}
	}

	public double distanceToCenter(int centerX, int centerY, int mouseX, int mouseY)
	{
		int a=centerX-mouseX;
		int b=centerY-mouseY;
		return Math.sqrt(a*a+b*b);
	}

	//when someone presses the mouse button
	public void mousePressed(MouseEvent e)
	{       

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
		if(snowmanOn == true)
		{
			snowmanOn = false;
			snowmanButton.setSelected(false);
			booleanState2.setText(""+snowmanOn);
			repaint();
		}

	}

	//the mouse button is pressed and the mouse makes a significantly large movement
	public void mouseDragged(MouseEvent e)
	{

	}

	//the mouse makes a significantly large movement
	public void mouseMoved(MouseEvent e)
	{
		if(colorsOn == true)
		{
			int r=(e.getX()*255)/getWidth();
			int gr=(e.getY()*255)/getHeight();
			background = new Color(r,gr,100);
			Graphics g = getGraphics();
			//g.setColor(background);
			//g.fillRect(0,0,getWidth(),getHeight());  
			super.paint(g);
			Container screen = getContentPane();
			screen.setBackground(background);
		}
		if(circleOn == true)
		{
			int x = e.getX();
			int y = e.getY();
			if(distanceToCenter(circleX+12,circleY+12,x,y)<20)
			{
				repaint();
			}
		}
		if(snowmanOn == true)
		{
			Graphics g = getGraphics();
			g.clearRect(0,0,getWidth(),getHeight());
			snowmanX = e.getX();
			snowmanY = e.getY();	
			g.fillOval(snowmanX, snowmanY, 20, 20);
			g.fillOval(snowmanX-5, snowmanY+20, 35, 35);
			g.fillOval(snowmanX-10, snowmanY+55, 50, 50);
			
		}
		if(rainbowOn == true)
		{
			
			
			Graphics g = getGraphics();
			
			rainX = e.getX();
			rainY = e.getY();	
			
			g.setColor(Color.red);
			g.fillOval(rainX, rainY+50, 25, 25);
			g.setColor(Color.orange);
			g.fillOval(rainX, rainY+25, 25, 25);
			g.setColor(Color.green);
			g.fillOval(rainX, rainY, 25, 25);
			g.setColor(Color.blue);
			g.fillOval(rainX, rainY-25, 25, 25);
		}
	}

	public void actionPerformed(ActionEvent thisEvent)
	{
		Object source = thisEvent.getSource();

		if(source == colorsButton)
		{
			if (colorsOn == false)
			{
				colorsOn = true;
				booleanState.setText(""+colorsOn);
			}
			else if (colorsOn == true)
			{
				colorsOn = false;
				booleanState.setText(""+colorsOn);
			}
			repaint();
		}
		if(source == circleButton)
		{
			if (circleOn == false)
			{
				circleOn = true;
				booleanState3.setText(""+circleOn);
			}
			else if (circleOn == true)
			{
				circleOn = false;
				booleanState3.setText(""+circleOn);
			}
		}
		if(source == snowmanButton)
		{
			if (snowmanOn == false)
			{
				snowmanOn = true;
				booleanState2.setText(""+snowmanOn);
			}
			else if (snowmanOn == true)
			{
				snowmanOn = false;
				booleanState2.setText(""+snowmanOn);
			}
		}
		if(source == rainbowButton)
		{
			if (rainbowOn == false)
			{
				rainbowOn = true;
				booleanState4.setText(""+rainbowOn);
			}
			else if (rainbowOn == true)
			{
				rainbowOn = false;
				booleanState4.setText(""+rainbowOn);
				repaint();
			}
		}
	}

}