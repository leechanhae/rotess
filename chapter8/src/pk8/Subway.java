package pk8;

public class Subway {

	// �������
	public String subNumber; // ����ö ȣ��
	public int passengerCount; // �°� ��
	public int money;

	public Subway(String subNumber) {
		this.subNumber = subNumber;
	}

	public void take(int money) { // �°��� �� ���� ����

		this.money += money; // ������ ���� ����
		passengerCount++;

	}

	public void subInfo() {
		System.out.println(subNumber + "�� �°��� " + passengerCount + "���̰� ������" + money + "�� �Դϴ�.");
	}

}
