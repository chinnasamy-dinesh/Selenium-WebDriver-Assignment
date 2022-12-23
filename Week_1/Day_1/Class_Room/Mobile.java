package Week_1.Day_1.Class_Room;

public class Mobile {

	public void makeCall () {
			System.out.println("Method 1: Call 0123456789");
	}
	public void sendMsg() {
		System.out.println("Method 2: Hi");
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
	}
}
