package pk9;

public class Overload {

	private int age;
	private float height;
	private String name;
	
	public Overload() {
		age=0;
		height=0.0f;
		name="�͸�";
	}
	
	public Overload(int age,float height) {
		this.age=age;
		this.height=height;
	}
	
	public Overload(int age,float height,String name) {
		this.age=age;
		this.height=height;
		this.name=name;
	}
	
	public void Disp() {
		
		System.out.println("���� : "+age);
		System.out.println("Ű : "+height);
		System.out.println("�̸� : "+name);
	}
}
