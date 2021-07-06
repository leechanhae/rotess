package pk17;

public class StBufferTest {

	public static void main(String[] args) {

		String str="";
		
		StringBuffer buf=new StringBuffer("Nice Day!!!");
		
		//문자열 처리
		System.out.println(buf.toString());
		//문자열의 크기
		System.out.println(buf.length());
		//문자열의 용량(기본16에다가 문자열크기 추가)
		System.out.println(buf.capacity());
		//StringBuffer 용량증가(현재의 용량보다 큰수로 매개변수 사용시 2배+2)
		//두배+2 이상의 수 대입시 대입한 크기로 반환하지만 지향함
		buf.ensureCapacity(50);
		System.out.println(buf.capacity());
		//StringBuffer 문자열에 새로운 문자열의 일부내용제거
		buf.insert(0,"Hi! ");
		buf.insert(13," Everybody!");
		System.out.println(buf);
		//StringBuffer 문자열의 일부내용 제거
		buf.delete(0, 4); //0번째부터 시작해서 4글자 지우기
		System.out.println(buf);
		
		
	}

}
