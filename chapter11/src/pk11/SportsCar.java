package pk11;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed : "+speed);
	}
	/* final 메서드는 오버라이딩 불가능
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed=0;
	}
	*/

	public static void main(String[] args) {

		SportsCar ac=new SportsCar();
		ac.speedUp();
		ac.stop();
	}

}
