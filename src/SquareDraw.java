import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Random;
 
public class SquareDraw extends JApplet implements MouseListener,ActionListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField squareSize = new JTextField("squaresize");
    JLabel squareSizeLabel = new JLabel("Input Size");
    
    public void init()
    {
        Container screen = getContentPane();
        screen.setBackground(Color.white);
        screen.setLayout (new FlowLayout() );
        screen.add(squareSizeLabel);
        screen.add(squareSize);
        squareSize.setText("50");
        addMouseListener(this);
                
    }
    
    public Color findRandomColor(){
		Random rand = new Random();
		int r = rand.nextInt(255);
		int gr = rand.nextInt(255);
		int b = rand.nextInt(255);
		Color random = new Color(r,gr,b);
		return random;
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
        int x=e.getX();
        int y=e.getY();
        int width = Integer.parseInt(squareSize.getText());  		
        Graphics g = getGraphics();
        g.setColor(findRandomColor());
        g.fillRect(x-(width/2),y-(width/2),width, width);   
    }
 
    public void actionPerformed(ActionEvent thisEvent)
    {
        @SuppressWarnings("unused")
		Object source = thisEvent.getSource();
 
        //now have if statements seeing finding out where the action occured
 
    }
}