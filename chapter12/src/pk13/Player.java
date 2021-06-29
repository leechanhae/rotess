package pk13;

public class Player {

	private PlayerLevel level; //Playerlevel level=new Playerlevel;

	public Player() {
		//Playerlevel level=new Beginnerlevel;
		level = new BeginnerLevel(); // 초보자로 메모리 할당
		level.showLevelMessage(); // 초보자 메시지	
		
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage(); // 각 레벨의 메세지
	}

	public void play(int count) {
		level.go(count);
	}

}
