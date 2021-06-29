package pk14_2;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("priority");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("priorityAgent");
	}

}
