import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JTextField;

public class LineDraw extends JApplet implements MouseListener, ActionListener 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init()
	{
		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );
		addMouseListener(this);

	}

	boolean pressed = false;


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pressed = true;
		if(pressed = true){
			for(int i=20;i > 0;i--)
			{
				Graphics g = getGraphics();
				g.setColor(Color.RED);
				g.fillOval(e.getX(),e.getY(),5,5);
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		pressed = false;

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