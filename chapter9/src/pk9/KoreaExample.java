package pk9;

public class KoreaExample {

	public static void main(String[] args) {

		Korea k3=new Korea();
		Korea kr=new Korea("�̱�", "������");
		Korea k1=new Korea("���ѹα�", "������");
		
		System.out.println(kr.nation+", "+kr.name);
		System.out.println(k1.nation+", "+k1.name);
		System.out.println(k3.nation+", "+k3.name);
	}

}
