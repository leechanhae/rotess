package pk17;

public class StBufferTest {

	public static void main(String[] args) {

		String str="";
		
		StringBuffer buf=new StringBuffer("Nice Day!!!");
		
		//���ڿ� ó��
		System.out.println(buf.toString());
		//���ڿ��� ũ��
		System.out.println(buf.length());
		//���ڿ��� �뷮(�⺻16���ٰ� ���ڿ�ũ�� �߰�)
		System.out.println(buf.capacity());
		//StringBuffer �뷮����(������ �뷮���� ū���� �Ű����� ���� 2��+2)
		//�ι�+2 �̻��� �� ���Խ� ������ ũ��� ��ȯ������ ������
		buf.ensureCapacity(50);
		System.out.println(buf.capacity());
		//StringBuffer ���ڿ��� ���ο� ���ڿ��� �Ϻγ�������
		buf.insert(0,"Hi! ");
		buf.insert(13," Everybody!");
		System.out.println(buf);
		//StringBuffer ���ڿ��� �Ϻγ��� ����
		buf.delete(0, 4); //0��°���� �����ؼ� 4���� �����
		System.out.println(buf);
		
		
	}

}
