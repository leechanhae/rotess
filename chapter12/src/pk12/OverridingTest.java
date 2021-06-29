package pk12;

//라이브러리
import test.Customer;
import test.VIPCustomer;

public class OverridingTest {

	public static void main(String[] args) {

		Customer cu=new Customer(10010,"나");
		//Car c=new Car();
		//프로젝트끼리는 참조 안됨
		int price=100000;
		cu.bonusPoint=1000;
		System.out.println(cu.showCustomerInfo());
		System.out.println(cu.calcPrice(price));
		
		Customer vip=new VIPCustomer(3333, "흑우", 5000);
		vip.bonusPoint=20000000;
		System.out.println(vip.showCustomerInfo());
		System.out.println(vip.calcPrice(price));		
		
	}

}
