package pk13;

public abstract class Phone {

	public String owner;
	
	/*public Phone() {
		// TODO Auto-generated constructor stub
	}*/
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
