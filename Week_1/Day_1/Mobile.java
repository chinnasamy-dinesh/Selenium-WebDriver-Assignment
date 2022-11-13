package Week_1.Day_1;

public class Mobile {
	
	public void var ()
	{
		String str = "Apple";
		char c = 'A';
		short srt = 4;
		int num = 11223344;
		long num1 = 10000110002223330l;
		float num2 = 79999.99221f;
		boolean num3 = false;	
		
		System.out.println("mobileBrandName: "+str);
		System.out.println("mobileLogo: "+c);
		System.out.println("noOfMobilePiece: "+srt);
		System.out.println("modelNumber: "+num);
		System.out.println("mobileImeiNumber: "+num1);
		System.out.println("mobilePrice: "+num2);
		System.out.println("Any of the Mobile Piece is Damaged: "+num3);
		
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.var();
	}
}
