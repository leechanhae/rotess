package pk8;

public class Vending {

	// �������
	private Can can[] = new Can[5]; // ����
	private int money;

	// ������ ����

	// �ʱ�ȭ �޼ҵ� init()
	public void init() {
		can[0] = new Can("ȯŸ", 1000);
		can[1] = new Can("��ī�ݶ�", 1800);
		can[2] = new Can("ī���", 2000);
		can[3] = new Can("����", 1600);
		can[4] = new Can("��Ű��", 1200);
	}

	// ������� ������ �� �� �ִ� ���Ḹ �����ֱ�
	public void showCans(int m) {
		money = m;		

		// ������� ������ �� �� �ִ� ���Ḹ �����ֱ�
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + " - " + can[i].getPrice() + "��");
			} else if (can[i].getPrice() > money) {
				System.out.println("�� �� �ִ°� �����ϴ�.");				
				break;
			}
		}

	}

	// ������ ���� ���� �� �ܾ��� ����ؼ� �����ִ� �޼ҵ�
	public void outCan(String name) {
			
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "��(��) �����ϼ̽��ϴ�.");
				System.out.println("�ܾ�: " + (money - can[i].getPrice()) + "��");
			}
		}

	}

}
