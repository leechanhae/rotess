package pk16;

import javax.swing.JOptionPane;

//out 클래스
class Out{
	
	static int a=1; //객체 생성과 상관없이 사용가능(독립적)
	int b; //객체를 통해서 사용
	
	//객체 생성과 상관없이 사용가능(독립적)
	public static class In{
		String Infun() {
			return a+"번째 Static 내부 클래스입니다.";
		}
	}
}

public class EmbedTest {

	public static void main(String[] args) {
		String str="";
		//생략 static은 객체없이 클래스명으로 접근
		//Out out=new Out(); //생략
		Out.In in=new Out.In();	//static이라 직접 접근
		JOptionPane.showMessageDialog(null, in.Infun()+"\n Success");
	}

}
