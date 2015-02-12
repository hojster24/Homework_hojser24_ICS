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


public class RectangleDraw  extends JApplet implements MouseListener, ActionListener 
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
	}

	@Override
	public void mousePressed(MouseEvent e) {
		

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Graphics g = getGraphics();

		g.setColor(findRandomColor());
		
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

