package pk16;

public class A {

	public A() {
		System.out.println("A ��ü�� ������");
	}

	// �ν��Ͻ� Ŭ����
	public class B {
		int field1;

		// static int field2;
		// ������
		public B() {
			System.out.println("B ��ü�� ������");
		}

		// �޼���
		public void method() {
		}
		// static void method2() {}
	}

	static class C {
		int field1 = 10;
		static int field2;

		public C() {
			System.out.println("C��ü�� ������");
		}

		public void method() {
		}

		static void method2() {
		}
	}

	// �޼ҵ�
	void method() {
		// ���� Ŭ����

		class D {
			public D() {
				System.out.println("D ��ü�� ������");
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
