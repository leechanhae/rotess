package pk8;

public class Studentsmain {
	
	public static void main(String[] args) {
		//�ʵ带 ����Ͽ� �̸��� �ּ� ���
		Student st=new Student();
		st.studentName="��ȣ��";
		st.address="��ȣ����";
		
		System.out.println("-----�ʵ� �̿�-----");
		System.out.println(st.studentName+", "+st.address);
		
		//�޼ҵ带 ����Ͽ� �̸��� �ּ� ���
		st.setStudentName("������");
		st.setAddress("��������");		
		
		System.out.println("-----�޼ҵ� �̿�-----");
		System.out.println(st.getStudentName()+", "+st.getAddress());

	}
}
