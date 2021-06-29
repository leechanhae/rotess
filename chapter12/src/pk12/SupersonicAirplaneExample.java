package pk12;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		for (int i = 1; i < 3; i++) {
			sa.flyMode = i;
			sa.fly();
		}
		sa.flyMode--;
		sa.fly();
		sa.land();
	}

}
