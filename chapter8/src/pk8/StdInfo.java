package pk8;

public class StdInfo {

	public String studentName;
	public int grade;
	public int money;

	// ������(�����ε�)

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
		System.out.println(studentName+"���� ���� ���� "+money+"�� �Դϴ�.");
	}

}
