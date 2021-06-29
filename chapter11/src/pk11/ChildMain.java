package pk11;

public class ChildMain {

	public static void main(String[] args) {

		Child child=new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("--------------------");
		
		Parent pt=new Parent();
		pt.method1();
		pt.method2();
		pt.method3();
	}

}

