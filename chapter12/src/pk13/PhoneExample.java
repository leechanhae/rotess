package pk13;

public class PhoneExample {

	public static void main(String[] args) {

		//�߻�Ŭ������ heap�޸𸮸� ����� �� ����.
		//Phone phone=new Phone(x);
		SmartPhone smart=new SmartPhone("����");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();
	}
}
