package pk8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SungJuk {

	//�������=�ʵ�
	private String Std_num; //���� Ŭ���������� ��� ����
	private String Std_name;
	private int Java, Python, BigData;
	
	//������
	
	//�޼���
	public void Sum() {
		System.out.println("�հ� : "+(Java+Python+BigData));
	}
	public void Avg() {
		System.out.println("��� : "+(Java+Python+BigData)/3);
	}
	
	public static void main(String[] args) {
		SungJuk sj=new SungJuk();
		Scanner scan=new Scanner(System.in);
				 
		System.out.println("�̸� : ");		
		sj.Std_num=JOptionPane.showInputDialog("�й�");
		sj.Std_name=JOptionPane.showInputDialog("�̸�");
		sj.Java=Integer.parseInt(JOptionPane.showInputDialog("�ڹ�"));		
		sj.Python=Integer.parseInt(JOptionPane.showInputDialog("���̽�"));
		sj.BigData=Integer.parseInt(JOptionPane.showInputDialog("������"));
		
		
		System.out.println(sj.Std_num+" "+sj.Std_name+"�� �����Դϴ�.");
		sj.Sum();
		sj.Avg();
		

	}

}
