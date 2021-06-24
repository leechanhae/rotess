package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		// 기본 생성자로 객체를 만들되 객체의 이름은 R1
		ThisTest R1 = new ThisTest();
		/*
		 * R1.Move(); R1.Move(); R1.Rage();
		 */

		System.out.println("==객체2==");
		// swing으로 입력을 받아서 로봇의 속도와 나이를 출력		
		int R_speed;
		int R_age;
		String R_name;
		String R_num;
		R_speed = Integer.parseInt(JOptionPane.showInputDialog("속도 입력"));
		R_age= Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));
		R_name= JOptionPane.showInputDialog("이름 입력");
		R_num= JOptionPane.showInputDialog("번호 입력");
		
		ThisTest R2 = new ThisTest(R_speed,R_age,R_name,R_num);
		R2.Move();
		R2.Rage();
		R2.Rname();
		R2.Rnum();
		System.out.println();
		R2.Move();
		R2.Stop();
	}

}
