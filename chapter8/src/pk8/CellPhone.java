package pk8;

public class CellPhone {
	
	String color;
	String model;
	
	//������

	//�޼���
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendVoice(String message) {
		System.out.println("�� : "+message);
	}
	void receVoice(String message) {
		System.out.println("���� : "+message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
