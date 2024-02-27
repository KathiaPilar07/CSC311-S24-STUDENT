
//Kathia Hernandez, Khernandez266@toromail.csudh.edu

import java.io.*;
import java.util.Arrays;

public class BubbleSort
{
	static int [] arr1 = {7,3,5,9,1,2,3,11,4,7,10,5,8,2};
	static int cycles = 0 ;
	static int[] arraF = new int[1000000];
	
	//BubbleSort arr = new BubbleSort (arr1);
  
	public BubbleSort(int a [] , int j)
  {
	  
  }
	
	
	public BubbleSort(int si)
	{
		
	}
	//
	
	public BubbleSort (int array [])
	{
		for (int i = 0; i < array.length; i++)
		  {
		       arraF[i] = array[i];
		  }
	}
	
	
	/////////
	 public static void main (String [] args)
	 {
		sortAsc(); //Ready to go
		sortDesc();
		loopCycles();
	 }
	
	public static int[] sortAsc ()
	{
		int largest = 0;
		
		boolean swapping = true;
		
		int l = arr1.length * 2;
		while (swapping == true )
		{
			swapping = false;
			
			for (int i = 0 ; i < arr1.length-1; i++ )
			{
				if(arr1[i] > arr1[i+1])
				{
					int change = arr1[i];
					arr1[i] = arr1[i+1];
					
					//Then 
					arr1[i+1] = change;
					
					swapping = true;
					cycles++;
					
					

				}
				
				for (int is = 0; is < arr1.length; is++)
				  {
				   //arrayD[is] = arr1[is];
				   
				   
				  }
				
				
				
			}
			
			

		}
		
		
		System.out.println(Arrays.toString(arr1));

		
		
		
		
		
		
		
		
		return arr1;
	}

	public static int[]  sortDesc()
	{
		// will return the array sorted in Descending order

		int largest = 0;
		
		boolean swapping = true;
		
		int l = arr1.length * 2;
		while (swapping == true )
		{
			swapping = false;
			
			for (int i = 0 ; i < arr1.length-1; i++ )
			{
				if(arr1[i] < arr1[i+1])
				{
					int change = arr1[i];
					arr1[i] = arr1[i+1];
					
					//Then 
					arr1[i+1] = change;
					
					swapping = true;
					largest++;
					
					

				}
				
				for (int is = 0; is < arr1.length; is++)
				  {
				   //arrayD[is] = arr1[is];
				   
				   
				  }
				
				
				
				
			}
			
			

		}
		
		
		System.out.println(Arrays.toString(arr1));

		
		
		return arr1;
	}

	public static int loopCycles()
	{
		int total = cycles;
		// How many loop cycles did it take to sort run the previous sort operation?

        System.out.println("It took : "+total + " cycles to re-order the array in descending and" + total+
        		" cycles more to re-order the array to ascending");



     return total;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//File Sorter Area!
	
	
	public static int [] sortFile ()throws IOException
	{
		//This method will receive the new file after reading and Writing to order it and print it
         int largest = 0;
		
		boolean swapping = true;
		
		//Ascending array from file
		
		while (swapping == true )
		{
			swapping = false;
			
			for (int i = 0 ; i < arraF.length-1; i++ )
			{
				if(arraF[i] > arraF[i+1])
				{
					int change = arraF[i];
					arraF[i] = arraF[i+1];
					
					//Then 
					arraF[i+1] = change;
					
					swapping = true;
					
					
					

				}
				
			
			}
			
			

		}
		
		for (int e = 0 ; e < arraF.length ; e++)
		{
			if(arraF [e]!= 0)
			{
				System.out.println((arraF[e]));
			}
			
		}
		

		
		
		NumberFileWriter ar = new NumberFileWriter(arraF);
		ar.WriteUserFile();
		
		
		return arraF;
	}
}

