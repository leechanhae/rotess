package pk8;

public class DmbcellPhone extends CellPhone { // cellphone �� �����ؼ� ������

	// �ʵ�
	int channel;

	// ������
	public DmbcellPhone(String model, String color, int channel) {
		this.model = model; // cellphone�� �־ ���� ���ص� ���� �ȳ�
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��"+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	
	void changechannelDmb(int channel) {
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}

}
