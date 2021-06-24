package pk9;

public class ConsTest {

	private int aa;
	private int bb;
	
	public ConsTest(int aa,int bb) {
		this.aa=aa;
		this.bb=bb;
	}
	
	public static void main(String[] args) {

		ConsTest cin=new ConsTest(6, 18);
		int a=cin.aa;
		int b=cin.bb;
		System.out.println(a);
		System.out.println(b);
		
	}

}
