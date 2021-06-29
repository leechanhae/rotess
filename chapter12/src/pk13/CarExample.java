package pk13;

public class CarExample {

	public static void main(String[] args) {

		/*
		 * ManualCar mc=new ManualCar(); mc.startCar(); mc.drive(); mc.stop();
		 * mc.turnOff();
		 */
		method(new ManualCar());
		System.out.println();
		method(new AICar());
	}
	
	public static void method(Car car) {
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
	}
	

}
