
//Kathia Hernandez , Khernandez266@toromail.csudh.edu

import java.util.Scanner;

public class UnlimitedNumberArrayList {
	
	static int a =0;
	static int size = 0;
	static int lar = 0;
	static int verifier = 0;
	static NumberArrayList myList= new NumberArrayList(500);   // Will be able to store up to 500 integers
	//int size ;
	
	UnlimitedNumberArrayList(int s )
	{
		//Constructor takes size as parameter
		//size = myList;
		
	}
	
	static String nums = myList.toString();
	//static int sz = Integer.parseInt(nums);
	static int [] Unlimited = new int [20000];
	static int [] numbers = new int [Unlimited.length];
	static int [] matching  = new int [Unlimited.length]; // this array will return indices of matching numbers 
	
	
	public static void main (String [] args)
	{
		for (int l = 0 ; l < numbers.length ; l++)
		{
			numbers[l] = -1;
		}
		//Scanner s = new Scanner (System.in);
		 
		//int option1 = -1;
		
		
			//System.out.println("Set how big is your list? (enter integer value)");
			//int input1 ;
			//option1 = s.nextInt();
			
				Scanner k = new Scanner (System.in);
				//Menu To choose what to do 
				
				int option = 0;
				while (option != 9)
				{
					System.out.println("Choose one option: " + "\n " +"1. Add a new number to Arraylist" + "\n " + "2.Show value in index"
							+ "\n " + "3.Show number of elements in array" + "\n " + "4.Return matching numbers" + "\n " + "5. Get largest number"
									+ "\n " + "6.Get smallest" + "\n " + "7.Get average" + "\n " + "8. Print" + "\n " + "9. Exit");
					
					option = k.nextInt();
					
					if (option > 9 || option < 1)
					{
						System.out.println("Invalid option! choose again!");
						
					}
					
					else if (option == 1)
					{
						Scanner add = new Scanner (System.in);
						System.out.println("Enter the value that you wanna add");
						int i = add.nextInt();
						
						add (i);
						
					}
					else if (option == 2)
					{
						Scanner in = new Scanner (System.in);
						int index ;
						
						System.out.println("Enter the index you want to search: ");
						index = in.nextInt();
						
						if (index <0)
						{
							System.out.println("Limit crossed! try again");
						}
						
						else if (index > numbers.length)
						{
							System.out.println("Limit crossed! try again");
						}
						
						else if (index != 0 && !(index > numbers.length))
						{
							get(index);
						}
					}
					else if (option == 3)
					{
						size();
						//
						
					}
					else if (option == 4)
					{
						Scanner find = new Scanner (System.in);
						System.out.println("Enter the value you want to find: ");
						int f = find.nextInt();
						
						
							
						
						find(f);
					}
					else if (option == 5)
					{
						getLargest();
						if(lar > -1)
						{
							System.out.println("The largest is: " );
							System.out.println(lar);
						}
						
					}
					else if (option == 6)
					{
						getSmallest();
					}
					else if (option == 7)
					{
						getAverage();
					}
					
					else if (option == 8)
					{
						if (verifier == 0)
						{
							System.out.println("List is empty , there's nothing to be printed");
						}
						
						
						else if (verifier != 0)
						{
							System.out.print("[");
							for (int c = 0 ; c < numbers.length; c++)
							{
								if (numbers[c] != -1)
								{
									System.out.print(  numbers[c]+",");
									
								}
								
								
							}
							System.out.print("]");
						}
						
						System.out.print("\n");
						
					}
					else if (option == 9)
					{
						System.out.println("Bye! ");
						k.close();
						
					}
				}
				
				
		
		
		
	}
	
	
	
	//Search  method to find element in array
	/*public static int searchArray (int [] array , int value)
	{
		int index;
		int item;
		boolean found;
		
		index = 0;
		//
		
		item = -1;
		found = false;
		
		//Loop to search through the array 
		
		while (!found && index <array.length)
		{
			if (array[index] == value)
			{
				found = true;
				item = index;
			}
			
			index++;
		}
		
		return item;
	}*/
	

	

	public static int add (int number) 
	{
		 //this method will return an index or location of the new entry , locasion de la ultima input 
		
		for ( ; a < 500 ; )
		{
			if(numbers[a] == -1)
			{
				//Then we can add a value
				numbers[a] = number;
				verifier++;
				//a = +1;
				//System.out.println(a);
				break;
			}
			
			else if (numbers[a] != -1)
			{
				//a= +1;
				
				numbers[a] = number;
				
				break;
			}
			
		}
		
		a++;
	
		int a2= a - 1;
		System.out.println("Your value was succesfully added at index : " + a2);
		return number;
	}

	public static int  get(int index)
	{
		
		int getIn= 0;
		
		// will return number stored at the given location in the NumberArrayList, will print the number we put
		
		//for (int i = 0 ; i < numbers.length;i++)
		
			if (numbers[index] != -1)
			{
				System.out.println("The number inside is : " + numbers[index]);
			}
			
			else if (numbers[index] == -1)
			{
				System.out.println("Spot is empty " + numbers[index]);
			}
		
		
		return index;
	}

	public static  int size() 
	{ // return total number of elements currently in the list
		
		
		for (int i = 0 ; i < numbers.length ; i++)
		{
			if (numbers[i] != -1) 
			{
				size++;
			}
		}
		
		System.out.println("The size of your list is : " + size);
		
		
		return size;
	}

	public static int[] find(int number)
	{
		int max = 0;

		
		//
		for (int l = 0 ; l < matching.length ; l++)
		{
			matching[l] = -1;
		}
		//will return an array of indices of matching numbers. Wil return empty array if no numbers were found
				//loop counter
				
				if (verifier == 0)
				{
					System.out.print("[");
					for (int v : matching)
					{
						
						System.out.print(v + ",");
						
					}
					System.out.print("]");
				}
				//
				else if (verifier != 0)
				{
					
					
					for (int i = 0 ; i < numbers.length; i++)
					{
						int cycles = 1 ;
						
						 if (numbers[i] ==(number))
						{
							System.out.println ("Your value was found at indices : "  );
							cycles = i;
							//int num = ;
							matching[i] = i;
							cycles++;

							for (int is = 0 ; is < matching.length ; is++)
							{
								if (matching[is] != -1) 
								{
									max++;
								}
							}
							
							if (numbers[i] != -1 && matching[i] != -1)
							{
								
									System.out.print(matching[i] + ",");
								
								
							}
							/////////////////////////////////////////////////
							
						}
						 
						 
						 
						 
						 
						 
						
						 
						
					}
					
					
				}
				
				else if (verifier == 0 || verifier !=0)
				{
					for (int i = 0 ; i < numbers.length ; i++)
					{
						if (numbers[i] != number)
						 {
									System.out.println("Sorry , there's no matching numbers");
									break;
						 }
					}
					 
						
				}
					System.out.print("\n");
				
					
			return matching ;			
		
			
	}

	public static int getLargest() 
	{
		int largest = 0;
		// will return the largest number from array, return -1 if no number was found
		
		for(int i = 0 ; i < numbers.length ;i++ )
		{
			if (numbers[i] != -1 && verifier !=0) 
			{
				for (int l = 0 ; l < numbers.length ; l++)
				{
					
					if (largest < numbers[i]  )
					{
						largest = numbers[i];
						lar = numbers[i];
					}
				}
				
				
			}
			else if(numbers[i] == -1 && verifier == 0)
			{
				lar = -1;
				largest = -1;
			}
			
		}
		
		if(largest == -1)
		{
			System.out.println(largest);
		}
		
		
		//System.out.println(largest);
		return largest;
	}

	
	public static int getSmallest()
	{
		// will return the smallest number  from array, return -1 if no number was found
		lar = getLargest();
		int smallest = lar;
		
		for(int i = 0 ; i< numbers.length; i++) {
			
			if(numbers[i] != -1 && verifier !=0)
			{
				
				for (int l = 0 ; l < numbers.length ; l++)
				{
					
					if (smallest > numbers[i]  )
					{
						smallest = numbers[i];
						
					}
					
				}
				
			}
			
			else if(numbers[i] == -1 && verifier == 0)
			{
				System.out.println("-1");
			}
			
		}
		
		if (smallest != lar)
		{
			System.out.println("The smallest is : " + smallest);
		}
		
		
		
		return smallest;
	}

	public static int getAverage() 
	
	{
		int s = 0 ;
		
		for (int i = 0 ; i < numbers.length ; i++)
		{
			if (numbers[i] != -1) 
			{
				s++;
			}
		}
		int average = 0 ;
		 int total = 0;
		 
		 if (s == 0)
		 {
			System.out.println("-1 ") ;
		 }
		 
		 else if (s != 0)
		 {
			 for (int i = 0 ; i < numbers.length ; i++)
				{
					if (numbers[i] != -1) 
					{
						average += numbers[i];
					}
				}
				
				total = average / s;
				
				//System.out.printf("The average of your list is : %.2d. " , total); 
				System.out.println("The average of your list is : " + total); 
		 }
		
		
		
		
		
		// will return the average of all numbers stored in the array, return -1 if there are no numbers in the array
		
		return average;
	} 
	


}
