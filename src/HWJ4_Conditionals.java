/*
 * This is HWJ4 - Practice with conditions (If / Else statements)
 * @author Jeff Borland
 * @date 10-2-12
 */

import java.util.Scanner;
public class HWJ4_Conditionals
{

	//Spit out high school, middle school, elementary
	public void findSchoolTerm (int grade)
	{
		if (grade >= 9){
			System.out.println("you are in high school");
		} else if (grade >= 6){
			System.out.println("you are in middle school");
		} else {
			System.out.println("scrub");
		}

	}

	//Spit out cost of item, items accepted: hat - $4.00, shirt - $5, pin - $1
	// otherwise unknown
	public void findCost (String item)
	{
		if(item == "hat")
			System.out.println("that'll be $4.00");
		if(item == "shirt")
			System.out.println("that'll be $5.00");
		if(item == "pin")
			System.out.println("that'll be $1.00");


	}    

	//Find persons letter grade (<70 F ,70-77 D, 78-84 C, 85-92 B, 93+ A)
	public void findLetterGrade (int numberGrade)
	{
		if(numberGrade >=93)
			System.out.println("you've got an A!!");
		else if(numberGrade >=85)
			System.out.println("you've got a B");
		else if(numberGrade >=78)
			System.out.println("you've got a C");
		else if(numberGrade >=70)
			System.out.println("you've got a D");
		else
			System.out.println("annnnd.. YOU FAIL");
	}

	//IQ range; using scanner as for their  (generally between 50-200) if  they are below 82 say they are dull or worse
	// if they are between 82-116 -say average
	//117-152 above average

	public void IQrater()
	{
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class  
		System.out.println("whats you're IQ?");
		int iQ = scan.nextInt();
		if(iQ >= 153)
			System.out.println("youre a genuis!");
		else if(iQ >= 117)
			System.out.println("youre above average!!!");
		else if(iQ >= 82)
			System.out.println("nothing special, move along");
		else
			System.out.println("dumbass");

	}


	//To check strings if (job.equals("manager"))
	public void payRate (String job)
	{
		if(job.equals("boss"))
			System.out.println("it is decreed, you shall be payed $23/hour");
		else if(job.equals("manager"))
			System.out.println("it is decreed, you shall be payed $11/hour");
		else if(job.equals("worker"))
			System.out.println("HAHAHAHA, almost minimum, enjoy $7/hour");	
		else
			System.out.println("go away");

	}

	//The method below will ask the user for three numbers (using scanner), then it will say those numbers were in order
	// from lowest to greatest, or it will say they 
	public void isInOrder()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please input three numbers");
		int int1 = scan.nextInt();
		System.out.println(int1);
		int int2 = scan.nextInt();
		System.out.println(int2);
		int int3 = scan.nextInt();
		System.out.println(int3);
		if(int1 >= int2)
			System.out.println("not in order");
		else if(int2 >= int3)
			System.out.println("not in order");
		else
			System.out.println("in order");

	}

	//The method will say if there were any doubles or triples
	//[doubles are two of the same numbers][triples are three of the same]
	// so if they put in 3 5 and 3 it would say doubles
	public void anyDoubles(int x, int y, int z)
	{
	}   

	//This will ask the user how tall they are in inches(using scanner) and then
	// if they are 6 or taller, say they are tall,
	// if they are between 5'9 - 6' they are normal
	// if they are shorter than 5' 9 than they are short  
	public void isTall()
	{
		Scanner scan=new Scanner(System.in);  //The Scanner constructor requires the use of the io class   
		System.out.println("how tall are you in feet?");
		int heightFT = scan.nextInt();
		System.out.println("inches?");
		int heightIN = scan.nextInt();

		if(heightFT >= 6)
		{
			System.out.println("you are tall");
		} 
		else if(heightFT < 6 && heightIN >= 9) 
		{
			System.out.println("you're normal");

		} 
		else if(heightFT < 6 && heightIN <9)
		{
			System.out.println("need help reaching that?");
		}
	}

	//lessBy10(1, 7, 11) ? true
	//lessBy10(1, 7, 10) ? false
	//lessBy10(11, 1, 7) ? true
	public void lessBy10(int a, int b, int c) {
		boolean isLess = false;
		if(a-b<a-10){
			isLess = true;
		}
		if(a-c<a-10){
			isLess = true;
		}
		if(b-a<b-10){
			isLess = true;
		}
		if(b-c<b-10){
			isLess = true;
		}
		if(c-a<c-10){
			isLess = true;
		}
		if(c-b<c-10){
			isLess = true;
		}
		System.out.println(isLess);
	}

	//This method will take in an email address and if it looks valid it will say valid, otherwise it will say invalid valid  have @ and a . 
	//See how strong you can make your checker (see if you can add extra checks)
	public void checkEmail () {
		Scanner scan=new Scanner(System.in);
		String address = scan.nextLine();
		boolean isTrue = false;
		if(address.contains("@")){
			int where = address.indexOf("a");
			String word1 = address.substring(where);

			if(word1.contains("."))
			{
				isTrue = true;
			} 
			else 
			{ 
				isTrue = false;
			}
		}
		else
		{
			isTrue = false;
		}
		System.out.println(isTrue);
	}




	/*The number 6 is a truly great number. Given two  values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs() computes the absolute
  	value of a number. 
  	love6(6, 4) ? true
  	love6(4, 5) ? false
  	love6(1, 5) ? true  */
	public void love6(int a, int b) {

	}

	public static void main (String ars[])
	{
		HWJ4_Conditionals p=new HWJ4_Conditionals();
		p.checkEmail();
	}


}      