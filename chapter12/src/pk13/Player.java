package pk13;

public class Player {

	private PlayerLevel level; //Playerlevel level=new Playerlevel;

	public Player() {
		//Playerlevel level=new Beginnerlevel;
		level = new BeginnerLevel(); // �ʺ��ڷ� �޸� �Ҵ�
		level.showLevelMessage(); // �ʺ��� �޽���	
		
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage(); // �� ������ �޼���
	}

	public void play(int count) {
		level.go(count);
	}

}
