package pk15;

public class StringEqualsExample {
	public static void main(String[] args) {

		String strVal1 = new String("ȫ�浿");
		String strVal2 = "ȫ�浿";

		if (strVal1 == strVal2) {
			System.out.println("���� String ��ü ����");
		} else {
			System.out.println("�ٸ� String ��ü ����");
		}

		if (strVal1.equals(strVal2)) {
			System.out.println("���� ���ڿ� ����");
		} else {
			System.out.println("�ٸ� ���ڿ� ����");
		}
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2); //heap memory
		System.out.println(i1.equals(i2)); //����
	}
}
