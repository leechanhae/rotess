package pk18_1;

public class GenericMethod {

	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		//���� T
		double left=((Number)p1.getX()).doubleValue();//0 ���ڷ� �ٲٰ� �������·� ����
		double right=((Number)p2.getX()).doubleValue();//10
		//���� V
		double top=((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		
		//����
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}

	public static void main(String[] args) {
		//�Ű�����
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 1.1);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rectangle=GenericMethod.<Integer,Double>makeRectangle(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴� "+rectangle+"�Դϴ�");

	}

}
