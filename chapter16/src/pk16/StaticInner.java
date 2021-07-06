package pk16;

public class StaticInner {

	int a=10;
	private int b=100;
	static int c=300;
	
	static class Inner{
		
		static int d=1000;
		public void getData() {
			//System.out.println(a); //생존주기가 다름
			//System.out.println(b);
			System.out.println(c);
		}
	}
	public static void main(String[] args) {

		//방법1
		StaticInner.Inner inner=new StaticInner.Inner();
		inner.getData();
		
		//방법2: 메인 클래스를 이용했으므로 바로 사용가능
		//Inner in=new Inner();
		//inner.getData();
	}

}
