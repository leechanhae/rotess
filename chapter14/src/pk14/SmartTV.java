package pk14;

public class SmartTV implements Searchable, Remote {

	int vol;
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int vol) {
		if (vol > Remote.MAX_VOLUME) {
			this.vol = Remote.MAX_VOLUME;
		} else if (vol < Remote.MIN_VOLUME) {
			this.vol = Remote.MIN_VOLUME;
		}else {
			this.vol=vol;
		}
		System.out.println("������ ������ " + this.vol + "�Դϴ�.");
	}

	@Override
	public void search(String url) {

		System.out.println(url+" ��(��) �˻� �մϴ�.");
	}

}
