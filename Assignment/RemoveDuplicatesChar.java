package Week_3.Day_2.Assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesChar {

	public static void main(String[] args) {
		// Declare a String as "PayPal India"
		String txt = "PayPal India";
		
		String text = txt.toLowerCase();
		
		// Convert it into a character array
		char[] charArray = text.toCharArray();
		
		// Declare a Set as charSet for Character
		Set<Character> charSet = new TreeSet<Character>();

		// Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupSet = new TreeSet<Character>();

		// Iterate character array and add it into charSet
		for (int i = 0; i < charArray.length; i++) 
		
		{

			// if the character is already in the charSet then, add it to the dupCharSet

			boolean dup = charSet.add(charArray[i]);
			if (!dup)
			{
				dupSet.add(charArray[i]);
			}

			// Check the dupCharSet elements and remove those in the charSet

			
			if (dupSet.contains(charArray[i])==charSet.contains(charArray[i]))
			{
			  charSet.remove(charArray[i]); 
			}
			 
		}
		
		//	Iterate using charSet
		
		Iterator<Character> value = charSet.iterator();
		
		for (int i = 0; i < charSet.size(); i++)
		{
			System.out.println(value.next());	
		}
		
		

	}
}
