package pk13;

public class Mynotebook extends Notebook {

	@Override
	//notebook에서 디스플레이를 받았기 때문에 남은 추상 클래스가 타이핑이라
	//타이핑만 받는다
	public void typing() {
		System.out.println("Mynotebook typing");
	}

}
