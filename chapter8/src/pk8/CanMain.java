package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int money=0;
		String drink="";
		
		Vending ven = new Vending();
		ven.init(); //음료수 셋팅 완료 (초기화)
		
		System.out.print("돈을 입력하세요 : ");
		money=scan.nextInt();
		ven.showCans(money);		
		
		System.out.print("음료수를 고르세요 : ");
		drink=scan.next();
		ven.outCan(drink);

	}

}
