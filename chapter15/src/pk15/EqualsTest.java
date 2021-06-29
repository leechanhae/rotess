package pk15;

public class EqualsTest {

	public static void main(String[] args) {

		Student studentLee = new Student(10000, "���ڹ�");
		Student studentLee2 = studentLee;
		Student studentKim = new Student(10000, "���ڹ�");

		System.out.println("������ �ּ��� �� �ν��Ͻ� ��");
		if (studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		}
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� ������ �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentLee2�� ������ �ٸ��ϴ�.");
		}

		System.out.println("�ٸ� �ּ��� �� �ν��Ͻ� ��");
		if (studentLee == studentKim) {
			System.out.println("studentLee�� studentKim�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentKim�� �ּҴ� �ٸ��ϴ�.");
		}
		if (studentLee.equals(studentKim)) {
			System.out.println("studentLee�� studentKim�� ������ �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentKim�� ������ �ٸ��ϴ�.");
		}
		
		System.out.println("���� �ּ��� �ؽ��ڵ� ��");
		if(studentLee.hashCode()==studentLee2.hashCode()) {
			System.out.println("studentLee�� studentLee2�� �ؽ��ڵ�� �����ϴ�.");
		}else {
			System.out.println("studentLee�� studentLee2�� �ؽ��ڵ�� �ٸ��ϴ�.");
		}
		System.out.println("�ٸ� �ּ��� �ؽ��ڵ� ��");
		if(studentLee.hashCode()==studentKim.hashCode()) {
			System.out.println("studentLee�� studentKim�� �ؽ��ڵ�� �����ϴ�.");
		}else {
			System.out.println("studentLee�� studentKim�� �ؽ��ڵ�� �ٸ��ϴ�.");
		}
		
		System.out.println(System.identityHashCode(studentLee));
		System.out.println(System.identityHashCode(studentLee2));
		System.out.println(System.identityHashCode(studentKim));
	}

}
