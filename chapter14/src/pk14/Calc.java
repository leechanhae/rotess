package pk14;

public interface Calc {
	//heap ���
	
	//�ƹ��͵� �������� �ʾƵ� public static final double PI=3.14
	double PI = 3.14;
	int ERROR = -9999999;
	
	//public abstract ���� ����
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int mult(int num1,int num2);
	int divide(int num1,int num2);

	//����Ʈ �޼ҵ� : �����ǰ� �����ϴ�(��� �޴� Ŭ�������� �����ǰ� ����)
	default void description() {
	
		System.out.println("���� �����Դϴ�.");
	}
	
	//�迭 1,2,3,4,5
	static int total(int[] arr) {
		
		int total=0;
		
		for(int i:arr) {
			total+=i;
		}
		return total;
	}
	
	private void myMethod() {
		System.out.println("private �޼ҵ� �Դϴ�.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼ҵ� �Դϴ�.");
	}
	
}

//�������̽��� �߰���� (java8�̻�)

/*
 - ����Ʈ �޼ҵ� : �⺻������ ������ �޼ҵ�ν� ���� Ŭ�������� �����ǰ� �����ϴ�.
 - ����(static) : �ν��Ͻ� �������� ������� Ŭ���� Ÿ������ ��� ����
 - private : ������ �޼ҵ�ν� Ŭ���� ���ο����� ��밡��
 * */
