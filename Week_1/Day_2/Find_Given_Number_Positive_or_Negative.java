package Week_1.Day_2;

import java.util.Scanner;

public class Find_Given_Number_Positive_or_Negative 
{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	
	{
		
	System.out.printf("Please Enter an Positive or Negative Integer:");
	int num = sc.nextInt();
	
	if (num==0)
	{
		System.out.println("\nGive number is a Whole Number: "+num);
	}
	else if (num>0)
	{
		System.out.println("\nGive number is a Positive Number: "+num);
	}
	else
	{
		System.out.println("\nGive number is a Negative Number: "+num);
	}
	}

}
