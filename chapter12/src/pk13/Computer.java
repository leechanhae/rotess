package pk13;

public abstract class Computer {

	//�ϳ� �̻��� �߻� �޼��尡 ������ �߻� Ŭ������ �ȴ�
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
