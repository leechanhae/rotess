package pk14_2;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("����");
	}

}
