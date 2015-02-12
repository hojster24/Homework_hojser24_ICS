import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


//notice that I say implements actionlistener, this is to say that I will be listening for actions
public class PPSDgenerator extends JApplet implements ActionListener  
{
	//We have 3 swing components that we must declare up here, so every method has access to them
	JTextField textFieldA = new JTextField(20);
	JTextField textFieldB = new JTextField(20);
	JTextField emailField = new JTextField(30); 
	JButton ppsdButton= new JButton ("Create");
	JLabel label = new JLabel("Create your own PPSD email address");


	//init is a method that gets called automatically when the applet starts or initializes
	//in init we are adding our swing components to the applet
	public void init()
	{
		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );
		screen.add(label);
		screen.add(textFieldA);
		screen.add(textFieldB);
		screen.add(ppsdButton);
		screen.add(emailField);
		

		//for all components that i want to listen for an action [like a click of button]
		//I add action listener saying Im going to be listening
		ppsdButton.addActionListener(this);  
	}

	String text = "null";
	String firstName = "null";
	String lastName = "null";


	public void actionPerformed(ActionEvent thisEvent)
	{
		Object source = thisEvent.getSource();

		if (source == ppsdButton)
		{            
			firstName = textFieldA.getText();
			lastName = textFieldB.getText();
			String emailAddress = (lastName.substring(0,5) + firstName.charAt(0));
			emailField.setText(emailAddress + "@portlandpublicschools.org");
		}

	}
}       