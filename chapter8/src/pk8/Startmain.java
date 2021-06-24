package pk8;

import java.util.Scanner;

public class Startmain {
	public static void main(String[] args) {

		int i = 0;
		String check;
		Start st = new Start();		
		Scanner scan = new Scanner(System.in);
		boolean run=true;		
		while (run) {
			System.out.print("숫자입력 : ");
			i = scan.nextInt();
			check=st.check(i);
			
			if(check.equals("SUCCESS")) {
				run=false;
			}
		}

	}
}
