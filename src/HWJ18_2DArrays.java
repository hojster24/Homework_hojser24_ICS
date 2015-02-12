import java.util.Random;

/**
 * Practice with 2 dimensional arrays
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HWJ18_2DArrays
{
    int table[][]=new int[5][3];
 
    //the constructor fills in the 2d array with some values below:
    public HWJ18_2DArrays()
    {
        table[0][0]=6;  table[0][1]=4;  table[0][2]=0;  
        table[1][0]=19;  table[1][1]=13;  table[1][2]=13;  
        table[2][0]=24;  table[2][1]=21;  table[2][2]=27;  
        table[3][0]=30;  table[3][1]=31;  table[3][2]=40;  
        table[4][0]=44;  table[4][1]=40;  table[4][2]=50;  
 
    }
 
    //have it print out the array in a nice fashion
    public void printArray()
    {
    	for(int r = 0;r<table.length;r++)
    	{
    		for(int c =0;c<table[r].length;c++)
    		{
    			System.out.print(table[r][c]+" ");
    		}
    		System.out.println();
    	}
 
    }
 
    //replace every element with a random value
    public void fillWithRandom()
    {
    	Random rand = new Random();
    	for(int r = 0;r<table.length;r++)
    	{
    		for(int c =0;c<table[r].length;c++)
    		{
    			table[r][c]=rand.nextInt(101);
    			System.out.print(table[r][c]+" ");
    		}
    		System.out.println();
    	}
    }
 
    //have it add x to every element in the table
    public void addToEach(int x)
    {
    	
    }
 
    public int findMaxValue()
    {
    	int max=table[0][0];
    	for(int r = 0;r<table.length;r++)
    	{
    		for(int c =0;c<table[r].length;c++)
    		{
    			if(table[r][c]>max)
    			{
    				max = table[r][c];
        		}    		
    		}
    	}
    	System.out.println(max);
		return max;
    }
 
    public double findAvgValue()
    {
        return 0;
    }
 
    //find the sum of whatever row they put in (assume row is between 0 and 4 if they put in 2 it would be 72)
    public int findSumRow(int row)
    {
        return 0;
    }
 
    //find the sum of whatever column they put in (assume col is between 0 and 2 [so if they put in 2 it would be 130)
    public int findSumCol(int col)
    {
        return 0;
    }
 
    //ADVANCED - This method will add x to beginning of table, shifting all values over one (and losing the last value)
    public void addToBeginning(int x)
    {
    }
 
    //ADVANCED - This method will return the entire table as a 1d array
    public int[] createSingleDimension()        
    {
        return null;
    }       
     
    public int findRandom (int min, int max)
    {
        int range=max-min+1;
        int rand=(int)(Math.random()*range)+min;
        return rand;
    }
    public static void main (String ars[])
	{
		HWJ18_2DArrays p=new HWJ18_2DArrays();
		p.fillWithRandom();
	}
 
}