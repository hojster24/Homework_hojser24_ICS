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


public class FindXY extends JApplet implements MouseListener, ActionListener 
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
        screen.add(X);
        screen.add(Y);
        addMouseListener(this);
                
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		 X.setText(""+e.getX());
		 Y.setText(""+e.getY());
		
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