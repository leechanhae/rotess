package pk11;

import java.util.Scanner;

public class Cusmain {

	public static void main(String[] args) {

		Customer cu = new Customer();
		int price = 10000;
		cu.setCustomerName("ww");
		int cuprice=cu.calcPrice(price);
		System.out.println(cu.showCustomerInfo());		
				
		VIPCustomer vip = new VIPCustomer(123, "qq", 22);
		Customer vip2 = new VIPCustomer(12344, "qwee", 4422);
		//상속 받은거라 이렇게 해도 됨
		int vipPrice=vip.calcPrice(price);
		System.out.println(vip.showCustomerInfo());
		System.out.println(vip2.showCustomerInfo());
		System.out.println("지불한 금액은 " + vipPrice + "원 입니다.");

	}

}
