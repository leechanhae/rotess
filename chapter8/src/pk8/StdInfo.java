package pk8;

public class StdInfo {

	public String studentName;
	public int grade;
	public int money;

	// 생성자(오버로딩)

	public StdInfo(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
	}
	
	public void takeSub(Subway sub) {
		sub.take(2000);
		this.money-=2000;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"원 입니다.");
	}

}
