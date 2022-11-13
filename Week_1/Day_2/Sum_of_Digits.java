package Week_1.Day_2;

import java.util.Scanner;

public class Sum_of_Digits {
	
	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) 
	
	{	
		System.out.printf("Please Enter a Integer Value to find the Sum of Digits: ");
		int num = sc.nextInt(), sum = 0, rem, org = num;
		
		while(num>0)
		{
			rem = num % 10;
			System.out.println();
			sum = sum + rem;
			num = num/10;
		}
		
		
		System.out.println("Sum of the Given Digit "+org+" is : "+sum);
		
	}

}
