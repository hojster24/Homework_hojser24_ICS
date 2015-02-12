import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
import java.text.DecimalFormat;

public class bmiCalculator extends JApplet implements ActionListener, ChangeListener
{

	
	/* Code by Henry Jones, for into to Java  at DHS, completed 10/23/14 */
	
					/*============
					BMI CALCULATOR
					=============*/
	
	
	//These are the TEXT FIELDS

	private static final long serialVersionUID = 1L;
	JTextField feetBox = new JTextField(5);
	JTextField inchesBox = new JTextField(5);
	JTextField output = new JTextField(5);

	//These are the BUTTONS,SLIDERS, ETC.

	JButton calculateButton = new JButton ("Calculate");
	JSlider feetSlider = new JSlider(0,10);	
	JSlider inchesSlider = new JSlider(0,12);	
	JSpinner spinner = new JSpinner(); 
	JPanel panel = new JPanel();

	//These are the LABELS

	JLabel label = new JLabel("Use This Calculator to Find Your BMI");
	JLabel info = new JLabel("Input your Height and Weight");
	JLabel label2 = new JLabel("");
	JLabel weightLabel = new JLabel("Weight(lb):");
	JLabel bmiText = new JLabel("Your BMI is:");
	JLabel textOut = new JLabel("");

	public void init()
	{
		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );

		//Added elements 

		screen.add(label);
		screen.add(info);
		screen.add(label2);
		screen.add(feetSlider);
		screen.add(feetBox);
		screen.add(label2);
		screen.add(inchesSlider);
		screen.add(inchesBox);
		screen.add(weightLabel);
		screen.add(spinner);
		screen.add(calculateButton);
		screen.add(bmiText);
		screen.add(textOut);
		screen.add(output);

		JComponent field = ((JSpinner.DefaultEditor) spinner.getEditor());
		Dimension prefSize = field.getPreferredSize();
		prefSize = new Dimension(40, prefSize.width);
		field.setPreferredSize(prefSize);

		spinner.setValue(150);

		inchesSlider.setSnapToTicks(true);
		inchesSlider.setMajorTickSpacing(1);
		inchesSlider.setPaintTicks(true);
		inchesSlider.setPaintLabels(true);

		feetSlider.setSnapToTicks(true);
		feetSlider.setMajorTickSpacing(1);
		feetSlider.setPaintTicks(true);
		feetSlider.setPaintLabels(true);

		inchesSlider.addChangeListener(this);
		feetSlider.addChangeListener(this);
		calculateButton.addActionListener(this);
		feetBox.setText("feet");
		inchesBox.setText("inches");
	}

	int bmi = 0;

	public void actionPerformed(ActionEvent thisEvent)
	{
		Object source = thisEvent.getSource();
		if (source == calculateButton)
		{     
			output.setText("");
			int inchesTemp = Integer.parseInt( inchesBox.getText());
			int feetTemp = Integer.parseInt( feetBox.getText());
			double inchesConverted = (feetTemp*12) + inchesTemp;
			double inchesSquared = inchesConverted * inchesConverted;
			double weight = (Integer)spinner.getValue();
			double bmi = (weight/inchesSquared)*703;
			output.setText(new DecimalFormat("##.##").format(bmi));
			
			if(bmi <= 18 && bmi >=0)
			{
				textOut.setText("You're underweight");
			} 
			else if(bmi <= 25) 
			{
				textOut.setText("You're Healthy");
			}
			else if(bmi <= 30)
			{
				textOut.setText("You're Overweight");
			}
			else
			{
				textOut.setText("You're obese");
			}
		}
	}

	public void stateChanged(ChangeEvent e)
	{
		Object source = (JSlider)e.getSource();
		if (source == feetSlider)
		{  
			int f = feetSlider.getValue();
			feetBox.setText(""+f);
		}
		if (source == inchesSlider)
		{
			int i = inchesSlider.getValue();
			inchesBox.setText(""+ i);
		}
	}
}
