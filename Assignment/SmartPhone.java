package Week_3.Day_1.Assignment;

//Multilevel Inheritance & takeVideo method from AndroidPhone Class Overriding

public class SmartPhone extends AndroidPhone
{
	
	public static void main(String[] args)
	{
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsApp();
		
	}
	
	public void takeVideo()
	{
		System.out.println("Video taken - Method Override Completed");
	}	
	
	public void connectWhatsApp()
	{
		System.out.println("Connect WhatsApp");
	}
	
}