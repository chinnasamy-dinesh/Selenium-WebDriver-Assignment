package Week_2.Day_2;

import java.util.Scanner;

public class Reverse_Even_Words 

{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	
	{
		System.out.print("Please Enter a Line of String Text: ");
		String str = sc.nextLine();
		//String str = "I am learning Selenium webdriver via Testleaf";
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) 
		
		{
			
			if (i%2!=0) 
			
			{
				
				char[] ch = split[i].toCharArray();
				String rev = "";
				for (int j = ch.length-1; j>=0; j--)
				{
					rev = rev + ch[j];
				}
				System.out.print(rev+" ");
				
			} 
			
			else 
			
			{
				System.out.print(split[i]+" ");

			}
			
		}
		
		
		
		
		
		
	}

}
