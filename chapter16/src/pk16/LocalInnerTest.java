package pk16;


public class LocalInnerTest {
	int a=100; //필드
	
	public void innerTest(int n) { //로컬메소드
		int b=200; //지역변수
		final int c=n; //상수
		
		class Inner{
			public void getData() {
				System.out.println("int a : "+a);
				System.out.println("int b : "+b);
				System.out.println("final int c : "+c);
			}//getData
			
		}//내부 클래스
		//=============================================
		Inner in=new Inner();
		in.getData();
		
	}//로컬메소드

	
	public static void main(String[] args) {

		LocalInnerTest lit=new LocalInnerTest();
		lit.innerTest(5); //outter에서 정의한 메소드 (내부 클래스가 아님)
		
	}

}
