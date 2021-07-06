package pk18_1;

public class GenericMethod {

	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		//가로 T
		double left=((Number)p1.getX()).doubleValue();//0 숫자로 바꾸고 더블형태로 변형
		double right=((Number)p2.getX()).doubleValue();//10
		//세로 V
		double top=((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		
		//가로
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}

	public static void main(String[] args) {
		//매개변수
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 1.1);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rectangle=GenericMethod.<Integer,Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rectangle+"입니다");

	}

}
