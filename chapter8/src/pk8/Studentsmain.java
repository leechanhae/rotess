package pk8;

public class Studentsmain {
	
	public static void main(String[] args) {
		//필드를 사용하여 이름과 주소 출력
		Student st=new Student();
		st.studentName="이호진";
		st.address="이호진네";
		
		System.out.println("-----필드 이용-----");
		System.out.println(st.studentName+", "+st.address);
		
		//메소드를 사용하여 이름과 주소 출력
		st.setStudentName("박찬경");
		st.setAddress("박찬경집");		
		
		System.out.println("-----메소드 이용-----");
		System.out.println(st.getStudentName()+", "+st.getAddress());

	}
}
