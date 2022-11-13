package Week_1.Day_2;

import java.util.Scanner;

public class Negative2Positive {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
	
	System.out.printf("Enter the Negative Number:");
	int num = sc.nextInt();
	
	if(num<0)
		
	{
	int num1 = num*-1;
	System.out.println("\n\nThe Positive Number "+num+" is now converted to Negative Number: "+num1);
	}
	
	else
		
	{
		System.out.println("\n\nEntered number "+num+" is Positive Number.");
	}
	}
}