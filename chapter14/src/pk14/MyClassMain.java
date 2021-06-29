package pk14;

public class MyClassMain {

	public static void main(String[] args) {

		MyInterface mc=new MyClass();
		X x=mc;
		Y y=mc;
		
		x.x();
		y.y();
		mc.myMethod();
		
		MyInterface iClass=mc;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}

}
