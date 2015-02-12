import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;


public class DrawCircle extends JApplet implements MouseListener, ActionListener 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField X = new JTextField(10);
	JTextField Y = new JTextField(10);

	public void init()
    {
        Container screen = getContentPane();
        screen.setBackground(Color.white);
        screen.setLayout (new FlowLayout() );
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

	@Override
	public void mouseClicked(MouseEvent e) {
		Random rand = new Random();
		int height = 30;
		int width = 30;
		int x=e.getX();
		int y=e.getY();
		Graphics g = getGraphics();
		
		g.setColor(findRandomColor());
		g.fillOval(x-(width/2),y-(height/2),height,width);   		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
