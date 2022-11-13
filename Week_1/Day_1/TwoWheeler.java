package Week_1.Day_1;

public class TwoWheeler 

{
	public void two()
	{
		int a = 2;
		short b = 2;
		long c = 112233445566778899l;
		boolean d = false;
		String e = "Duke-LZ";
		double f = 22211.45;
		
		System.out.println("noOfWheels: "+a);
		System.out.println("noOfMirrors: "+b);
		System.out.println("chassisNumber: "+c);
		System.out.println("isPunctured: "+d);
		System.out.println("bikeName: "+e);
		System.out.println("runningKM: "+f);
	}
	
	public static void main(String[] args) 
	{
		TwoWheeler obj = new TwoWheeler();
		obj.two();
	}
		
}
