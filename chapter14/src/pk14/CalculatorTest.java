package pk14;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1=10;
		int num2=5;
		
		Calc calc1=new ComputerCalc();
		//Calc calc2=new Calculator(); //�߻�Ŭ������ �ȵ�
		
		//calc1.showInfo(); //ERROR : CalŸ���̹Ƿ� Calc�� ���� �޼ҵ�� ���� �Ұ���
		
		
		System.out.println("---����Ʈ �޼ҵ�---");
		calc1.description(); //����Ʈ �޼ҵ� ȣ��
		System.out.println();
		
		System.out.println("---static �޼ҵ�---");
		int[] arr= {1,2,3,4,5};
		System.out.println("1~5������ �� : "+Calc.total(arr)); //Ŭ���������� ���;���
		System.out.println();
		
		System.out.println("---�ν��Ͻ� �޼ҵ�(�߻�) ȣ��---");
		
		System.out.println(calc1.add(20, 10));
		System.out.println(calc1.substract(20, 10));
		System.out.println(calc1.mult(20, 10));
		System.out.println(calc1.divide(20, 10));
		
		
		System.out.println("-------child �޼ҵ�-------");		
		ComputerCalc calc=new ComputerCalc();
		calc.showInfo();
	}

}
