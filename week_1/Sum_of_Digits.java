package week_1;

import java.util.Scanner;

public class Sum_of_Digits {
	
	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) 
	
	{	
		System.out.printf("Please Enter a Integer Value to find the Sum of Digits: ");
		int num = sc.nextInt(), sum = 0, rem, org = num;
		
		do
		{
			rem = org % 10;
			sum = sum + rem;
			org = org/10;
		}
		while(num!=0);
		
		System.out.println("Sum of the Given Digit "+num+" is : "+sum);
		
	}

}
