package pk13;

public class MainBoard {

	public static void main(String[] args) {

		// �⺻ ���� ���� 1�ܰ�
		Player player = new Player();
		player.play(1);
		// ���� 2�ܰ�
		//AdvancedLevelPlayer aLevel=new AdvancedLevelPlayer();
		player.upgradeLevel(new AdvancedLevelPlayer());
		player.play(2); //aLevel.go
		// ���� 3�ܰ�
		player.upgradeLevel(new SuperLevelPlayer());
		player.play(3);
	}

}
