package pk8;

public class Student {

	// �ʵ�
	int studentID;
	String studentName;
	int grade;
	String address;

	// ������(�⺻������) : free complie

	// �޼ҵ�
	public void showStudnetInfo() {
		System.out.println(studentName + ", " + address);

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
