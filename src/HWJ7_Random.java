import java.util.Random;

//This code is outdated, this is for the dice game setup, DO NOT PASS IN
public class HWJ7_Random {
	
	public boolean flipCoin ()
	{
		Random rand=new Random(); 
		int num=rand.nextInt(2); 
		if(num == 1)
		{
			System.out.println("heads");
			return true;
		}
		else if(num == 0)
		{
			System.out.println("tails");
			return false;
		}
		else
			return false;
		
	}
	public int rollDice()
	{
		Random rand = new Random();
		int i = rand.nextInt(6) +1;
		System.out.println(i);
		return i;
	}
	public int roll2Dice()
	{
		int roll1 = rollDice();
		int roll2 = rollDice();
		System.out.println("roll #1:" +roll1+" roll #2:"+roll2);
		return roll1+roll2;
	}
	public static void main (String ars[])
	{
		HWJ7_Random p=new HWJ7_Random();
		p.roll2Dice();
	}
}
