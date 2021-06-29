package pk11;

public class D extends A {

	public D() {
		super();
		// A a = new A();
		this.field = "value"; // 상속받았을때 생성자에서 부모꺼 부르는건 this
		this.method();
	}

	public static void main(String[] args) {

		D d=new D();
		d.method();
	}

}
