/** This is the shell of code to practice with variables
 *
 * @author J. Borland
 * @version 9-29-14
 **/
 
public class PracticeVariables 
{
    //This method is to allow you to practice printing
    public void practicePrinting()
    {
    System.out.print("i didnt get any sleep last night");
    }
 
    //This method is to practice with variables
    public void practiceVariables()
    {
    	int total=25;
    	System.out.print("The total is " + total);
    }
 
    //This method is to practice with methods with one parameter
    public void findSquare(int x)
    {
    	int square = x * x;
        System.out.println("The square is " + square);
    }
 
    //This method below is to practice with methods with parameters
    //You need to multiply the 2 numbers and print the product (nicely)
    public void multiplyNumbers (int x, int y)
    {
        int z = x * y;
    	System.out.println("the product of " + x + " and " + y + " equals " +z);
    }
 
    //This method below is to find the next 2 numbers and print them out.
    public void findNextNums (int x)
    {
        int y = x+1;
        int z = x+2;
        	
    	System.out.println("the numbers are " + x + " " + y + " " + z);
    }
 
    //This method below is to change some amount of money from US to Canadian
    //Currently the exchange rate is 1 US dollar = 1.0505 Canadian dollars
    //So 8 us dollars = 8*1.0505   
    public void changeToCanadian (double usCurrency)
    {
        double x = usCurrency*1.0505;
    	System.out.println("your fat stacks, are even fatter in canada, you have $" + x + "!!");
    }
 
    //This method below is to change some amount of money from Canadian to US
    //Currently the exchange rate is 1 US dollar = 1.0505 Canadian dollars
    //So 8 can dollars = 8/1.0505
    public void changeToUS (double canCurrency)
    {
    	double x = canCurrency/1.0505;
    	System.out.println("your fat stacks, are even fatter in canada, you have $" + x + "!!");
    }
 
    //This method will find the circumference given the radius and output that to screen
    public void findCircumference(int radius)
    {
        double x = radius*2*3.14;
    	System.out.println("the circumfrence is: " + x);
    }
 
    //This method finds the average of 2 numbers - careful.
    public void findAverage(int number1, int number2)
    {
        int x = number1 + number2;
        double y = x/2.0;
    	System.out.println("The average is: " + y);       
    }   
 
    //Convert the celsius to fahr -  F=9/5C+32
    public void findFahr(double celsius)
    {
        double fahr = (9/5.0)*celsius+32;
    	System.out.println("Its: " + fahr + " degrees.");       
    }      
 
    //Convert the fahrenheit to celsius -  C= 5/9 (F-32)
    public void findCelsius(double fahrenheit)
    {
        double celsius = 5/9.0*(fahrenheit - 32);
    	System.out.println("Its: " + celsius + " degrees.");       
    }          
    //*********************************************************************************************************//
    //ALL BELOW Extra credit (required for those taking AP and other hot shots)
    //*********************************************************************************************************//
    //Use the quad formula to find both roots and print them out.
    //Look up quad formula if you forgot it.
    //To do square root, its Math.sqrt(the number)
    //For example double theSqRtOf25 = Math.sqrt(5); 
    public void findRoots(int a, int b, int c)
    {
        System.out.println("The code for this method needs to be added.");
    }
 
    //Find the total cost of an item below if tax rate is 5% like in Maine
    //So if the price was 100 it might say:
    //The tax is $5 and the total is $105
    public void findTax(double price)
    {
        double tax = price*1.05;
    	System.out.println("the grand total is: $" + tax);
    }  
 
    //Find the total cost of an item below given a price and tax rate
    //So if the price was 100 and the tax rate was 7% it might say:
    //The tax is $7 and the total is $107
    public void findTax(double price, double taxRate)
    {
    	double total = price*(taxRate+1);
    	System.out.println("the grand total is: $" + total);
    }        
 
    //*********************************************************************************************************//
    //Super Advanced - you will need loops, look them up.
    //*********************************************************************************************************//
    //Finds the least common multiple of x and y
    public void findLCM(int x, int y)
    {
        System.out.println("The code for this method needs to be added.");
    }      
    public static void main (String ars[])
    {
    	PracticeVariables p=new PracticeVariables();
    	p.findTax(100,.07);
    }
    
}