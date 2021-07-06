package pk16;

public class MemberInner {

	// ��� ����
	int a = 10;
	private int b = 100;
	static int c = 200;

	// ���� Ŭ����
	class Inner {

		public void printData() {

			System.out.println("int a: "+a);
			System.out.println("private int b: "+b);
			System.out.println("static int c: "+c);
		}
	}

	public static void main(String[] args) {
		//main Ŭ���� ��ü ����
		MemberInner mi = new MemberInner();
		
		//���� Ŭ���� ��ü ����
		//����Ŭ������ ��ü outer�� ���ؼ� ��ü�� �����ؾ� �Ѵ�.
		MemberInner.Inner inn=mi.new Inner();
		//MemberInner.Inner inner=new MemberInner().new Inner();
		inn.printData();
	}

}