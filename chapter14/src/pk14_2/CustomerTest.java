package pk14_2;

public class CustomerTest {

	public static void main(String[] args) {

		Customer cu = new Customer();
		System.out.println("buy");
		Buy buyer = cu;
		buyer.buy();
		buyer.order();
		System.out.println("sell");
		Sell seller = cu;
		seller.sell();
		seller.order();

		if (buyer instanceof Customer) {
			Customer customer2 = (Customer) buyer; // 다운캐스팅
			System.out.println("----Down Casting---");
			customer2.buy();
			customer2.sell();
		}

		System.out.println("---Customer---");
		cu.order();

	}

}
