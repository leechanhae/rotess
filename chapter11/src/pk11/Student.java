package pk11;

public class Student extends People{

	public int studentNum;
	
	public Student(String name,String ssn,int studentNum) {
		super(name,ssn); //�����ε��� �θ� ������ ȣ��
		this.studentNum=studentNum;
	}
}
