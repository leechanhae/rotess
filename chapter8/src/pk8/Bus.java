package pk8;

public class Bus {

	// 멤버변수
	int busNumber; // 버스번호
	int passengerCount; // 승객 수
	int money; // 버스의 수입

	// 생성자를 오버로딩(버스번호를 매개변수로 받아서 멤버번수에 대입연산!)
	public Bus(int busNumber) {
		this.busNumber = busNumber;		
	}

	public void take(int money) { // 승객이 낸 돈을 받음

		this.money += money; // 버스의 수입 증가
		passengerCount++;

	}

	public void busInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명의 승객을 받고 수입은" + money + "원 입니다.");
		System.out.println("!");
	}

}
