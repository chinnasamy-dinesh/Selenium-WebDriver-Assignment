package Week_1.Day_1;

import java.util.Scanner;

public class Find_Even_or_Odd_Number 
{

	static Scanner sc = new Scanner(System.in);
	static int num, first, last, count=0;
	
	public static void main(String[] args) 
	{
		System.out.printf("Enter 1 to find a Odd/Even number \nEnter 2 to find Odd number between two numbers \nEnter 3 to find Even number between two numbers \n\nPlease select your option:");
		num = sc.nextInt();
		if (num==1)
		{
			findNo();
		}
		else if (num==2)
		{
		betweenOdd();
		}
		else if (num==3)
		{
		betweenEven();	
		}
		else
		{
			System.out.println("\nWrong Option Selected");
		}
	}
	
	public static void findNo() 
	{
		System.out.printf("\nPlease Enter the Number to Check for Even/Odd Number: "); 
		num = sc.nextInt();
		
		if(num == 0)
		{	
			System.out.printf("\nThe give number "+num+" is a whole number.");		
		}
		else
		{
			if (num%2 == 0) 
			{
			System.out.println("\nThe given number "+num+" is even number.");
			
			} 
			else 
			{
			System.out.println("\nThe given number "+num+" is odd number.");
			}
		}	
	}
	
	public static void betweenOdd()
	{
		System.out.printf("\nPlease Enter the First Number to Check for Odd Number: "); 
		first = sc.nextInt();
		
		System.out.printf("Please Enter the Second Number to Check for Odd Number: "); 
		last = sc.nextInt();
		
		System.out.printf("\nOdd numbers between %d and %d are: ", first, last);
		
		if (first<last)
		{
		for (int i = first; i <= last; i++) 
		{
			
			
			if (i == 2)
			continue;
			count=1;
				
			for (int j = 2; j <= i / 2; j++) 
			{
				if (i % j == 0) 
				{
					count = 0;
		            break;
				}
			}
			
			// count = 1 means i is Odd
            // and count = 0 means i is not Odd
			
			if(count==1)
			System.out.println(i);
		} 
		}
		else if (first>last)
		{
			for (int i = last; i <= first; i++) 
			{
				
				if (i == 2)
				continue;
				
				// count variable to tell
	            // if i is Odd or not
				count=1;
					
				for (int j = 2; j <= i / 2; j++) 
				{
					if (i % j == 0) 
					{
						count = 0;
			            break;
					}
				}
				
				// count = 1 means i is Odd
	            // and count = 0 means i is not Odd
				
				if(count==1)
				System.out.println(i);
			}	
		}
		else if (first==last)
		{
			num = first;
			if(num == 0)
			{	
				System.out.printf("\nThe give number "+num+" is a whole number.");		
			}
			else
			{
				if (num%2 == 0) 
				{
				System.out.printf("\nThe given number %d and %d are same numbers "+num+" is Odd number.",first,last);
				} 
				else 
				{
				System.out.printf("\nThe given number %d and %d are same numbers "+num+" is not a Odd number.",first,last);
				}
			}
		}
	}
	
	public static void betweenEven()
	{
		System.out.printf("\nPlease Enter the First Number to Check for Even Number: "); 
		first = sc.nextInt();
		
		System.out.printf("Please Enter the Second Number to Check for Even Number: "); 
		last = sc.nextInt();
		
		System.out.printf("\nEven numbers between %d and %d are: ", first, last);
		
		if (first<last)
		{
		for (int i = first; i <= last; i++) 
		{
			
			
			if (i == 0)
			continue;
			count=1;
				
			for (int j = 2; j <= i / 2; j++) 
			{
				if (i % j == 0) 
				{
					count = 1;
		            break;
				}
			}
			
			// count = 1 means i is Even
            // and count = 0 means i is not Even
			
			if(i%2 == 0)
			System.out.println(i);
		} 
		}
		else if (first>last)
		{
			for (int i = last; i <= first; i++) 
			{
				
				if (i == 0)
				continue;
				
				// count variable to tell
	            // if i is Even or not
				count=1;
					
				for (int j = 2; j <= i / 2; j++) 
				{
					if (i % j == 0) 
					{
						count = 0;
			            break;
					}
				}
				
				// count = 1 means i is Even
	            // and count = 0 means i is not Even
				
				if(i%2 == 0)
				System.out.println(i);
			}	
		}
		else if (first==last)
		{
			num = first;
			if(num == 0)
			{	
				System.out.printf("\nThe give number "+num+" is a whole number.");		
			}
			else
			{
				if (num%2 == 0) 
				{
				System.out.printf("\nThe given number %d and %d are same numbers "+num+" is even number.",first,last);
				
				} 
				else 
				{
				System.out.printf("\nThe given number %d and %d are same numbers "+num+" is not a even number.",first,last);
				}
			}
		}
	}
}
