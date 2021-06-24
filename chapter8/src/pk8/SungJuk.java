package pk8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SungJuk {

	//멤버변수=필드
	private String Std_num; //동일 클래스에서만 사용 가능
	private String Std_name;
	private int Java, Python, BigData;
	
	//생성자
	
	//메서드
	public void Sum() {
		System.out.println("합계 : "+(Java+Python+BigData));
	}
	public void Avg() {
		System.out.println("평균 : "+(Java+Python+BigData)/3);
	}
	
	public static void main(String[] args) {
		SungJuk sj=new SungJuk();
		Scanner scan=new Scanner(System.in);
				 
		System.out.println("이름 : ");		
		sj.Std_num=JOptionPane.showInputDialog("학번");
		sj.Std_name=JOptionPane.showInputDialog("이름");
		sj.Java=Integer.parseInt(JOptionPane.showInputDialog("자바"));		
		sj.Python=Integer.parseInt(JOptionPane.showInputDialog("파이썬"));
		sj.BigData=Integer.parseInt(JOptionPane.showInputDialog("빅데이터"));
		
		
		System.out.println(sj.Std_num+" "+sj.Std_name+"의 성적입니다.");
		sj.Sum();
		sj.Avg();
		

	}

}
