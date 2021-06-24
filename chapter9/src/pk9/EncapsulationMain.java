package pk9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {

		int side;
		int height;
		int area;		
		String str="";
				
		side=Integer.parseInt(JOptionPane.showInputDialog("가로"));
		height=Integer.parseInt(JOptionPane.showInputDialog("세로"));		
		Encapsulation en=new Encapsulation();		
		area=en.Cal_Area(side, height);
		str="사각형의 넓이는 "+area+"입니다.";
		JOptionPane.showMessageDialog(null, "사각형의 넓이는 "+area+"입니다.");
		System.out.println(str);
	}

}
