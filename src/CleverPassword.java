import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


//notice that I say implements actionlistener, this is to say that I will be listening for actions
public class CleverPassword extends JApplet implements ActionListener  
{
	//We have 3 swing components that we must declare up here, so every method has access to them
	JTextField textFieldA = new JTextField(20);
	JTextField textFieldB = new JTextField(20);
	JButton cleverPass= new JButton ("Create");
	JLabel label = new JLabel("Create your own Clever password");


	//init is a method that gets called automatically when the applet starts or initializes
	//in init we are adding our swing components to the applet
	public void init()
	{
		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );
		screen.add(label);
		screen.add(textFieldA);
		screen.add(cleverPass);
		screen.add(textFieldB);
	

		//for all components that i want to listen for an action [like a click of button]a
		//I add action listener saying Im going to be listening
		cleverPass.addActionListener(this);  
	}

	public void actionPerformed(ActionEvent thisEvent)
	{
		Object source = thisEvent.getSource();

		if (source == cleverPass)
		{            
			String tempString=textFieldA.getText();
			tempString = tempString.replace("a", "0");
			tempString = tempString.replace("e", "0");
			tempString = tempString.replace("i", "0");
			tempString = tempString.replace("o", "0");
			tempString = tempString.replace("u", "0");
			textFieldB.setText(tempString);
			
		}

	}
}       