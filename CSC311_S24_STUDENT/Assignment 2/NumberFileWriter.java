
import java.io.*; 
import java.util.Scanner;
//Kathia Hernandez, Khernandez266@toromail.csudh.edu

public class NumberFileWriter
{
	static int [] arrayOfNumbers = {1,2,3,4,7,8,10};
	static int size = 0;
	static int sizeOfFile;
	static String fileImport;
	
	static int [] arrayFS = new int [1000000];
	
	// 
	NumberFileWriter(int [] s  , short h)
	{
		
	}
	
	//FileSorter class
	
	//Constructor name : Bob
	NumberFileWriter ( String f)
	{
		fileImport = f;
	}
	
	//Constructor name : Floobie
	NumberFileWriter (int size)
	{
		sizeOfFile = size;
		
	}
	
	//Constructor name : Jerry
	NumberFileWriter(int array [] )throws IOException
	{
		for (int i = 0; i < array.length; i++)
		  {
		   arrayFS[i] = array[i];
		  }

		
	}
	
	///////////////////////////////////////////////////////////
	public static void main (String [] args)throws IOException
	{
		//NumberFileReader i = new NumberFileReader ();
		//write(arrayOfNumbers);
		write();
		
		System.out.println(size);
	}
	
	
	
	
	
	
	public static void write() throws IOException
	{
		//will write content of the array to a file, one value per line
		PrintWriter file = new PrintWriter ("C:\\Users\\numberFileOut.txt");
		
		for(int i = 0 ; i < arrayOfNumbers.length ; i++)
		{
			file.println(arrayOfNumbers[i]);
		}
		//Scanner s = new Scanner (file);
		
		file.close();
	}
     /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //File Sorter Area!
	
	public static String WriteUserFile() throws IOException
	{
		
		
		
		String outputF = " ";
		Scanner ask = new Scanner (System.in);
		System.out.println("Please enter the new file in which you want to transfer the content of first file:");
		outputF = ask.nextLine();
		
		
		
		
				PrintWriter f = new PrintWriter (outputF);
				
				for(int i = 0 ; i < size  ; i++)
				{
					f.println(arrayFS[i]);
				}
				
				
				
				
				
				return fileImport ;
	}
}
