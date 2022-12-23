package Week_2.Day_2.Assignment;

import java.util.Scanner;

public class Char_Occurance 

{
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	
	{
	
		
		  System.out.print("Enter a String of Char: "); 
		  String str = sc.next();
		  
		  str=str.toLowerCase();
		  
		  System.out.print("\nEnter a Char to Search: "); 
		  char c = sc.next().charAt(0);
		  
		  int len = str.length(), count = 0;
		  
		  for(int i=0; i<len; i++) 
			  
		  { 
			  if(str.charAt(i) == c) 
				  
			  count++; 
			  
		  }
		  
		  System.out.println("\nNumber of Character '"+c+"' in the given string '"+str+"' is : "+count);
		  
	}	

}



