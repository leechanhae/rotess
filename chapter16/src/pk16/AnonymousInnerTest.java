package pk16;

class Outter2 {

	Runnable getRunnable(int i) {
		int num = 100;

		// 클래스명이 생략됨
		// class Inner{}
		
		//익명의 클래스
		return new Runnable() {

			@Override
			public void run() {
				// num=200; //한번돌고 없어지니깐 값변경 ㄴㄴ
				// i=500;//얘도
				System.out.println(i);
				System.out.println(num);

			}

		};
	}
	
	//익명의 클래스
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 재구현됨");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {

		Outter2 out=new Outter2();
		Runnable runnable=out.getRunnable(10);
		runnable.run();
		
		out.runner.run();
	}

}
