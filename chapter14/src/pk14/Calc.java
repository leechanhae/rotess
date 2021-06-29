package pk14;

public interface Calc {
	//heap 사용
	
	//아무것도 선언하지 않아도 public static final double PI=3.14
	double PI = 3.14;
	int ERROR = -9999999;
	
	//public abstract 생략 가능
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int mult(int num1,int num2);
	int divide(int num1,int num2);

	//디폴트 메소드 : 재정의가 가능하다(상속 받는 클래스에서 재정의가 가능)
	default void description() {
	
		System.out.println("정수 계산기입니다.");
	}
	
	//배열 1,2,3,4,5
	static int total(int[] arr) {
		
		int total=0;
		
		for(int i:arr) {
			total+=i;
		}
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메소드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메소드 입니다.");
	}
	
}

//인터페이스의 추가요소 (java8이상)

/*
 - 디폴트 메소드 : 기본구성을 가지는 메소드로써 구현 클래스에서 재정의가 가능하다.
 - 정적(static) : 인스턴스 생성과는 상관없이 클래스 타입으로 사용 가능
 - private : 구현부 메소드로써 클래스 내부에서만 사용가능
 * */
