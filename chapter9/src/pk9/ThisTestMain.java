package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		// �⺻ �����ڷ� ��ü�� ����� ��ü�� �̸��� R1
		ThisTest R1 = new ThisTest();
		/*
		 * R1.Move(); R1.Move(); R1.Rage();
		 */

		System.out.println("==��ü2==");
		// swing���� �Է��� �޾Ƽ� �κ��� �ӵ��� ���̸� ���		
		int R_speed;
		int R_age;
		String R_name;
		String R_num;
		R_speed = Integer.parseInt(JOptionPane.showInputDialog("�ӵ� �Է�"));
		R_age= Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		R_name= JOptionPane.showInputDialog("�̸� �Է�");
		R_num= JOptionPane.showInputDialog("��ȣ �Է�");
		
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
