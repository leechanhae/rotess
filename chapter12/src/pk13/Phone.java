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
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
