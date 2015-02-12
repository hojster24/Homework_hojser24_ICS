import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.io.*;
import javax.activation.*;
import javax.imageio.ImageIO;

public class MailStuff extends JFrame implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// instance variables - replace the example below with your own
	private int x;
	//We have 3 swing components that we must declare up here, so every method has access to them
	JTextField textField = new JTextField(20);
	JButton lowerCase= new JButton ("Send");
	JTextField subjectField = new JTextField(40);
	JLabel subjectLabel = new JLabel("Subject:");
	JTextField bodyField = new JTextField(40);
	JLabel bodyLabel = new JLabel("Body:");
	JTextField addressField = new JTextField(40);
	JLabel addressLabel = new JLabel("Address:");
	final JFileChooser fc = new JFileChooser();
	JButton fileChooser = new JButton("Choose File");
	File file = null;

	public void init()
	{
		Container screen = getContentPane();
		screen.setBackground(Color.green);
		screen.setLayout (new FlowLayout() );
		screen.add(subjectLabel);
		screen.add(subjectField);
		screen.add(bodyLabel);
		screen.add(bodyField);
		screen.add(fileChooser);
		screen.add(addressLabel);
		screen.add(addressField);
		screen.add(lowerCase);

		lowerCase.addActionListener(this);
		fileChooser.addActionListener(this);
	}

	/**
	 * Paint method for applet.
	 *
	 * @param  g   the Graphics object for this applet
	 */
	public void paint(Graphics g)
	{
		super.paint(g);
	}

	public void actionPerformed(ActionEvent thisEvent)
	{
		Object source = thisEvent.getSource();

		if (source == fileChooser)
		{
			int returnVal = fc.showOpenDialog(fc);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				file = fc.getSelectedFile();
				//This is where a real application would open the file.	 
			} 
		}
		if (source == lowerCase)
		{          
			String address=addressField.getText();
			String subject=subjectField.getText();
			String body=subjectField.getText();
			sendMail(address, subject ,body, file);
		}	 
	}
	public void sendMail(String to, String subject, String body){
		try{
			final String SMTP_HOST_NAME = "smtp.gmail.com";
			final int SMTP_HOST_PORT = 465;
			final String SMTP_AUTH_USER = "hojster24@gmail.com";
			final String SMTP_AUTH_PWD  = "Thedandy2012";

			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtps");
			props.put("mail.smtps.host", SMTP_HOST_NAME);
			props.put("mail.smtps.auth", "true");

			Session mailSession = Session.getDefaultInstance(props);
			mailSession.setDebug(true);
			Transport transport = mailSession.getTransport();

			MimeMessage message = new MimeMessage(mailSession);
			message.setSubject(subject);
			message.setContent(body, "text/plain");

			message.addRecipient(Message.RecipientType.TO,
					new InternetAddress(to));

			transport.connect
			(SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);

			transport.sendMessage(message,
					message.getRecipients(Message.RecipientType.TO));
			transport.close();
		}
		catch (Exception e){}
	}

	public void sendMail(String to, String subject, String body, File file){
		try{

			final String SMTP_HOST_NAME = "smtp.gmail.com";
			final int SMTP_HOST_PORT = 465;
			final String SMTP_AUTH_USER = "hojster24@gmail.com";
			final String SMTP_AUTH_PWD  = "Thedandy2012";    

			Thread.currentThread().setContextClassLoader( getClass().getClassLoader() );
			Properties props = new Properties();

			props.put("mail.transport.protocol", "smtps");
			props.put("mail.smtps.host", SMTP_HOST_NAME);
			props.put("mail.smtps.auth", "true");

			Session mailSession = Session.getDefaultInstance(props);
			mailSession.setDebug(true);
			Transport transport = mailSession.getTransport();

			/**
			 * multipart attachments here, part one is the message text,
			 * the other is the actual file. notice the explicit mime type
			 * declarations
			 *
			 */
			MimeMessage message = new MimeMessage(mailSession); 
			message.setSubject(subject);
			Multipart multiPart = new MimeMultipart(); 

			MimeBodyPart messageText = new MimeBodyPart(); 
			messageText.setContent(body, "text/html; charset=UTF-8");

			multiPart.addBodyPart(messageText); 

			MimeBodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.attachFile(file);
			messageBodyPart.setHeader("Content-Type", "text/plain; charset=\"us-ascii\"; name=\""+file.getName()+"\"");

			multiPart.addBodyPart(messageBodyPart); 
			message.setContent(multiPart); 

			message.addRecipient(Message.RecipientType.TO,
					new InternetAddress(to));

			transport.connect (SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);
			Thread.currentThread().setContextClassLoader( getClass().getClassLoader() );
			transport.sendMessage(message,
					message.getRecipients(Message.RecipientType.TO));
			transport.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args)
	{
		MailProgram m = new MailProgram();

		m.setSize(520,520);
		//m.setExtendedState (JFrame.MAXIMIZED_BOTH);
		m.setVisible(true);
		m.init();
	}
}