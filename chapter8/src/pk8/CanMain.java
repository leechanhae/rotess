package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int money=0;
		String drink="";
		
		Vending ven = new Vending();
		ven.init(); //����� ���� �Ϸ� (�ʱ�ȭ)
		
		System.out.print("���� �Է��ϼ��� : ");
		money=scan.nextInt();
		ven.showCans(money);		
		
		System.out.print("������� ������ : ");
		drink=scan.next();
		ven.outCan(drink);

	}

}
