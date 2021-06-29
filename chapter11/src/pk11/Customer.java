package pk11;

public class Customer {

	private int customerID;
	private String customerName;
	protected String customergrade;
	protected int bonusPoint;
	double bonusRatio;

	public Customer() {
		customergrade = "SILVER";
		bonusRatio = 0.01;
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customergrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {// ����Ʈ�� ����
		bonusPoint += (int) (bonusRatio * price);
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customergrade + "�̸� ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomergrade() {
		return customergrade;
	}

	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}

}
