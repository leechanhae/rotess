package pk16;

import java.util.Scanner;

public class EnumMain {

	//enum Ŭ����
	public enum Item{
		Start, Pause, Exit
	}
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("0:���ӽ���");
			System.out.println("1:�Ͻ�����");
			System.out.println("2:��������");
			
			Scanner scan=new Scanner(System.in);
			System.out.print("����>>");
			int n=scan.nextInt();
			
			Item start=Item.Start;
			Item pause=Item.Pause;
			Item exit=Item.Exit;
			
			//System.out.println(start.ordinal());
			if(n==start.ordinal()) {
				System.out.println("���� ����");
			}else if(n==pause.ordinal()) {
				System.out.println("�Ͻ�����");
			}else if(n==exit.ordinal()) {
				System.out.println("����");
				return;
			}else {
				System.out.println("no option");
			}
		}
	}

}
