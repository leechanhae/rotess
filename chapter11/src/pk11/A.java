package pk11;

public class A {

	//같은 패키지에서는 protected라고 하더라도 public 의 역할을 한다
	//다른 패키지에서는 상속받은 자식클래스에는 public, 일반 클래스는 private의 성격을 갖는다
	protected String field; //디폴트는 동일 패키지에서만 쓸수있음
	//protected 상속을 받지 않아도 따라옴
	//상속을 받은 클래스에는 protected
	
	protected A() {
		
	}
	
	protected void method() {
		System.out.println("A class");
		System.out.println("field");
	}
}
