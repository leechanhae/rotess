package pk9;

public class Person {

	String name;
	int age;
	
	Person() {
		this("�̸�����",1);
	}
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	Person returnSelf() {
		return this;
	}
	
	public static void main(String[] args) {

		Person noName=new Person();
		Person yesName=new Person("������",28);
		
		//�⺻������ ��ü
		System.out.println(noName.name+", "+noName.age);
		//�����ε������� ��ü
		System.out.println(yesName.name+", "+yesName.age);
		
		
	}

}
