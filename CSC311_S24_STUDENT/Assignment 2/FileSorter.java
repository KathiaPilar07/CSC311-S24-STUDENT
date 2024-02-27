
//Kathia Hernandez , Khernandez266@toromail.csudh.edu
import java.io.*;  
import java.util.Scanner;


public class FileSorter 
{
	 static String fileName = " ";
     static long fileSize = 0;
	public FileSorter ()
	{
		
	}
	public static void main (String [] args)throws IOException
	{
		//User inserts file name 
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter the file you want to use");
		fileName = s.nextLine();
		
		//read: it reads , scans and store the file information first
		NumberFileReader fe = new NumberFileReader (fileName);
		fe.readUserFile(fileName);
		
		//Sort
		
		//Write
		//NumberFileWriter w = new NumberFileWriter(fileName);
		//w.WriteUserFile();
		
		
		
		
		
	}
	
	
	//public static 
	
	
	
}
