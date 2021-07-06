package pk17;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// ���1
		Person person = new Person();
		//getClass(); Ŭ������ ������ ������
		Class pClass1 = person.getClass(); // Object���� �ִ� �޼ҵ�� PersonŬ������ ���� ������
		System.out.println(pClass1.getName()); //�����߿��� �̸��� ������
		
		// ���2
		Class pClass2=Person.class; //���� Ŭ���������� Ŭ������ ���� ��������
		System.out.println(pClass2.getName());
		
		// ���3 :Ŭ�������� �˰� �ִٴ� �����Ͽ�
		Class pClass3=Class.forName("pk17.Person");
		//������ �̸��� Ŭ������ ���� ��� : ClassNotFoundException �߻��ϵ��� ������
		System.out.println(pClass3.getName());

	}

}
