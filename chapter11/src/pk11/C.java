package pk11;

//���̺귯��
public class C {
	
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}

	public static void main(String[] args) {

		C c = new C();
		c.method();
	}

}
