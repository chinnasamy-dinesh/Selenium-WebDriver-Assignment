package week_1.Day_2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=15;
		
		int fact=1;
		
		for (int i = 1; i <= input; i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println("Fact of "+input+": "+fact);


	}

}
