package pk16;

public class StaticInner {

	int a=10;
	private int b=100;
	static int c=300;
	
	static class Inner{
		
		static int d=1000;
		public void getData() {
			//System.out.println(a); //�����ֱⰡ �ٸ�
			//System.out.println(b);
			System.out.println(c);
		}
	}
	public static void main(String[] args) {

		//���1
		StaticInner.Inner inner=new StaticInner.Inner();
		inner.getData();
		
		//���2: ���� Ŭ������ �̿������Ƿ� �ٷ� ��밡��
		//Inner in=new Inner();
		//inner.getData();
	}

}
