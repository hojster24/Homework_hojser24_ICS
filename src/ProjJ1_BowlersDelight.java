import java.util.Scanner;


public class ProjJ1_BowlersDelight {

	//MR.BORLAND, I was about 5 min late today because of traffic this morning fyi
	
	
	public void BowlerStat()
	{
		System.out.println("input scores to the console");
		System.out.println("type -1 to end the program");
		System.out.println("==================================");

		double storedScore = 0;
		Scanner scan=new Scanner(System.in);  
		int input = 0;
		double denominator = 0;
		int streakMeter = 0;
		int highScore = 0;
		int lastScore = 0;
		int lowScore = 0;

		while(true)
		{

			System.out.println("what was you're score this round?");
			System.out.println("==================================");
			input=scan.nextInt();	

			//This if statement decides the reply/termination

			if (input == -1)
			{
				break;
			}
			else if(input <= 100 && input >=0)
			{
				System.out.println("Great.. for a 4-year old");
			} 
			else if(input <= 15 && input >=00) 
			{
				System.out.println("Eh.. decent");
			}
			else if(input <= 200 && input >=0)
			{
				System.out.println("Im impressed");
			}
			else if(input <= 250 && input >=0)
			{
				System.out.println("You're obsessed");
			}
			else if(input <= 300 && input >=0)
			{
				System.out.println("You must be lying");
			}
			else
			{
				System.out.println("invalid input");
			}

			//Second "if" to add to variables/score

			if(input <= 300 && input >= 0)
			{
				storedScore = storedScore + input;
				denominator++;
			}

			//if for streaks, and high-scores

			if(lastScore<input)
			{
				System.out.println("You've been improving for " + streakMeter + " games");
				streakMeter++;
			}
			else if(lastScore == input)
			{
				System.out.println("its a tie!!");
			}
			else if(lastScore >= input)
			{
				streakMeter = 1;
			}

			//High-score

			if(lastScore<input && input > highScore)
			{
				System.out.println("you've just set the highscore");
				highScore = input;
			}

			//Lowscore 

			if(lastScore > input && input > lowScore)
			{
				System.out.println("you've just set the lowscore");
				lowScore = input;
			}

			lastScore = input;


			System.out.println("The total is " + storedScore);
			System.out.println("The highscore is " + highScore);
			System.out.println("The lowscore is " + lowScore);
		}




		System.out.println("==================================");
		System.out.println("Your average is");
		double average = storedScore/denominator;
		System.out.println(average);
	}
	public static void main (String ars[])
	{
		ProjJ1_BowlersDelight p=new ProjJ1_BowlersDelight();
		p.BowlerStat();
	}
}

