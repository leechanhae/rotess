package pk12;

public class CalMinus extends CalculatorExam {

	@Override
	public int getResult(int n1, int n2) {

		int gap=0;
		if (n1 >= n2) {
			gap = n1 - n2;
		}
		return gap;
	}

}
