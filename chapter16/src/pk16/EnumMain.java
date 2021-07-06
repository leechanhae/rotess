package pk16;

import java.util.Scanner;

public class EnumMain {

	//enum 클래스
	public enum Item{
		Start, Pause, Exit
	}
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("0:게임시작");
			System.out.println("1:일시정지");
			System.out.println("2:게임종료");
			
			Scanner scan=new Scanner(System.in);
			System.out.print("선택>>");
			int n=scan.nextInt();
			
			Item start=Item.Start;
			Item pause=Item.Pause;
			Item exit=Item.Exit;
			
			//System.out.println(start.ordinal());
			if(n==start.ordinal()) {
				System.out.println("게임 시작");
			}else if(n==pause.ordinal()) {
				System.out.println("일시정지");
			}else if(n==exit.ordinal()) {
				System.out.println("종료");
				return;
			}else {
				System.out.println("no option");
			}
		}
	}

}
