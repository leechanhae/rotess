package pk14;

public class ComputerCalc extends Calculator {

	@Override
	public int mult(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {

		if (num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR; // static 클래스형 변수이므로 클래스명으로 명시
	}

	// 오버라이딩 가능하나 필수는 아님
	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니다.");
	}

	// 구현 메소드
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현부");
	}

}
