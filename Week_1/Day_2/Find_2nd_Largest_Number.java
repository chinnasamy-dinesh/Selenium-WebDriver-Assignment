package Week_1.Day_2;

import java.util.Arrays;

public class Find_2nd_Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {12,32,45,12,32,61,75,22,55,2,4,7};
		
		int num1 = num.length;
		
		Arrays.sort(num);
		
		
		
		System.out.println("\nTotal number of Arrays in the intergar num is: "+num1);
		
		System.out.println("\nNo of Arrays in the intergar num is:");
		
		for (int i = num1-1; i >= 0; i--)
			
		{
		
			System.out.print(+num[i]+",");
					
		}
		
		for (int i = num1-1; i >= 0; i--)
			
		{
		
			if (i == num1-2)
				
			{
				System.out.println("\n\nThe 2nd Largest Number in the intergar is: "+num[i]);
			}
			
		}
		
		
		
	}

}
