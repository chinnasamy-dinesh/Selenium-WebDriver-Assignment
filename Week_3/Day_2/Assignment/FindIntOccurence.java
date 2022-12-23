package Week_3.Day_2.Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindIntOccurence {

	public static void main(String[] args)

	{

		int[] n = { 1, 2, 1, 5, 6, 8, 8, 9, 6, 5, 4, 7, 6, 3, 2, 1, 4, 8, 8, 9, 5, 4, 8 };

		Map<Integer, Integer> nmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < n.length; i++) 
		{
			if (nmap.containsKey(n[i])) 
			{
				int value = nmap.get(n[i]);
				nmap.put(n[i], value + 1);
			} 
			else 
			{
				nmap.put(n[i], 1);
			}
		}

		System.out.println(nmap + "\n");

		Set<Entry<Integer, Integer>> entrySet = nmap.entrySet();
	
		/*
		 * for (int i = 0; i < entrySet.size(); i++) {
		 * 
		 * }
		 */
		
		  for (Entry<Integer, Integer> entry : entrySet) 
		  { int value =
		  entry.getValue(); 
		  if (value==1) 
		  {
		  System.out.print("["+entry.getKey()+" =  "+entry.getValue()+"]"); 
		  }
		  }

	}

}
