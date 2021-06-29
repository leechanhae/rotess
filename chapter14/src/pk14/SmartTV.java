package pk14;

public class SmartTV implements Searchable, Remote {

	int vol;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재의 볼륨은 " + this.vol + "입니다.");
	}

	@Override
	public void search(String url) {

		System.out.println(url+" 을(를) 검색 합니다.");
	}

}
