package pk14;

public class SmartTVMain {

	public static void main(String[] args) {

		Remote rc=new SmartTV();
		Searchable sc=new SmartTV();
		//SmartTV tv=new SmartTV();
		rc.turnOn();
		rc.setVolume(5);
		sc.search("넷플릭스");
		rc.setVolume(2000);
		rc.setVolume(0);		
		rc.turnOff();
	}

}
