/*
 * Test class to practice mouse movement by drawing a circle where the cursor is.
 *
 * @author Jeff Borland
 * @version 1.13
 */

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;

public class HWJ12_Keys extends JApplet implements MouseListener, MouseMotionListener,ActionListener,KeyListener,ChangeListener 
{ 

	Point square1 = new Point(250,250);
	JTextField arrowField=new JTextField(10);
	JSlider speedSlider = new JSlider(0,100);
	Color background;
	Color shapeColor;
	int speed;

	public void init()
	{
		Graphics g = getGraphics();

		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		setFocusable(true);
		Container screen = getContentPane();
		screen.setLayout (new FlowLayout() );
		screen.setBackground(background);
		screen.add(arrowField);
		screen.add(speedSlider);


		speedSlider.setSnapToTicks(false);
		speedSlider.setMajorTickSpacing(10);
		speedSlider.setPaintTicks(true);
		speedSlider.setPaintLabels(true);
		speedSlider.addChangeListener(this);

	}
	public void paint (Graphics g)
	{
		super.paint(g); 
		g.setColor(shapeColor);
		g.fillRect(square1.x, square1.y, 50,50);
	}
	public void keyPressed(KeyEvent e)
	{

		int theCode=e.getKeyCode();

		//Direction Controls

		if(theCode == KeyEvent.VK_LEFT)
		{
			arrowField.setText("left"); 
			square1.x = square1.x - speed;
		}
		if(theCode == KeyEvent.VK_RIGHT)
		{
			arrowField.setText("right");
			square1.x = square1.x + speed;
		}
		if(theCode == KeyEvent.VK_UP)
		{
			arrowField.setText("up"); 
			square1.y = square1.y - speed;
		}
		if(theCode == KeyEvent.VK_DOWN)
		{
			arrowField.setText("down"); 
			square1.y = square1.y + speed;
		}

		//Edge controls bring the square back into view

		if(square1.x <= 0)
		{
			square1.x = getWidth()-1;
		}
		if(square1.x >= getWidth())
		{
			square1.x = 1;
		}
		if(square1.y <= 0)
		{
			square1.y = getHeight()-1;
		}
		if(square1.y >= getHeight())
		{
			square1.y = 1;
		}

		//Color controls, not necessary 

		int r=(square1.x*255)/getHeight();
		int gr=(square1.y*255)/getHeight();
		background = new Color(r,gr,100);
		repaint();
		Container screen = getContentPane();
		screen.setBackground(background);
		int r1=(square1.x*255)/getHeight();
		int gr1=(square1.y*255)/getHeight();
		shapeColor = new Color(r1, gr1, 250);
	}
	public void keyReleased(KeyEvent e)
	{   
	}
	public void keyTyped(KeyEvent e)
	{     
	}
	public void mousePressed(MouseEvent e)
	{      

	}
	public void mouseReleased(MouseEvent e)
	{      

	}
	public void mouseEntered(MouseEvent e)
	{      

	}
	public void mouseExited(MouseEvent e)
	{      

	}
	public void mouseClicked(MouseEvent e)
	{
		requestFocus(); //this bring the focus make to the main progra

	}
	public void mouseDragged(MouseEvent e)
	{

	}
	public void mouseMoved(MouseEvent e)
	{
	}
	public void actionPerformed(ActionEvent thisEvent)
	{
		Object source = thisEvent.getSource();

	}
	public void stateChanged(ChangeEvent e)
	{
		Object source = (JSlider)e.getSource();
		if (source == speedSlider)
		{  
			speed = speedSlider.getValue();
		}
	}
	public int findRandom (int min, int max)
	{
		int random = (int) (Math.random()*(max-min+1))+min;
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
}