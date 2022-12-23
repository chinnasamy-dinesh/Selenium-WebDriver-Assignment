package Week_1.Day_2.Assignment;

import java.util.Scanner;

public class Print_FibonacciSeries 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{

		int n1 = 0, sum=0, n2 = 1;
		System.out.printf("Input number of Fibonacci Series numbers to print: ");
		int input = sc.nextInt(); 

		for (int i=1; i <= input; i++) 
		{
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
		}

	}

}
