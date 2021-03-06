package pk15;

public class IntegerTest {

	public static void main(String[] args) {

		//Integer i=new Integer(100); //사용을 권장하지 않음
		
		Integer num=100;
		int iNum=num.intValue(); //Integer 클래스에서 값만 가져옴
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(iNum);
		System.out.println(sum);
		
		//UnBoxing
		int total=num+jNum;//num.intValue(); 으로 변환
		System.out.println(total);
		
		//Boxing == AutoBoxing
		Integer i=jNum;
		System.out.println(i);//Integer.ValueOf(); 으로 변환
		
	}

}
