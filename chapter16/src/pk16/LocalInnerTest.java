package pk16;


public class LocalInnerTest {
	int a=100; //�ʵ�
	
	public void innerTest(int n) { //���ø޼ҵ�
		int b=200; //��������
		final int c=n; //���
		
		class Inner{
			public void getData() {
				System.out.println("int a : "+a);
				System.out.println("int b : "+b);
				System.out.println("final int c : "+c);
			}//getData
			
		}//���� Ŭ����
		//=============================================
		Inner in=new Inner();
		in.getData();
		
	}//���ø޼ҵ�

	
	public static void main(String[] args) {

		LocalInnerTest lit=new LocalInnerTest();
		lit.innerTest(5); //outter���� ������ �޼ҵ� (���� Ŭ������ �ƴ�)
		
	}

}
