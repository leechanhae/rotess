package pk12;

public class CalMain {

	public static void main(String[] args) {

		//CalculatorExam cal=new CalculatorExam();
		CalPlus plus=new CalPlus();
		CalMinus min=new CalMinus();
		System.out.println("Calplus : "+plus.getResult(18, 12));
		System.out.println("Calminus : "+min.getResult(30, 15));
		
	}

}
