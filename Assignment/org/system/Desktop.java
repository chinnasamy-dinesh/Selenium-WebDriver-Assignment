package Week_3.Day_1.Assignment.org.system;

// Single Inheritance

public class Desktop extends Computer {

	public static void main(String[] args) 
	{
	Desktop d = new Desktop();
	d.computerModel();
	d.desktopSize();
	}
	
	public void desktopSize()
	{
		System.out.println("Desktop Size: 27 inch");
	}

}
