package pk11;

public class VIPCustomer extends Customer {

	// �������� agentID(����)
	// 10���� ���� saleRatio ��)0.1
	// ���ʽ�����Ʈ
	private int agentID;
	double saleRatio;

	// ������ �̿�(���� ���̵�,�̸�,�������̵�)
	// ������ �̿� (���=vip, bonusRatio=0.05, saleRatio,

	Customer cu = new Customer();

	public VIPCustomer(int customerID, String customerName, int agentID) {

		super(customerID,customerName);
		this.agentID = agentID;
		
		customergrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	// calcPrice =>Overriding
	// return �ڱⰡ��-saleRatio Ȱ��
	@Override
	public int calcPrice(int price) {
		price = (int)(price - (price * saleRatio));
		return super.calcPrice(price);
	}

	// showCustomerInfo() => overriding
	@Override
	public String showCustomerInfo() {
		// �θ�Ŭ������ �޼ҵ带 ����ϰ� ���� ���̵� �߰�
		return super.showCustomerInfo() + "���� ���̵�� " + agentID + "�Դϴ�.";
	}

	public int getAgentId() {
		return agentID;
	}

}
