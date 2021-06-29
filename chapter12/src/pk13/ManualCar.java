package pk13;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("속도위반을 하진 않습니다.");
	}

	@Override
	public void stop() {
		System.out.println("안전선을 넘지는 않습니다.");
	}

}
