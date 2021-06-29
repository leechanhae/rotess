package pk13;

public abstract class Computer {

	//하나 이상의 추상 메서드가 있으면 추상 클래스가 된다
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
