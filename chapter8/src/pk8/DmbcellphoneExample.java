package pk8;

public class DmbcellphoneExample {
	public static void main(String[] args) {
		
		DmbcellPhone dmb=new DmbcellPhone("�ڹ���", "����", 20);
		
		//cellphone
		System.out.println("�� : "+dmb.model);
		System.out.println("���� : "+dmb.color);
		//dmbcellphone
		System.out.println("ä�� : "+dmb.channel);
		
		//cellphone���κ��� ��ӹ��� �޼��� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("�������� ���� �ű� �� ������");
		dmb.receVoice("�������̾� �� �����");
		dmb.sendVoice("����");
		dmb.receVoice("�Ѥ�");
		dmb.hangUp();
		dmb.powerOff();
		
		dmb.turnOnDmb();
		dmb.changechannelDmb(7);
		dmb.turnOffDmb();	
		

	}
}
