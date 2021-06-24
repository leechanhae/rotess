package pk8;

public class DmbcellPhone extends CellPhone { // cellphone 을 복사해서 가져옴

	// 필드
	int channel;

	// 생성자
	public DmbcellPhone(String model, String color, int channel) {
		this.model = model; // cellphone에 있어서 선언 안해도 에러 안남
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changechannelDmb(int channel) {
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}

}
