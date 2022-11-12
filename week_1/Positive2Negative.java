package week_1;

import java.util.Scanner;

public class Positive2Negative {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
	
	System.out.printf("Enter the Positive Number:");
	int num = sc.nextInt();
	
	if(num>0)
		
	{
	int num1 = num*-1;
	System.out.println("\nThe Positive Number "+num+" is now converted to Negative Number: "+num1);
	}
	else
	{
		System.out.println("\n\nEntered number "+num+" is already a Negative Number.");
	}
	}

}
