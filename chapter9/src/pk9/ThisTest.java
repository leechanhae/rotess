package pk9;

public class ThisTest {

	private int speed;
	private int Age;
	private String RobotName;
	private String RobotNum;

	// 기본 생성자
	public ThisTest() {
		this(10, 3, "Bob", "20210608");
	}

	public ThisTest(int speed, int Age, String RobotName, String RobotNum) {
		this.speed = speed;
		this.Age = Age;
		this.RobotName = RobotName;
		this.RobotNum = RobotNum;
	}

	public void Move() {
		speed += 20;
		System.out.println("로봇의 스피드 : " + speed);
	}

	public void Stop() {
		speed = 0;
		System.out.println("로봇의 스피드 : " + speed);
	}

	public void Rage() {
		Age+=1;
		System.out.println("로봇의 나이 : " + Age);
	}
	
	public void Rname() {		
		System.out.println("로봇의 이름 : "+RobotName);
	}
	
	public void Rnum() {		
		System.out.println("로봇의 번호 : "+RobotNum);
	}
}
