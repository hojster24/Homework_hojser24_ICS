
import java.util.Scanner;

public class HW3_scanner 
{  
	public void testOfScannerClass()
	{
		//You need to initialize the scanner in order to use it
		Scanner scan=new Scanner(System.in);  
		//test of reading Strings
		System.out.println("Type in a string");
		String theString=scan.nextLine();        
		System.out.println("In case you forgot, you just typed " + theString);

		//test of reading int
		System.out.println("Type in an integer");
		int theInt=scan.nextInt();        
		System.out.println("In case you forgot, you just typed " + theInt);

		//test of reading double
		System.out.println("Type in a decimal");
		double theDouble=scan.nextDouble();        
		System.out.println("In case you forgot, you just typed " + theDouble);                       
	}     

	//Create a method that will ask your name and age and then
	// find how many years older mr borland is then you (im 33)
	//it will spit out Mr Borland is 15 yrs older than Charlie
	public void ageDiff()
	{
		Scanner scan=new Scanner(System.in);  
		int theInt = scan.nextInt();
		int delta = 33 - theInt;
		System.out.println("you are " + delta + " years yonger than mr.Borland");

	}

	//Create a method that will convert meters to centimeters and also inches.
	//It will ask for meters and then print out the number of cms and inches
	public void convertMeters()
	{
		Scanner scan=new Scanner(System.in);  
		System.out.println("input meters");
		double input = scan.nextDouble();
		double centimeters = input*100;
		double inches = input*39.37;
		System.out.println("thats: " +centimeters + " centemeters, or: " + inches + " inches!");
	}

	//Ask for a weight in pounds convert to kilograms.  
	//it would say 180 pounds is 81.6466266 kilograms (convert by pounds*.453592
	public void convertToKilograms()
	{
		//You will need the following line in all methods in order to initialize the scanner.
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class
		System.out.println("input pounds");
		double pounds = scan.nextDouble();
		double kilos = pounds*.453592;
		System.out.println("wow fatty, you're " + kilos + " kilos!, lmao");
		//add your code here        
	} 

	//Ask for a number of feet and convert to meters.
	//So they say  5260 feet
	//it would say 
	//5260 feet is 1603.248 meters (conversion is feet * .3048)
	public void convertToMeters()
	{
		//You will need the following line in all methods in order to initialize the scanner.
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class
		System.out.println("input meeeeters");
		double feet = scan.nextDouble();
		double meters = feet*.453592;
		System.out.println("wow, thats " + meters + " meters!, yay");
		//add your code here        
	} 


	//Ask the user for their dogs name and age.  You will then convert the dogs age in to years by multiplying by 7 and then saying:
	//Your dog Lassie is 42 yrs old.
	public void findDogsAge()
	{
		//You will need the following line in all methods in order to initialize the scanner.
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class
		System.out.println("whats that doggies name?");
		String doggie = scan.nextLine();
		System.out.println("how old is your doggie?");
		int age = scan.nextInt();
		int ageMod = age *7;
		System.out.println("It seems your doggie " + doggie + " is " + ageMod + " doggie years old");

	}   

	//Ask the user for their first and last name and then they will say:
	//Jeff Borland, there are 4 letters in your first name and 7 in your last.
	public void findLettersInName()
	{
		//You will need the following line in all methods in order to initialize the scanner.
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class
		System.out.println("whats your first name?");
		String firstName = scan.nextLine();
		System.out.println("whats your last name?");
		String lastName = scan.nextLine();
		int firstLength = firstName.length();
		int lastLength = lastName.length();
		System.out.println(firstName + " is " + firstLength + " letters long, and " + lastName + " is " + lastLength + " letters long!" );

	} 

	//Ask the user for 2 numbers and spit out the average
	public void findAvg()
	{
		//You will need the following line in all methods in order to initialize the scanner.
		Scanner scan=new Scanner(System.in);
		System.out.println("input a number to be averaged");
		double num1 = scan.nextDouble();
		System.out.println("input a number to be averaged");
		double num2 = scan.nextDouble();
		double num3 = (num1 + num2)/2;
		System.out.println("the result of " +num1+ " and " +num2+ " is " +num3);
		//The Scanner constructor requires the use of the io class

		//add your code here

	} 

	//Ask the user for their height in feet and inches (read both things seperately).
	// Then spit out You are 75 inches tall.
	public void findHeight()
	{
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class
		System.out.println("how tall are you? (feet then inches):");
		int feet = scan.nextInt();
		System.out.println("now inches:");
		int inches = scan.nextInt();
		int total = (feet *12) +inches;
		System.out.println("wow big boy, looks like you're " + total + " inches tall!!");
	}

	//ask for tax rate and price of item and it will display total price
	// ie if item is 50 and tax is 5 (as in 5%), the total price is 52.50.
	public void totalPrice ()
	{
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class
		System.out.println("whats the total?");
		double total = scan.nextDouble();
		System.out.println("whats the taxrate?");
		double taxRate = scan.nextDouble();
		double subTotal = total * (taxRate +1);
		System.out.println("your grand total rests at: " + subTotal);


	}

	//Ask the user for a number of miles for a taxi ride and then ask for
	// cost per mile and pickup cost. 
	//Then spit out total charge (which is #of miles *cost per mile + pickup cost
	public void findTaxiCost()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("how long is the journy in miles?");
		double miles = scan.nextDouble();
		System.out.println("what is the price per mile?");
		double rate = scan.nextDouble();
		System.out.println("...and the pickup cost?");
		double pickupRate = scan.nextDouble();
		double total = pickupRate + (miles * rate);
		System.out.println("bust out the plastic! Cause you're paying: " +total+ "$");

	}

	//This will ask the user for the speed he was going and then spit out
	//the cost of a ticket (from 0-65 - $0, 66-74 - $85, 75-100 - $200 101+ - $1000
	public void findTicket()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("sir... how fast were you going back there?");
		double speed = scan.nextDouble();
		if (speed <= 65) {
			System.out.println("lucky bastard, enjoy your takeout");
		} else if (speed < 74) {
			System.out.println("you owe $85 to the LAW");
		} else if (speed < 100) {
			System.out.println("you owe $200 to the LAW");
		} else if (speed > 100) {
			System.out.println("you owe $1000 to the LAW");	
		}
	}

	//This will find out the number of people who dressed up for spirit week
	//Ask the user 5 times (for each day) how many people dressed up [like how many people dressed up on day1? etc]
	//Then spit out the total
	//you must use a for loop
	public void find5DayTotal()
	{
		Scanner scan=new Scanner(System.in);
		int total = 0;
		for(int day = 1; day <= 5; day++)
		{
			System.out.println("how many people dressed up for spirit week on day"+day+"?!");
			System.out.print("The ");
			System.out.print("Good ");
			System.out.println("Dog ");
			System.out.println(" Died");
			int numberDressedUp = scan.nextInt();
			total = (total + numberDressedUp);
		}
		System.out.println(total);
		
	}

	//This will ask the user how many games they played, then it will find the winning percent 
	//So the user might say 3, and the program will ask them 3 times if they won
	//So they might say y,n,n and then it will spit out you won 33.3% of the time
	public void findWinningPrct()
	{
	}

	//create a method that will keep asking for a grade until the user hits -1.  They will then
	//find the average of those grades
	// you will need to use loops
	public void findAverage()
	{
		int counter = 0;
		for(int x = 5; x < 0; x = x-1);
		{
			counter = counter+1;
			System.out.println("test"+ counter);
		}
	}



	public static void main (String ars[])
	{
		HW3_scanner p=new HW3_scanner();
		p.find5DayTotal();
	}



}    
