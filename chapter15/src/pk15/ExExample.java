package pk15;

public class ExExample {

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i); //�ؿ����� �ȳ����� ���⼭ �ٷ� ����
				//break;
			}
		}
		System.out.println("END!");
	}

}
