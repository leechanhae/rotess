package pk12;

public class AnimalTest {

	public static void main(String[] args) {

		Animal ani = new Animal();
		Bear b = new Bear();
		Lion l=new Lion();
		Spider s=new Spider();
		

		System.out.println("---��---");
		System.out.println("�� : " + b.getEye());
		System.out.println("�ٸ� : " + b.getLeg());
		System.out.println(b.woong);
		System.out.println("---����---");
		System.out.println("�� : " + l.getEye());
		System.out.println("�ٸ� : " + l.getLeg());
		System.out.println("---�Ź�---");
		System.out.println("�� : " + s.getEye());
		System.out.println("�ٸ� : " + s.getLeg());

	}

}
