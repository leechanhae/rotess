package pk16;

class Outter {

	// �ܺ��ʵ�
	int outNum = 100;
	static int sNum = 200;

	// java.lang.Thread #run()
	// Runnable�� �Ű�����(int i)�� ���������� finaló�� ���.
	Runnable getRunnable(int i) {

		/*final �ִ°���*/ int num = 100;

		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
				//num = 200; //RunnableŸ���̹Ƿ� ����� �ٲ�
				//i=40; //�굵 ���� ����
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = "+outNum+" �ܺ� �ν��Ͻ�");
				System.out.println("Outter.sNum = "+Outter.sNum+" �ܺ� static ����");

			}; // run

		}// MyRunnable
		return new MyRunnable();

	}// getRunnable

}// Outter

public class LocalInner {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		//Runnable�� getRunnable�� ����ߴ� �Ű����� �޼ҵ�� �Ҹ�
		runner.run();
	}

}
