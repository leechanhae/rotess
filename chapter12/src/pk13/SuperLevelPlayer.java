package pk13;

public class SuperLevelPlayer extends PlayerLevel {

	@Override
	public void run() {
System.out.println("매우 빠르게 뜀");		
	}

	@Override
	public void jump() {
System.out.println("슈퍼점프");		
	}

	@Override
	public void turn() {
System.out.println("진영을 무너뜨려라!!");		
	}

	@Override
	public void showLevelMessage() {
System.out.println("---슈퍼레벨---");		
	}

	

}
