
import java.io.*;  
import java.util.Scanner;
 
//Kathia Hernandez, Khernandez266@toromail.csudh.edu
public class NumberFileReader 
{
	 static  int fileS = 0;
	 static String fileI;
	 static File file = new File ("C:\\Users\\numberFile.txt");
	//int [] read ;
	
	NumberFileReader(String fileInput)
	{
		fileI = fileInput;
	}
	
	public static void main (String [] args) throws IOException
	{
		Scanner t = new Scanner (file);
		while(t.hasNext())
		{
			fileS++;
			//System.out.println("in");
			String st = t.nextLine();
		}
		
		t.close();
		
		read();
		
		//NumberFileWriter pass= new NumberFileWriter(fileS);
	}

	public static int[] read() throws IOException
	{
		//will return the array of numbers read from the file
		
		
		
		
		Scanner s = new Scanner (file);
		
		long l = file.length();
	    int size = (int)l;
	    String [] read = new String [size];
	     int [] read2 = new int [fileS];
	  
	   
	    /* while(s.hasNext())
	    {
	    	fileS++;
	    }*/
	    
		
	    while (s.hasNext())
		{
			int in = 0 ;
			String str = s.nextLine();
			//read[in] 
			
			
			for (int i = 0 ; i < fileS ; i++)
			{
				read2[i] = Integer.parseInt(str) ;
				
			}
			for(int o :read2)
			{System.out.println(o);
			   break;
			}
			
			in++;
			
		}
		
		
		s.close();
		
		return read2 ;
		
	}
	
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   //File Sorter Area!
	
	public static String readUserFile(String files)throws IOException
	{
		
        Scanner s = new Scanner (files);
		
		long l = files.length();
	    int size = (int)l;
	    int siz = 0 ;
	    while (s.hasNext())
		{
			
			String str = s.nextLine();
		
			
		    System.out.println(str);
			
			
			siz++;
			
			
			
		}
	   // s.close();
	   
	    int [] content = new int [siz];
	    
	    Scanner s2 = new Scanner (files);
	    while (s.hasNext())
	    {
	    	String st = s2.nextLine();
	    	int a = 0;
	    	
	    	
	    	a++;
	    	for (int u = 0 ; u < siz ;)
	    	{
	    		content[u] = Integer.parseInt(st);
	    	}
	    	
	    	
	    }
	    
	    NumberFileWriter sf = new NumberFileWriter(siz);
		
		BubbleSort b = new BubbleSort(content);
		b.sortFile();
		
		s.close();
		
		return files ;
	}
}
