package pk13;

public class AdvancedLevelPlayer extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�� �ݴϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("����!");
	}

	@Override
	public void turn() {
		System.out.println("���� ���ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("----���谡----");
	}

}
