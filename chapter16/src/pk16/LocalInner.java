package pk16;

class Outter {

	// 외부필드
	int outNum = 100;
	static int sNum = 200;

	// java.lang.Thread #run()
	// Runnable은 매개변수(int i)와 지역변수는 final처럼 사용.
	Runnable getRunnable(int i) {

		/*final 있는거임*/ int num = 100;

		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
				//num = 200; //Runnable타입이므로 상수로 바뀜
				//i=40; //얘도 같은 이유
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = "+outNum+" 외부 인스턴스");
				System.out.println("Outter.sNum = "+Outter.sNum+" 외부 static 변수");

			}; // run

		}// MyRunnable
		return new MyRunnable();

	}// getRunnable

}// Outter

public class LocalInner {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		//Runnable에 getRunnable이 사용했던 매개변수 메소드는 소멸
		runner.run();
	}

}
