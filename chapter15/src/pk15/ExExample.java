package pk15;

public class ExExample {

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i); //밑에꺼가 안나오고 여기서 바로 종료
				//break;
			}
		}
		System.out.println("END!");
	}

}
