package pk14_2;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	//�ʼ� �ƴ�(default���� ������)
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}

}
