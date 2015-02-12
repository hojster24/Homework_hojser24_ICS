import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseMovement extends JApplet implements MouseListener, MouseMotionListener,ActionListener 
//Incomplete code by Henry Jones
//Most Components Function, Just not the colors + the button

{  
	JCheckBox colorsButton = new JCheckBox("Colors");
	JTextField booleanState = new JTextField("booleanState");
	JCheckBox snowmanButton = new JCheckBox("Snowmen");
	JTextField booleanState2 = new JTextField("booleanState");
	Color background = Color.blue;
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
		
		colorsButton.setSelected(false);
		snowmanButton.setSelected(false);
		
		snowmanButton.addActionListener(this);
		colorsButton.addActionListener(this);		
		
		booleanState.setText(""+colorsOn);
		booleanState2.setText(""+snowmanOn);
	}

	boolean colorsOn = false;
	boolean snowmanOn = false;

	public void paint (Graphics g)
	{
		super.paint(g);  
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
			background= new Color(r,gr,100);
			Graphics g = getGraphics();
			super.paint(g);
			
		}
		if(snowmanOn == true)
		{
			
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
	}

}