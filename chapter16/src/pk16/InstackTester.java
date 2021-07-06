package pk16;

import java.util.Scanner;

public class InstackTester {

	public static void main(String[] args) {

		// �ִ� 64���� push �� �� �ֵ���
		InStack s = new InStack(64);
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("���� ������ �� : " + s.size() + "/ ������ �뷮 : " + s.capacity());
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (0)���� : ");
			int menu = scan.nextInt();
			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = scan.nextInt();
				try {
					s.push(x);
				} catch (InStack.OverflowStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.print("���� �����ʹ� " + x);
				} catch (InStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					System.out.println(s.peek());
				} catch (InStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 4:
				s.clear();
				break;
			}
		}

	}

}
