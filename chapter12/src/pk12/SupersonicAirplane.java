package pk12;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL=1; //1�ܿ� ������ �ȵǴ� �������� ���� ����
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("������ ������ �մϴ�.");
		}else {
			super.fly();			
		}
	}
	
	
	
}