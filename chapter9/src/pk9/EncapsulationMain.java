package pk9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {

		int side;
		int height;
		int area;		
		String str="";
				
		side=Integer.parseInt(JOptionPane.showInputDialog("����"));
		height=Integer.parseInt(JOptionPane.showInputDialog("����"));		
		Encapsulation en=new Encapsulation();		
		area=en.Cal_Area(side, height);
		str="�簢���� ���̴� "+area+"�Դϴ�.";
		JOptionPane.showMessageDialog(null, "�簢���� ���̴� "+area+"�Դϴ�.");
		System.out.println(str);
	}

}
