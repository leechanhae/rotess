package pk17;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1 = new Person("ȫ�浿");
		System.out.println(person1);

		Class pClass = Class.forName("pk17.Person");
		System.out.println(pClass);
		
		//�� ������ �޼ҵ�
		Person person2=(Person)pClass.newInstance();
		System.out.println(person2);		
		
		String str="";

	}

}
