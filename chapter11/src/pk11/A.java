package pk11;

public class A {

	//���� ��Ű�������� protected��� �ϴ��� public �� ������ �Ѵ�
	//�ٸ� ��Ű�������� ��ӹ��� �ڽ�Ŭ�������� public, �Ϲ� Ŭ������ private�� ������ ���´�
	protected String field; //����Ʈ�� ���� ��Ű�������� ��������
	//protected ����� ���� �ʾƵ� �����
	//����� ���� Ŭ�������� protected
	
	protected A() {
		
	}
	
	protected void method() {
		System.out.println("A class");
		System.out.println("field");
	}
}
