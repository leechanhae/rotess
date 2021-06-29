package pk12;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL=1; //1외에 변형이 안되는 공용으로 쓰는 변수
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}else {
			super.fly();			
		}
	}
	
	
	
}
