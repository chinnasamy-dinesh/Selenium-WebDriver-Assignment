package Week_3.Day_1.Class_Room;

public class Auto extends Vehicle{
	
	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.applyBrake();
		
		Car car = new Car();
		car.applyBrake();
		
		Vehicle veh = new Vehicle();
		veh.applyBrake();
	}
}