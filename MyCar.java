package week1.day1;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte i = 1;
		String carOwner = "Dinesh";
		String carReg = "SE66 YKV";
		String carBrand = "Hyundai";
		String carModel = "Tuscon";
		String carColor = "White";
		short carYear = 2022;		
		float carEngine = 2.2f;
		byte carSeats = 5;
		int carMileage = 00113344;
		long carChaseNumber = 123456789034123L;
		boolean carEngineOn = false;
		boolean carLightsOff = true;
		char previousOwners = '3';
		
		System.out.println(i+". Name of Owner: "+carOwner);
		System.out.println(++i+". Registraion Number: "+carReg);
		System.out.println(++i+". Name of the Brand: "+carBrand);
		System.out.println(++i+". Name of the Model: "+carModel);
		System.out.println(++i+". Color of the Car: "+carColor);
		System.out.println(++i+". Year of Manufacture: "+carYear);
		System.out.println(++i+". Car Engine Size: "+carEngine+" Petrol");
		System.out.println(++i+". Number of Seats: "+carSeats);
		System.out.println(++i+". Mileage Run: "+carMileage);
		System.out.println(++i+". Car Chase Number: "+carChaseNumber);
		System.out.println(++i+". Is the Car Engine on: "+carEngineOn);
		System.out.println(++i+". Has the Lights been Turned Off: "+carLightsOff);
		System.out.println(++i+". Number of PreviousOwners: "+previousOwners);
	}

}
