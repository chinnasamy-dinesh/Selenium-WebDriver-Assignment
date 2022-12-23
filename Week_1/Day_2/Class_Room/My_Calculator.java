package Week_1.Day_2.Class_Room;

public class My_Calculator {

	public static void main(String[] args) {
	
		Calculator obj = new Calculator ();
		
		int addCal = obj.add(10, 20, 30);
		int subCal = obj.sub(10, 20);
		double mulCal = obj.multi(10.10, 20.20);
		
		
		System.out.println("add: "+addCal);
		System.out.println("sub: "+subCal);
		System.out.println("mul: "+mulCal);
		System.out.println("div: "+obj.div(100.75f, 20.20f));

	}

}
