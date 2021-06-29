package pk11;

public class Student extends People{

	public int studentNum;
	
	public Student(String name,String ssn,int studentNum) {
		super(name,ssn); //오버로딩된 부모 생성자 호출
		this.studentNum=studentNum;
	}
}
