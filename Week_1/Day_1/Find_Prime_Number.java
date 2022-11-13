package Week_1.Day_1;

import java.util.Scanner;

public class Find_Prime_Number 
{

	static Scanner sc = new Scanner(System.in);
	static int num, first, last, count = 0;
	
	public static void main(String[] args) 
	{
		System.out.printf("Enter 1 to find a prime number or Enter 2 to find prime number between two numbers:");
		num = sc.nextInt();
		if (num==1)
		{
			findNo();
		}
		else if (num==2)
		{
		betweenNo();
		}
	}
	
	public static void findNo() 
	{
		System.out.println("Please Enter the Number to Check for Prime Number: "); 
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
			System.out.println("The given number "+num+" is prime");
		} 
		else 
		{
			System.out.println("The given number "+num+" is not prime");
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
		
		System.out.printf("\nPrime numbers between %d and %d are: ", first, last);
		
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
			System.out.println(i);
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
				System.out.println(i);
			}	
		}
		
	}
	
}
	