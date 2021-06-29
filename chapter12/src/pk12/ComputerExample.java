package pk12;

public class ComputerExample {

	public static void main(String[] args) {

		double r=123.3;
		
		Calculator cal=new Calculator();		
		System.out.println("Calculator의 값 : "+cal.areaCircle(r));
		
		
		Calculator com=new Computer();
		System.out.println("Computer의 값 : "+com.areaCircle(r));
		
	}

}
