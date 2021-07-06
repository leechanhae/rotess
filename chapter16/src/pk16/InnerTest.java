package pk16;

import pk16.OutClass.InStaticClass;

class OutClass {

	// 외부 클래스 멤버변수
	private int num = 0;
	private static int sNum = 20;
	private InClass inClass; // 선언

	// 생성자를 통해서 내부 클래스의 객체를 생성한다
	public OutClass() {
		inClass = new InClass(); // 내부 클래스의 객체 생성
	}

	class InClass {
		int inNum = 100;

		void inTest() {
			System.out.println("OutClass num : " + num + "외부클래스 인스턴스 변수");
			System.out.println("OutClass sNum : " + sNum + "외부클래스 전역 변수");
			System.out.println("InClass innum : " + inNum + "내부클래스의 인스턴스 변수");
		}
	}

	// private 멤버변수시 사용권장
	public void usinClass() {
		inClass.inTest();
	}

	// 내부 정적(static)클래스
	static class InStaticClass {
		int inNum = 100;
		static int sinNum = 200;
		//num=500; //객체가 있어야 사용가능 

		void inTest() {
			//num=500;
			inNum = 101;
			sinNum = 201;
			sNum=300;
			System.out.println("InStaticClass inNum : " + inNum + "내부 인스턴스 변수");
			System.out.println("InStaticClass sinNum : " + sinNum + "내부 static 변수");
			System.out.println("InClass sNum : " + sNum + "외부클래스 static 변수");
		}
		
		static void sTest() {
			sinNum=200; //InstaticClass
			sNum=300; //외부
			//inNum=100; 생명주기가 틀림
			System.out.println("InStaticClass sinNum : " + sinNum + "내부 인스턴스 변수");
			System.out.println("OutClass sNum : " + sNum + "내부 static 변수");
			
		}
	}

}

public class InnerTest {

	public static void main(String[] args) {

		System.out.println("private 으로 변수 접근시 호출");
		OutClass outclass1 = new OutClass();
		outclass1.usinClass();
		System.out.println();

		System.out.println("외부클래스 먼저 생성후 내부클래스 호출");
		OutClass out = new OutClass();
		OutClass.InClass in = out.new InClass();
		in.inTest();
		System.out.println();
		
		//외부클래스를 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass ic=new OutClass.InStaticClass();
		System.out.println("정적 내부클래스의 일반 메소드");
		ic.inTest();
		System.out.println("정적 내부클래스의 static 메소드");
		InStaticClass.sTest();
	}

}
