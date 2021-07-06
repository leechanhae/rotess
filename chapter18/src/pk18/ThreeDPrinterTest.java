package pk18;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter printPowder=new ThreeDPrinter();
		Powder p1=new Powder();
		
		printPowder.setMaterial(p1);
		//다운캐스팅
		Powder p2=(Powder)printPowder.getMaterial();
		
		System.out.println(p2);
		
		Plastic p3=new Plastic();
		printPowder.setMaterial(p3);
		Plastic p4=(Plastic)printPowder.getMaterial();
		System.out.println(p4);
		
		
		
		
	}

}
