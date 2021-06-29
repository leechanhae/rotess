package test;

public class Customer {

	public int customerID;
	public String customerName;
	public String customergrade;
	public int bonusPoint;
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

	public int calcPrice(int price) {// 포인트만 적립
		bonusPoint += (int) (bonusRatio * price);
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customergrade + "이며 보너스 포인트는" + bonusPoint + "입니다.";
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
