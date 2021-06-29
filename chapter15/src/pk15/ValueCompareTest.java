package pk15;

public class ValueCompareTest {

	public static void main(String[] args) {
		System.out.println("[-128~127 초과했을 경우]"); //byte,int,short
		Integer obj1=300;
		Integer obj2=300;
		
		System.out.println("1. 결과 : "+(obj1==obj2));//객체 주소 비교
		System.out.println("2. 언박싱 후 : "+(obj1.intValue()==obj2.intValue()));//내부 값 비교
		System.out.println("3. equals() 결과 : "+(obj1.equals(obj2)));//내부 값 비교
		System.out.println();
		
		Integer obj3=100;
		Integer obj4=100;
		System.out.println(obj3==obj4);
		System.out.println(obj3.intValue()==obj4.intValue());
		System.out.println(obj3.equals(obj4));
	}
}
