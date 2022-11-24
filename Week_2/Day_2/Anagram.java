package Week_2.Day_2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 

{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	
	{
		
		System.out.print("Please Enter the String 1 Text: ");
		String text1 = sc.next();
		
		System.out.print("Please Enter the String 2 Text: ");
		String text2 = sc.next();
		
		int len1 = text1.length(), len2 = text2.length();
		
		if (len1 == len2)
		
		{
		
		System.out.println("\n"+text1+" & "+text2+" string length are same ");
				
		char[] ch1 = text1.toCharArray(), ch2 = text2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean res = Arrays.equals(ch1, ch2);
				
		if (res)
		{
			System.out.println("\n"+text1+" & "+text2+" are Anagaram");
		}
		else
		{
			System.out.println("\n"+text1+" & "+text2+" not Anagaram");
		}
		
		}
		
		else
			
		{
			System.out.println("\n"+text1+" & "+text2+" string length not same, Therefore not Anagaram");
		}

		

	}

}
