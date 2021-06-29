package pk14_2;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("대기");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기맨");
	}

}
