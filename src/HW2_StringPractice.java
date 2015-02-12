
public class HW2_StringPractice {
	public void testOutputOfStrings ()
	{
		// example
		String myFirstName="Jeff";
		System.out.println(myFirstName);

		//Example of a few methods
		int numOfLetters=myFirstName.length();
		System.out.println(myFirstName+" is "+ numOfLetters+" letters long");

		//Now if I wanted to replace all the J's with H's
		String spanishName=myFirstName.replace('J','H');
		System.out.println("Your Spanish name is"+ spanishName);
	}

	//Insert the code for instult user that will take in a name and insult them viciously
	//Like Jeff is a turtle
	public void insultUser(String name)  
	{ 
		System.out.println("ha! " + name);          
	}      

	//Insert the code to compliment user as described below
	//If they said Jeff, it would say Jeff, Jeff, say it twice its just as nice
	public void complimentUser(String name)
	{
		//the following line is 	ust so the user understands that program is not finished. Replace this with your code.  
		System.out.println("aww, you're so " +name);          
	}

	//Insert the code to say name and player number like "Jeff Borland is player number 14"
	public void sportIdentifier(String name, int number)
	{
		//the following line is just so the user understands that program is not finished. Replace this with your code.  
		System.out.println(name + " is #" +number +"!");          
	}   

	//Insert the code to say name and team like "Jeff Borland plays for the Bears"
	public void sportsTeam(String name, String team)
	{
		//the following line is just so the user understands that program is not finished. Replace this with your code.  
		System.out.println(name + " plays for the " + team);          
	}   

	//Insert the code that will say how many letters are in total in both words
	//So if they put in apple  and then sauce it would say 10.
	public void findLengthTotal(String word1, String word2)   
	{  
		int number = word1.length() + word2.length();
		System.out.println(word1 +" and " +word2 +" together have "+ number + " letters");          
	}   

	//ALL BELOW EXTRA CREDIT or required for all hotshots:
	//Insert the code for maineh that will replace all r with h's as old time mainehs do.
	public void makeMaineh(String phrase)   
	{
		String Maineh = phrase.replace("R","H");
		System.out.println(Maineh);          
	}   


	//Insert the code for piglatin that will take the first letter put it on the end and add 'ay'
	public void makePigLatin(String word)  
	{  
		char first = word.charAt(0);
		String pigBase = word.substring(1);
		String printing = (pigBase + first+ "ay");
		
		System.out.println("you translation is " +printing);          
	}

	//Remove all vowels so peanut would say pnt
	public void removeVowels(String word)
	{
	}

	//The method would find from the first A to the end
	// So if the word was Trash it would say ash
	// Or the word Lousiana would be ana
	public void firstAPlus(String word)
	{
		int where = word.indexOf("a");
		String word1 = word.substring(where);
		System.out.println(word1);
	}

	//SUPER ADVANCED
	/** will take in a phrase and change it to all lower case but the first letter will be caps
	 * So if they put in fRankenSTEIN it would be Frankenstein
	 */
	public void fixCapitilization (String phrase)
	{

	}   

	/**
	 * this method takes in a string and prints
	 * out the last letter of the string
	 * like if they put in apple as word it would print out
	 * The last letter of apple is e
	 */
	public void findLast(String word)
	{

	}

	/** Capitalize every other letter in the word, so Frankenstein would become FrAnKeNsTeIn**/
	public void capitlizeEveryOther(String word)
	{
	}


	public static void main (String ars[])
	{
		HW2_StringPractice p=new HW2_StringPractice();
		p.firstAPlus("pappy");
	}
}
