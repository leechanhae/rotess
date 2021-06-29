package pk13;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("재주껏 잘 갑니다.");
	}

	@Override
	public void stop() {
		System.out.println("치기전에 멈추긴 합니다.");
	}

}
