package Week_2.Day_2;

import java.util.Scanner;

public class Find_Types 

{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	
	{
		//System.out.print("Please Enter a Line of String Text: "); 
		//String str = sc.next();
		
		String str = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else
			{
				specialChar++;
			}
				
		}
		
		System.out.println("Give String is: " + str);
		System.out.println("\nNumber of Letters in the above given String is: " + letter);
		System.out.println("\nNumber of spaces in the above given String is: " + space);
		System.out.println("\nTotal Numbers in the above given string is: " + num);
		System.out.println("\nNumber of Special Charcters in the above given String is: " + specialChar);

	}

}
