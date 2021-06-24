package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain2 {

	public static void main(String[] args) {

		ThisTest R1 = new ThisTest();		
		boolean run = true;

		System.out.println("==객체2==");
		// swing으로 입력을 받아서 로봇의 속도와 나이를 출력
		while (run) {			
			String str = JOptionPane.showInputDialog("입력");
			outer:
			if (str.equals("움직여")) {
				R1.Move();
				break outer;
			} else if (str.equals("멈춰")) {
				R1.Stop();
				break outer;
			} else if (str.equals("나이")) {
				R1.Rage();
				break outer;
			} else if (str.equals("이름")) {
				R1.Rname();
				break outer;
			} else if (str.equals("로봇번호")) {
				R1.Rnum();
				break outer;
			} else if (str.equals("종료")) {
				run = false;
			}
			else {
				JOptionPane.showMessageDialog(null, "틀린문자");
			}
		}
	}

}
