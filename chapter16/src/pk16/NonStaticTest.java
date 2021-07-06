package pk16;

import javax.swing.JOptionPane;

class Out2{
	//멤버 변수(=인스턴스 변수) 
	static int a=1;
	String str=""; //메모리 영역이 다름
	//생성자
	
	public class In{
		
		//생성자
		
		String Infun() {
			return(a+"번째 Non-Static 내부 클래스");
		}
	}
	
}

public class NonStaticTest {

	public static void main(String[] args) {
		String str="";
		
		//외부 클래스
		Out2 obj1=new Out2();
		
		//내부 클래스 객체 생성
		Out2.In obj2=obj1.new In(); //객체 생성임
		
		str=obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
	}

}
