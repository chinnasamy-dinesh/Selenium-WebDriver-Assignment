package Week_3.Day_1.Assignment;

// Method Overloading

public class Calculator {

	public static void main(String[] args) 
	
	{
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.add(10, 20, 30);
		cal.mul(10, 1.1);
		cal.mul(1.20, 1.30);
		cal.sub(20.20, 10.10);
		cal.sub(40, 20);
	}
	
	public void add(int a, int b) 
	{
	System.out.println("Addition using 2 int args: "+(a+b));
	}
	
	public void add(int a, int b, int c) 
	{
	System.out.println("Addition using 3 int args: "+(a+b+c));
	}
	
	public void sub(double a, double b) 
	{
	System.out.println("\nSubraction using 2 double args: "+(a-b));
	}
	
	public void sub(int a, int b) 
	{
	System.out.println("Subraction using 2 int args: "+(a-b));
	}
	
	public void mul(int a, double b) 
	{
	System.out.println("\nMultplication using 1 int & 1 double args: "+(a*b));
	}
	
	public void mul(double a, double b) 
	{
	System.out.println("Multplication using 2 double args: "+(a*b));
	}

}
