package pk13;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	//public void clear() {}; ->�ʼ��� �ƴ� >> �߰� ������ ���� ����
	

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	// template : �� �Ұ����� ������Ʈ�� Ʋ
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
