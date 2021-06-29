package pk13;

public class MainBoard {

	public static void main(String[] args) {

		// 기본 게임 레벨 1단계
		Player player = new Player();
		player.play(1);
		// 레벨 2단계
		//AdvancedLevelPlayer aLevel=new AdvancedLevelPlayer();
		player.upgradeLevel(new AdvancedLevelPlayer());
		player.play(2); //aLevel.go
		// 레벨 3단계
		player.upgradeLevel(new SuperLevelPlayer());
		player.play(3);
	}

}
