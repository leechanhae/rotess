package pk16;

public class AnonyInner {

	public void test() {
		
		//Ŭ���� ���ǰ� ����
		new TestInter() {

			@Override
			public void printData() {
				System.out.println("�͸��� Ŭ����");
			}

		}.printData(); //�������̽� Ŭ�����̹Ƿ� �籸��
	}

	public static void main(String[] args) {
		AnonyInner in=new AnonyInner();
		in.test();
	}

}
