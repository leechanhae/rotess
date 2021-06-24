package pk8;

public class Subway {

	// 멤버변수
	public String subNumber; // 지하철 호선
	public int passengerCount; // 승객 수
	public int money;

	public Subway(String subNumber) {
		this.subNumber = subNumber;
	}

	public void take(int money) { // 승객이 낸 돈을 받음

		this.money += money; // 버스의 수입 증가
		passengerCount++;

	}

	public void subInfo() {
		System.out.println(subNumber + "의 승객은 " + passengerCount + "명이고 수입은" + money + "원 입니다.");
	}

}
