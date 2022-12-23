package Week_3.Day_2.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber 
{

	public static void main(String[] args)
	{
		
		int[] num = {0, 1, 2, 3, 5, 6, 7, 7, 8, 9, 10};
		
		// a) Remove the duplicates using Set
		// b) Make sure the set is in the ascending order

		Set<Integer> tsNum = new TreeSet<Integer>();
		
		for (int i = 0; i < num.length; i++) 
		{
			tsNum.add(num[i]);
		}
		
		System.out.println(tsNum);
		
		List<Integer> lsNum = new ArrayList<Integer>(tsNum);
		
		for (int i = 0; i < lsNum.size(); i++) 
		{
			
			if(lsNum.get(i)==(i+1))
			{
				System.out.println(i);
				break;
			}
			
		}
			
	}
		
		

}


