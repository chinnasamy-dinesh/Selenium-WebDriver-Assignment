package Week_3.Day_1.Class_Room;

public class Car extends Vehicle{

	private void openSunRoof() {
		System.out.println("Open Sun Roof");
	}
	
	public void applyBrake() {
		System.out.println("Apply Brake in child class");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.openSunRoof();
		car.applyBrake();
		car.soundHorn();
	}
}