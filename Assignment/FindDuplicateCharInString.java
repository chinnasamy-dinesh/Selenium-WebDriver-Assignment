package Week_3.Day_2.Assignment;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharInString 
{

	public static void main(String[] args) 
	
	{
		
		String name = "google";
		
		char[] c = name.toCharArray();
		
		Set<Character> uniqueSet = new HashSet<Character>();
		Set<Character> dupSet = new HashSet<Character>();
		for (int i = 0; i < c.length; i++) 
		{
			uniqueSet.add(c[i]);			
		}
		
		System.out.println("Unique Char in Name (Google): "+uniqueSet);
		
		uniqueSet.clear();
		
		for (int i = 0; i < c.length; i++) 
		{
		boolean dup = uniqueSet.add(c[i]);
		if(!dup)
		{
			dupSet.add(c[i]);
		}
		}
		
		System.out.println("\nDupliacte Char in Name (Google): "+dupSet);
				
	}

}
