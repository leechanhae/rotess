package pk12;

public class ComputerExample {

	public static void main(String[] args) {

		double r=123.3;
		
		Calculator cal=new Calculator();		
		System.out.println("Calculator�� �� : "+cal.areaCircle(r));
		
		
		Calculator com=new Computer();
		System.out.println("Computer�� �� : "+com.areaCircle(r));
		
	}

}
