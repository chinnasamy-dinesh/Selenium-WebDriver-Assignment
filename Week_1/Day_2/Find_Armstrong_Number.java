package Week_1.Day_2;

import java.util.Scanner;

public class Find_Armstrong_Number 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Enter the number to find the Armstrong Number: ");
		int arms = sc.nextInt();
		int org = arms, rem, sum = 0;
		
		do
		{
			rem = org % 10;
			org = org / 10;
			sum = sum + (rem*rem*rem);
		}
		while (org != 0);
		
		if (sum != arms)
		{
			System.out.println(arms+" is not a Armstrong Number.");
		}
		else
		{
			System.out.println(arms+" is a Armstrong Number.");
		}
	}
}
