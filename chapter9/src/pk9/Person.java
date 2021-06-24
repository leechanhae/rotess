package pk9;

public class Person {

	String name;
	int age;
	
	Person() {
		this("이름없음",1);
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
		Person yesName=new Person("이찬해",28);
		
		//기본생성자 객체
		System.out.println(noName.name+", "+noName.age);
		//오버로딩생성자 객체
		System.out.println(yesName.name+", "+yesName.age);
		
		
	}

}
