package Week_3.Day_2.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest 

{

	public static void main(String[] args) 
	
	{
	
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) 
		{
			set.add(data[i]);			
		}
				
		List<Integer> list = new ArrayList<Integer>(set);
		
		//Collections.sort(list);
		
		int length = list.size();
		
		System.out.println("The Second Largest Number in the Given Array List of"+
		list+" is : "+list.get(length-2));

	}

}
