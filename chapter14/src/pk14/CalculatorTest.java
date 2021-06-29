package pk14;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1=10;
		int num2=5;
		
		Calc calc1=new ComputerCalc();
		//Calc calc2=new Calculator(); //추상클래스라 안됨
		
		//calc1.showInfo(); //ERROR : Cal타입이므로 Calc에 없는 메소드는 선언 불가능
		
		
		System.out.println("---디폴트 메소드---");
		calc1.description(); //디폴트 메소드 호출
		System.out.println();
		
		System.out.println("---static 메소드---");
		int[] arr= {1,2,3,4,5};
		System.out.println("1~5까지의 합 : "+Calc.total(arr)); //클래스명으로 들어와야함
		System.out.println();
		
		System.out.println("---인스턴스 메소드(추상) 호출---");
		
		System.out.println(calc1.add(20, 10));
		System.out.println(calc1.substract(20, 10));
		System.out.println(calc1.mult(20, 10));
		System.out.println(calc1.divide(20, 10));
		
		
		System.out.println("-------child 메소드-------");		
		ComputerCalc calc=new ComputerCalc();
		calc.showInfo();
	}

}
