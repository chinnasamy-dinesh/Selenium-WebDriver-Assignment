package Week_3.Day_2.Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstMostDuplicate 

{
	
	public static void main(String[] args)

	{

		char[] n = {'a','b','b','a','a','c','c','c','b','c','b','a'};

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : n)
        {  
           map.put(ch, map.getOrDefault(ch,0)+1) ;   
        }
		
        System.out.println(map);
        
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        char maxkey = ' ';
        int maxval = 0;
        for (Map.Entry<Character, Integer> data : hmap) 
        {
			if (data.getValue() > maxval) 
			{
				maxval = data.getValue();
				maxkey = data.getKey();
			}
		}
        
        System.out.println("First Most Dupliacte is : "+maxkey+"\nOccurance of "+maxkey+" is : "+maxval);
        
	}


}
	

