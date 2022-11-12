package week_1.Day_2;

import java.util.Arrays;

public class Learn_Array {

	public static void main(String[] args) {
		
		int[] num = {12,32,45,12,32,61,75,22,55,2,4,7};
		
		int numofData = num.length;
		
		// System.out.println(numArray);
		
		Arrays.sort(num);
		System.out.print("Ascending Order:\n");
		for (int i=0; i<=numofData-1;i++)
		{	
		System.out.print(num[i]+",");
		}
		System.out.print("\nDescending Order:\n");
		for (int i=numofData-1;i>=0;i--)	
		{
			System.out.print(num[i]+",");
		}
		
	}
	
}