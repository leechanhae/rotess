package pk15;

public class IntegerTest {

	public static void main(String[] args) {

		//Integer i=new Integer(100); //����� �������� ����
		
		Integer num=100;
		int iNum=num.intValue(); //Integer Ŭ�������� ���� ������
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(iNum);
		System.out.println(sum);
		
		//UnBoxing
		int total=num+jNum;//num.intValue(); ���� ��ȯ
		System.out.println(total);
		
		//Boxing == AutoBoxing
		Integer i=jNum;
		System.out.println(i);//Integer.ValueOf(); ���� ��ȯ
		
	}

}
