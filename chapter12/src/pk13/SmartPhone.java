package pk13;

public class SmartPhone extends Phone {


	//������
	public SmartPhone(String owner) { //�����ھȿ� ������ȣ��
		super(owner); //super(owner) = Phone(owner)
	}
	//����� ������ �θ� �⺻�����ڰ� ������ �ڽ� �����ڿ� ����Ʈ ���� ���;��ϴµ�
	//���� ���� ������ ������ �� -->�߻����� ���� ����
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}

}
