package pk14_2;

public class LeasJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("laeseJob");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("leaseJobAgent");
	}

}
