

package Week_1.Day_2.Assignment;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] textSplit = text.split(" ");
		
		for (int i = 0; i < textSplit.length; i++) 
		{
			
		for (int j = i+1; j < textSplit.length; j++) 
		{
		if (textSplit[i].equals(textSplit[j]))
		{
			textSplit[j]="";
		}
		}
		// System.out.print(textSplit[i]+" ");
		}
	
		for (int i = 0; i < textSplit.length; i++) 
		{
			
			System.out.print(textSplit[i]+" ");
			
		}
			
	}
}

