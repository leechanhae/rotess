package pk15;

public class ValueCompareTest {

	public static void main(String[] args) {
		System.out.println("[-128~127 �ʰ����� ���]"); //byte,int,short
		Integer obj1=300;
		Integer obj2=300;
		
		System.out.println("1. ��� : "+(obj1==obj2));//��ü �ּ� ��
		System.out.println("2. ��ڽ� �� : "+(obj1.intValue()==obj2.intValue()));//���� �� ��
		System.out.println("3. equals() ��� : "+(obj1.equals(obj2)));//���� �� ��
		System.out.println();
		
		Integer obj3=100;
		Integer obj4=100;
		System.out.println(obj3==obj4);
		System.out.println(obj3.intValue()==obj4.intValue());
		System.out.println(obj3.equals(obj4));
	}
}
