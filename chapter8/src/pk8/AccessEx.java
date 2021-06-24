package pk8;

//접근한정자 실습
public class AccessEx {

	//멤버변수
	private int aa; //은닉화(동일 클래스에서만 사용 가능)
	public int bb; //공통
	int cc; //패키지가 같으면 사용 가능
	
	//메소드
	public void SetA(int a) {
		aa=a; //변수 이름이 다를 경우에는 this 안해도됨
		//private여도 public 메소드를 통해서 외부에서 사용 가능
	}
	
	public void SetB(int b) {
		bb=b;
	}
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("aa값 : "+aa+"\nbb값 : "+bb+"\ncc값 : "+cc);
	}

	public static void main(String[] args) {
		AccessEx ex=new AccessEx();
		
		ex.SetA(10); //메서드로 변수방 초기화
		ex.SetB(20);		
		ex.SetC(30);
		
		//ex.aa=10; //멤버변수 직접접근
		//ex.bb=20;
		//ex.cc=30;
		ex.Disp();
	}
}
