package Week_1.Day_1.Assignment;

import java.util.Scanner;

public class Find_Prime_Number 
{

	static Scanner sc = new Scanner(System.in);
	static int num, first, last, count = 0;
	
	public static void main(String[] args) 
	{
		System.out.printf("Enter 1: To find a prime number.\nEnter 2: To find prime number between two numbers.\n\nPlease give your option: ");
		num = sc.nextInt();
		if (num==1)
		{
			System.out.println("\n");
			findNo();
		}
		else if (num==2)
		{
			System.out.println("\n");
		betweenNo();
		}
		else
		{
			System.out.println("\nWrong Option Selected");
		}
	}
	
	public static void findNo() 
	{
		System.out.printf("Please Enter the Number to Check for Prime Number: "); 
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) 
		{
			if (num%i == 0) 
			{
				count++;
			}		
		}
		
		if (count == 2 || count == 1) 
		{
			System.out.println("\nThe given number "+num+" is a prime");
		} 
		else 
		{
			System.out.println("\nThe given number "+num+" is not a prime");
		}
	}
	
	public static void betweenNo() 
	
	{
		 // Asking user to enter lower value of interval
		System.out.printf("Please Enter the First Number to Check for Prime Number: "); 
		first = sc.nextInt();
		
		// Asking user to enter upper value of interval
		System.out.printf("Please Enter the Second Number to Check for Prime Number: "); 
		last = sc.nextInt();
		
		System.out.printf("\n\nPrime numbers between %d and %d are: ", first, last);
		
		if (first<last)
		{
		for (int i = first; i <= last; i++) 
		{
			
			// Skip 0 and 1 as they are
            // neither prime nor composite
			
			if (i == 0)
			continue;
			
			// count variable to tell
            // if i is prime or not
			count=1;
				
			for (int j = 2; j <= i / 2; j++) 
			{
				if (i % j == 0) 
				{
					count = 0;
		            break;
				}
			}
			
			// count = 1 means i is prime
            // and count = 0 means i is not prime
			
			if(count==1)
				System.out.printf(i+",");
		} 
		}
		else
		{
			for (int i = last; i <= first; i++) 
			{
				
				// Skip 0 and 1 as they are
	            // neither prime nor composite
				
				if (i == 0)
				continue;
				
				// count variable to tell
	            // if i is prime or not
				count=1;
					
				for (int j = 2; j <= i / 2; j++) 
				{
					if (i % j == 0) 
					{
						count = 0;
			            break;
					}
				}
				
				// count = 1 means i is prime
	            // and count = 0 means i is not prime
				
				if(count==1)
				System.out.printf(i+",");
			}	
		}
		
	}
	
}
	