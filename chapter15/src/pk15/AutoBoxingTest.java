package pk15;

public class AutoBoxingTest {
	public static void main(String[] args) {
		
		// Auto-Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		//���Խ� AutoBoxing
		int value=obj;
		System.out.println("value : "+value);
		
		//����
		int result=obj+100;
		System.out.println("result : "+result);

	}
}
