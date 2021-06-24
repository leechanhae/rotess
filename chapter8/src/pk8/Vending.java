package pk8;

public class Vending {

	// 멤버변수
	private Can can[] = new Can[5]; // 선언
	private int money;

	// 생성자 생략

	// 초기화 메소드 init()
	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("코카콜라", 1800);
		can[2] = new Can("카페라떼", 2000);
		can[3] = new Can("식혜", 1600);
		can[4] = new Can("밀키스", 1200);
	}

	// 사용자의 돈으로 살 수 있는 음료만 보여주기
	public void showCans(int m) {
		money = m;		

		// 사용자의 돈으로 살 수 있는 음료만 보여주기
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + " - " + can[i].getPrice() + "원");
			} else if (can[i].getPrice() > money) {
				System.out.println("살 수 있는게 없습니다.");				
				break;
			}
		}

	}

	// 선택한 음료 제공 후 잔액을 계산해서 보여주는 메소드
	public void outCan(String name) {
			
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "를(을) 선택하셨습니다.");
				System.out.println("잔액: " + (money - can[i].getPrice()) + "원");
			}
		}

	}

}
