package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain2 {

	public static void main(String[] args) {

		ThisTest R1 = new ThisTest();		
		boolean run = true;

		System.out.println("==��ü2==");
		// swing���� �Է��� �޾Ƽ� �κ��� �ӵ��� ���̸� ���
		while (run) {			
			String str = JOptionPane.showInputDialog("�Է�");
			outer:
			if (str.equals("������")) {
				R1.Move();
				break outer;
			} else if (str.equals("����")) {
				R1.Stop();
				break outer;
			} else if (str.equals("����")) {
				R1.Rage();
				break outer;
			} else if (str.equals("�̸�")) {
				R1.Rname();
				break outer;
			} else if (str.equals("�κ���ȣ")) {
				R1.Rnum();
				break outer;
			} else if (str.equals("����")) {
				run = false;
			}
			else {
				JOptionPane.showMessageDialog(null, "Ʋ������");
			}
		}
	}

}
