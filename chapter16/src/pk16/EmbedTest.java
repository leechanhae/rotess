package pk16;

import javax.swing.JOptionPane;

//out Ŭ����
class Out{
	
	static int a=1; //��ü ������ ������� ��밡��(������)
	int b; //��ü�� ���ؼ� ���
	
	//��ü ������ ������� ��밡��(������)
	public static class In{
		String Infun() {
			return a+"��° Static ���� Ŭ�����Դϴ�.";
		}
	}
}

public class EmbedTest {

	public static void main(String[] args) {
		String str="";
		//���� static�� ��ü���� Ŭ���������� ����
		//Out out=new Out(); //����
		Out.In in=new Out.In();	//static�̶� ���� ����
		JOptionPane.showMessageDialog(null, in.Infun()+"\n Success");
	}

}
