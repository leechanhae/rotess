package pk16;

class Outter2 {

	Runnable getRunnable(int i) {
		int num = 100;

		// Ŭ�������� ������
		// class Inner{}
		
		//�͸��� Ŭ����
		return new Runnable() {

			@Override
			public void run() {
				// num=200; //�ѹ����� �������ϱ� ������ ����
				// i=500;//�굵
				System.out.println(i);
				System.out.println(num);

			}

		};
	}
	
	//�͸��� Ŭ����
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable�� �籸����");
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
