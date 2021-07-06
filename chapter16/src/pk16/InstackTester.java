package pk16;

import java.util.Scanner;

public class InstackTester {

	public static void main(String[] args) {

		// 최대 64개를 push 할 수 있도록
		InStack s = new InStack(64);
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/ 스택의 용량 : " + s.capacity());
			System.out.println("(1)푸쉬 (2)팝 (3)피크 (4)덤프 (0)종료 : ");
			int menu = scan.nextInt();
			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = scan.nextInt();
				try {
					s.push(x);
				} catch (InStack.OverflowStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.print("팝한 데이터는 " + x);
				} catch (InStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 3:
				try {
					System.out.println(s.peek());
				} catch (InStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.clear();
				break;
			}
		}

	}

}
