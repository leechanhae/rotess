package pk11;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed : "+speed);
	}
	/* final �޼���� �������̵� �Ұ���
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed=0;
	}
	*/

	public static void main(String[] args) {

		SportsCar ac=new SportsCar();
		ac.speedUp();
		ac.stop();
	}

}
