import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


//notice that I say implements actionlistener, this is to say that I will be listening for actions
public class Counting extends JApplet implements ActionListener  
{
	//We have 3 swing components that we must declare up here, so every method has access to them
	JTextField textFieldA = new JTextField(5);
	JButton plusButton = new JButton ("+1");
	JLabel label = new JLabel("Hit the button to increase the number");


	//init is a method that gets called automatically when the applet starts or initializes
	//in init we are adding our swing components to the applet
	public void init()
	{
		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );
		screen.add(label);
		screen.add(plusButton);
		screen.add(textFieldA);
		
		
		//for all components that i want to listen for an action [like a click of button]
		//I add action listener saying Im going to be listening
		plusButton.addActionListener(this);  
	}
	
	int tempInt = 1;
	

	public void actionPerformed(ActionEvent thisEvent)
	{
		Object source = thisEvent.getSource();

		if (source == plusButton)
		{            	
			textFieldA.setText(tempInt+"");
			tempInt++;
		}

	}
}       