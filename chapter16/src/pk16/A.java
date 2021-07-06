package pk16;

public class A {

	public A() {
		System.out.println("A 객체가 생성됨");
	}

	// 인스턴스 클래스
	public class B {
		int field1;

		// static int field2;
		// 생성자
		public B() {
			System.out.println("B 객체가 생성됨");
		}

		// 메서드
		public void method() {
		}
		// static void method2() {}
	}

	static class C {
		int field1 = 10;
		static int field2;

		public C() {
			System.out.println("C객체가 생성됨");
		}

		public void method() {
		}

		static void method2() {
		}
	}

	// 메소드
	void method() {
		// 로컬 클래스

		class D {
			public D() {
				System.out.println("D 객체가 생성됨");
			}

			int field1;

			// static int field2;
			public void method1() {
			}
			// static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
