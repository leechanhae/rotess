package pk12;

public class AnimalTest {

	public static void main(String[] args) {

		Animal ani = new Animal();
		Bear b = new Bear();
		Lion l=new Lion();
		Spider s=new Spider();
		

		System.out.println("---磅---");
		System.out.println("传 : " + b.getEye());
		System.out.println("促府 : " + b.getLeg());
		System.out.println(b.woong);
		System.out.println("---荤磊---");
		System.out.println("传 : " + l.getEye());
		System.out.println("促府 : " + l.getLeg());
		System.out.println("---芭固---");
		System.out.println("传 : " + s.getEye());
		System.out.println("促府 : " + s.getLeg());

	}

}
