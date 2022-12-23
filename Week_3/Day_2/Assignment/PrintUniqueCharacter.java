package Week_3.Day_2.Assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter 
{
	
	public static void main(String[] args) 
	{
		// Take your name as input
		
		String name = "chinnasamy";
		
		// Convert String to Character array		
		char[] charNameArray = name.toCharArray();
		
		//  Create a new Set -> HashSet
		
		Set<Character> hsName = new HashSet<Character>();
		
		// Add each character to the Set
		
		for (int i = 0; i < charNameArray.length; i++) 
		{
			boolean dup = hsName.add(charNameArray[i]);
		
			// if it is already there, remove it
			
			if(!dup)
			{
				hsName.remove(charNameArray[i]);
			}
			
		}
		
		// Finally, print the set
		System.out.println(hsName);
		
		
	}
	
	

}
