package pk8;

public class Bus {

	// �������
	int busNumber; // ������ȣ
	int passengerCount; // �°� ��
	int money; // ������ ����

	// �����ڸ� �����ε�(������ȣ�� �Ű������� �޾Ƽ� ��������� ���Կ���!)
	public Bus(int busNumber) {
		this.busNumber = busNumber;		
	}

	public void take(int money) { // �°��� �� ���� ����

		this.money += money; // ������ ���� ����
		passengerCount++;

	}

	public void busInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���� �°��� �ް� ������" + money + "�� �Դϴ�.");
		System.out.println("!");
	}

}
