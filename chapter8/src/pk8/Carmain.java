package pk8;

public class Carmain {
	public static void main(String[] args) {
		
		Car c=new Car();
		
		System.out.println("����ȸ�� : "+c.company);
		System.out.println("�𵨸� : "+c.model);
		System.out.println("���� : "+c.color);
		System.out.println("�ְ� �ӵ� : "+c.maxSpeed);
		System.out.println("���� �ӵ� : "+c.speed);
		c.speed=60;
		System.out.println("==�ӵ����� �� ��� ==");
		System.out.println("������ �ӵ� : "+c.speed);
		

	}
}
