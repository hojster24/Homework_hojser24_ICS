import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

//By henry jones

public class HWJ6_MethodPractice extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int inputA = 0;
	int inputB = 0;
	String inputC=null;
	int outputC = 0;
	JTextField textFieldA = new JTextField(10);
	JTextField textFieldB = new JTextField(10);
	JTextField textFieldC = new JTextField(10);
	JTextField textFieldD = new JTextField(10);
	JLabel labelA = new JLabel("A");
	JLabel labelB = new JLabel("B");
	JLabel labelC = new JLabel("C");
	JLabel labelD = new JLabel("OutPut");
	JButton defaultButton = new JButton("null");
	
	String[] methods = {"toGrams", "monthDays", "makeWheelOfFortune", "convertToMiles","isEven"};
	JComboBox methodList = new JComboBox(methods);

	public void init()		
	{
		Container screen = getContentPane();
		screen.setBackground(Color.white);
		screen.setLayout (new FlowLayout() );
		screen.add(methodList);
		screen.add(labelA);
		screen.add(textFieldA);
		screen.add(labelB);
		screen.add(textFieldB);
		screen.add(labelC);
		screen.add(textFieldC);
		screen.add(labelD);
		screen.add(textFieldD);
		screen.add(defaultButton);
		
		
		methodList.setSelectedIndex(4);
		methodList.addActionListener(this);
		defaultButton.addActionListener(this);
	}
	public static void main(String[] args)
	{
		HWJ6_MethodPractice m = new HWJ6_MethodPractice();

		m.setSize(160,230);
		//m.setExtendedState (JFrame.MAXIMIZED_BOTH);
		m.setVisible(true);
		m.init();
	}

	//===================================================
	public String toGrams (int inputA, int InputB)
	{
		//Put in pounds for inputA
		//And ounces for inputB
		inputA = Integer.parseInt(textFieldA.getText());
		inputB = Integer.parseInt(textFieldB.getText());
		double ounces = (inputA*16) +inputB;
		double grams = ounces*28.3;
		return new DecimalFormat("##.##").format(grams);
		
	}

	//===================================================
	public int monthDays (String inputC)
	//input a month name to inputC
	{
		inputC = textFieldC.getText();
		int days = 0;
		switch (inputC) {
		case "January":
			days = 31; 
			break;
		case "February": 
			days = 28; 
			break;
		case "March":  
			days = 31; 
			break;
		case "April":
			days = 30; 
			break;
		case "May":
			days = 31; 
			break;
		case "June":
			days = 30; 
			break;
		case "July":
			days = 31; 
			break;
		case "August":
			days = 31; 
			break;
		case "September":
			days = 30; 
			break;
		case "October":
			days = 31; 
			break;
		case "November":
			days = 30; 
			break;
		case "December":
			days = 31; 
			break;
		default: 
			break;
		}
		return days;

	}
	//===================================================

	public boolean isEven (int inputA)
	{
		//input a number for in inputA
		boolean result = false;
		inputA = Integer.parseInt(textFieldA.getText());

		if (inputA%2 == 0)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}

	//===================================================

	public String makeWheelOfFortune (String inputC)
	{
		//input a word into inputC
		inputC = textFieldC.getText();
		String output = inputC.replace("a","_");
		output = output.replace("e","_");
		output = output.replace("i","_");
		output = output.replace("o","_");
		output = output.replace("u","_");
		return output;
	}

	//===================================================

	public String convertToMiles (double inputA)
	{
		//input a number in miles into "A"ss
		inputA = Integer.parseInt(textFieldA.getText());
		double kilometers = inputA*1.6;
		return new DecimalFormat("##.##").format(kilometers);
	}

	//===================================================
	
	public void hideForC()
	{
		textFieldA.setVisible(false);
		textFieldB.setVisible(false);
		textFieldC.setVisible(true);
		labelA.setVisible(false);
		labelB.setVisible(false);
		labelC.setVisible(true);	
	}
	
	public void hideForA()
	{
		textFieldA.setVisible(true);
		textFieldC.setVisible(false);
		textFieldB.setVisible(false);
		labelA.setVisible(true);
		labelC.setVisible(false);
		labelB.setVisible(false);	
	}
	

	public void actionPerformed(ActionEvent thisEvent) 
	{
		Object source = thisEvent.getSource();
		if(source == defaultButton)
		{
			String runMethod = (String)methodList.getSelectedItem();
			switch(runMethod)
			{
			case "makeWheelOfFortune":
				hideForC();
				textFieldD.setText(""+makeWheelOfFortune(inputC));
				break;
			case "convertToMiles":
				hideForA();
				textFieldD.setText(""+convertToMiles(inputA));
				break;
			case "isEven":
				hideForA();
				textFieldD.setText(""+isEven(inputA));
				break;
			case "monthDays":
				hideForC();
				textFieldD.setText(""+monthDays(inputC));
				break;
			case "toGrams":
				textFieldA.setVisible(true);
				textFieldC.setVisible(false);
				textFieldB.setVisible(true);
				labelA.setVisible(true);
				labelC.setVisible(false);
				labelB.setVisible(true);	
				textFieldD.setText(""+toGrams(inputA, inputB));
				break;
					
			}
		}
	}	
}
