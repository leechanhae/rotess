package pk15;

public class Student {

	int studentid;
	String studentName;

	public Student(int studentid, String studentName) {
		this.studentid = studentid;
		this.studentName = studentName;
	}

	public String toString() {
		return studentid + "," + studentName;
	}

	@Override
	public int hashCode() {
		
		return studentid;
	}

	@Override
	public boolean equals(Object obj) {//equals(Student std)

		if(obj instanceof Student) {
			Student std=(Student)obj;
		//DataBase�� �ִ� ��(studentid)�� ���� �α����� ���� �Է��� ��(std.studentid)�� ������ ��
			if(studentid==std.studentid)
				return true;
			else return false;
	}
		return false;
}

}
