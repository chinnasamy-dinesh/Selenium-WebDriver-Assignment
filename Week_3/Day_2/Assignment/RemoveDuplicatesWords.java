package Week_3.Day_2.Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords 

{

	public static void main(String[] args) 
	
	{

		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] textSplit = text.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for (int i = 0; i < textSplit.length; i++) 
		{
			set.add(textSplit[i]);
		}
		
		System.out.println(set);
		
	}

}
