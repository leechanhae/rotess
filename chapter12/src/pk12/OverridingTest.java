package pk12;

//���̺귯��
import test.Customer;
import test.VIPCustomer;

public class OverridingTest {

	public static void main(String[] args) {

		Customer cu=new Customer(10010,"��");
		//Car c=new Car();
		//������Ʈ������ ���� �ȵ�
		int price=100000;
		cu.bonusPoint=1000;
		System.out.println(cu.showCustomerInfo());
		System.out.println(cu.calcPrice(price));
		
		Customer vip=new VIPCustomer(3333, "���", 5000);
		vip.bonusPoint=20000000;
		System.out.println(vip.showCustomerInfo());
		System.out.println(vip.calcPrice(price));		
		
	}

}
