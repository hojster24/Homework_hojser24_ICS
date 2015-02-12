/**
 * HW Exercises to practice with loops
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class HWJ5_Loops
{
	//create a loop that will print I love Hani 50 times
	public void printHaniFor() 
	{
		for(int x=1;x<=50;x++){
			System.out.println("I love hani!!");
		}
	}

	//create a loop that will print Dont eat by the computer James 50 times
	public void printJamesWhile() 
	{
		int x = 1;
		while(x<=50){
			System.out.println("dont eat that computer" +x);
			x++;
		}

	}

	//that will print the numbers from 1 to max on one line like 1,2,3,4,5,6,7,....,150 [if max was 150] (note: no comma at end)
	public void printNumbers(int max)
	{
		int x = 1;
		while (x < max){ 
			System.out.print(x + ", ");
			x++;
		}
		System.out.print(max);
	}

	//that will print the odd numbers from start to end; assume start is odd. 
	public void printOdds(int start, int end) 
	{
		int i = start;
		while(i <= end){
			System.out.println(i);
			i = i + 2;
		}
	}

	//that will insult the user and then say do you want another insult (y or n) 
	//if they say y it will repeat, if they so n it will end. [advanced - have it choose from 1 of 5 insults randomly]
	public void insultUser() 
	{
		String trueFalse = "y";
		Scanner scan=new Scanner(System.in); 
		while(trueFalse.contains("y")){
			int randomValue = (int)(5 * Math.random()+1);
			System.out.println(randomValue);
			switch (randomValue) {
			case 1: randomValue = 1; 
			System.out.println("you're funny.. looking");
			System.out.println("would you like another? (y/n)");
			trueFalse = scan.nextLine();
			break;
			case 2:  randomValue = 2;
			System.out.println("Ha that shirt is stupid");
			System.out.println("would you like another? (y/n)");
			trueFalse = scan.nextLine();
			break;
			case 3: randomValue = 3; 
			System.out.println("you look scrappier than jim");
			System.out.println("would you like another? (y/n)");
			trueFalse = scan.nextLine();
			break;
			case 4:  randomValue = 4; 
			System.out.println("eat a big old bag of... JELLYBEANS");
			System.out.println("would you like another? (y/n)");
			trueFalse = scan.nextLine();
			break;
			case 5:  randomValue = 5; 
			System.out.println("you should just go to school! ha!");
			System.out.println("would you like another? (y/n)");
			trueFalse = scan.nextLine();
			break;
			}

		}
		System.out.println("thats okay, i never really liked you");
	}

	//Create a method that will countDown from 10 and then say takeoff
	public void countDown()
	{
		String trueFalse = "null";
		Scanner scan=new Scanner(System.in);
		System.out.println("prepare for liftoff.. ignite? (y/n)");
		trueFalse = scan.nextLine();
		int i = 10;
		while(trueFalse.contains("y")){
			if(i > 0){
				System.out.println("T-" +i+ " seconds");
				i--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else 
				trueFalse = "n";
		}
		System.out.println("Liftoff");

	}

	/*
	 * this method will print out all the multiples of 11 up to 1000
	 * 11,22,33, so
	 */ 
	public void multiplesOf11()
	{
		int printNum = 11;
		int multiple = 1;
		while(printNum<=1000){
			System.out.println(printNum);
			printNum = 11*multiple; 
			multiple++;
		}
		System.out.println("finished");

	}

	/*
	 * Using the scanner class, ask the user to say my name (borland)
	 * if they say anything but borland, say thats not my name, say my name!
	 * and repeat this until they say my name.
	 * [you can of course change it to your name]
	 * for high flyers, see if you can come up w/ a way that case doesnt matter [look at api]
	 */
	public void sayMyName()
	{
		Scanner scan=new Scanner(System.in);
		String trueAnswer = "borland";
		System.out.println("Whats the teachers name?");
		String userAnswer = scan.nextLine();

		while(!userAnswer.equals(trueAnswer)){
			System.out.println("try again");
			userAnswer = scan.nextLine(); 
		}
		System.out.print("good job");
	}


	/*
	 * this method will add all the numbers between (and including
	 * firstNum and endNum
	 * if they put in 5,10 it would add 5,6,7,8,9,10 =45
	 * int sum=0;
	 * for (start at startNum go to endNum, increment one each time)
	 *       sum=sum+i;
	 */ 
	public void firstToLastNum(int firstNum, int endNum)
	{
		int total=0;
		for(int i = firstNum; i<=endNum; i++){
			total = total+i;
		}
		System.out.println(total);
		System.out.println("Done!");
	}

	/*
	 * this method will start at startNum and print 20 numbers more than startNum
	 * then when it hits startNum+20 it will count down to startNum
	 * for example you say put in 50 it will print 51 52 53...68 69 70 then 70 69... 52 51 50
	 * 2 for loops   1 loop going up , one loop going down.
	 * */ 

	public void findAvg()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("how many numbers would you like to average?");
		int input =0;
		int total =0;
		int avgGroup = scan.nextInt();
		for(int i=1; i <= avgGroup; i++)
		{

			System.out.println("please input number " + i);
			input = scan.nextInt();
			total = total + input;
		} 	 
		System.out.print((total/avgGroup));
	}

	/*
	 * Using the scanner class, ask the user how many numbers you want him
	 * to average.
	 * Then read in that many of numbers and spit out average
	 */
	public void upDownNumbers(int startNum)
	{
		boolean toggle = false;
		if(toggle = false){
			for(int i=1; i <= 20; i++)
			{
				System.out.println(startNum + i);
			}
			toggle = true;
		} else {
			for(int i=20; i >= 0; i--)
			{
				System.out.println(startNum + i);
			}
		}


	}
	/*********************************************************************************************************************/
	// Advanced below - there are six, advanced must do/really try between 1-6 [depending on your level]
	/*********************************************************************************************************************/
	/*
	 * this method will print * then ** then *** for 10 rows
	 *    so it would look like *
	 *    so it would look like **
	 *    so it would look like ***  and so on     
	 */
	public void printStars()
	{
		String stars = "*";
		for(int i = 10; i > 0; i--){
			System.out.println(stars);
			stars = stars + "*";
		}




		//hint declare a variable String stars="*"; and each time in a for loop
		// say stars=stars+"*";  this would add another * to stars.
		// so your code will be in a for loop that repeats 10 times

	}

	/*
	 * this method will print will print all the leters in a line of its own
	 * for example if you put borland it would then print "give me a b"
	 * give me a "o"
	 * give me a "r"....
	 * */
	public void cheerLeaders(String word)
	{
		int counter = 0;
		int length = word.length();
		for(int i = 0; i <= length; i++ ){
			char lineLetter = word.charAt(counter);
			System.out.println(lineLetter);
			counter++;
		} 

	}
	public static void main (String ars[])
	{
		HWJ5_Loops p=new HWJ5_Loops();
		p.cheerLeaders("gankerooni");
	}

	//Look at the loops page and advanced people must finish 2 of 4 of the bottom extra credit
}
