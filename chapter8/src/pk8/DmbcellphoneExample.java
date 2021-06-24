package pk8;

public class DmbcellphoneExample {
	public static void main(String[] args) {
		
		DmbcellPhone dmb=new DmbcellPhone("자바폰", "블루블랙", 20);
		
		//cellphone
		System.out.println("모델 : "+dmb.model);
		System.out.println("색상 : "+dmb.color);
		//dmbcellphone
		System.out.println("채널 : "+dmb.channel);
		
		//cellphone으로부터 상속받은 메서드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요 나야 거기 잘 지내니");
		dmb.receVoice("오랜만이야 내 사랑아");
		dmb.sendVoice("ㅋㅋ");
		dmb.receVoice("ㅡㅡ");
		dmb.hangUp();
		dmb.powerOff();
		
		dmb.turnOnDmb();
		dmb.changechannelDmb(7);
		dmb.turnOffDmb();	
		

	}
}
