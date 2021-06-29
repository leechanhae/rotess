package pk13;

public class AdvancedLevelPlayer extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Á» ¶Ý´Ï´Ù.");
	}

	@Override
	public void jump() {
		System.out.println("Á¡ÇÁ!");
	}

	@Override
	public void turn() {
		System.out.println("°¡²û µ½´Ï´Ù.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("----¸ðÇè°¡----");
	}

}
