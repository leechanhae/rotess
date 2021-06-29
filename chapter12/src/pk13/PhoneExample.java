package pk13;

public class PhoneExample {

	public static void main(String[] args) {

		//추상클래스는 heap메모리를 사용할 수 없다.
		//Phone phone=new Phone(x);
		SmartPhone smart=new SmartPhone("ㅇㅇ");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();
	}
}
