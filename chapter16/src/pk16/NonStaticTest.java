package pk16;

import javax.swing.JOptionPane;

class Out2{
	//��� ����(=�ν��Ͻ� ����) 
	static int a=1;
	String str=""; //�޸� ������ �ٸ�
	//������
	
	public class In{
		
		//������
		
		String Infun() {
			return(a+"��° Non-Static ���� Ŭ����");
		}
	}
	
}

public class NonStaticTest {

	public static void main(String[] args) {
		String str="";
		
		//�ܺ� Ŭ����
		Out2 obj1=new Out2();
		
		//���� Ŭ���� ��ü ����
		Out2.In obj2=obj1.new In(); //��ü ������
		
		str=obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
	}

}
