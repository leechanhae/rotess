package pk18_1;

public class GenericPrinterTest{

	public static void main(String[] args) {
		
		
		GenericPrinter<Powder> powderPrint=new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		
		//형변환 필요없다
		Powder powder=powderPrint.getMaterial();
		System.out.println(powder);		
		System.out.println("==============");
		powderPrint.print();
		
		GenericPrinter<Plastic> plasticPrint=new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic=plasticPrint.getMaterial();
		System.out.println(plastic);
		System.out.println("==============");
		plasticPrint.print();
		
		
		
		/*GenericPrinter<Water> waterPrint=new GenericPrinter<Water>();
		waterPrint.setMaterial(new Water());
		Water water=waterPrint.getMaterial();
		System.out.println(water);*/
	}
	
}
