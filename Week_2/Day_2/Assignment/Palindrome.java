package Week_2.Day_2.Assignment;

import java.util.Scanner;

public class Palindrome 
{
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)  
	{
		System.out.print("Please Enter word or Text find the Given text is Palindrome: ");
		String txt = sc.next(), rev = "";
		
		char[] ch = txt.toCharArray();
		
		for(int i = ch.length-1; i>=0; i--)
		
		rev = rev + txt.charAt(i);
		
		if(txt.equals(rev))
		{
			System.out.println("\n"+txt+" - string/number is a palindrome."); 
		}
		else
		{
			System.out.println("\n"+txt+" - string/number is not a palindrome.");
		}
	}

	
}
