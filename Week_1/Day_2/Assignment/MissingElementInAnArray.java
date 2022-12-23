package Week_1.Day_2.Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array
		Arrays.sort(arr);
		
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = arr[0]; i<=arr.length; i++)
		{
		// check if the iterator variable is not equal to the array values respectively
		
		if (i!=arr[i-1])
		{
			// print the number
			System.out.println("The missing number in the array is: "+i);
			// once printed break the iteration
			break;
		}
		
		}
				
				
				
				
				
		

	}

}
