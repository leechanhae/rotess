package pk9;

public class Person2Main {

	public static void main(String[] args) {

		Person2 per2=new Person2();		
		per2.name="김유신";
		per2.weight=(float) 85.5;
		per2.height=(float) 185.0;
		System.out.println(per2.name+","+per2.weight+", "+per2.height);
		
		Person2 pp=new Person2("사람",188.4f,99.2f);
		System.out.println("===================================");
		System.out.println("이름 : "+pp.name);
		System.out.println("키 : "+pp.height);
		System.out.println("몸무게 : "+pp.weight);
	}

}
