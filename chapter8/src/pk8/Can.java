package pk8;

public class Can {

	//�������=�ʵ�=�Ӽ�
	private String canName; //���� �̸�
	private int price; //���� ����
	
	//������
	public Can(String canName, int price) {
		this.canName=canName;
		this.price=price;
	}

	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
