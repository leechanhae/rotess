package pk11;

public class VIPCustomer extends Customer {

	// 전문상담원 agentID(정수)
	// 10프로 세일 saleRatio 예)0.1
	// 보너스포인트
	private int agentID;
	double saleRatio;

	// 생성자 이용(고객의 아이디,이름,상담원아이디)
	// 생성자 이용 (등급=vip, bonusRatio=0.05, saleRatio,

	Customer cu = new Customer();

	public VIPCustomer(int customerID, String customerName, int agentID) {

		super(customerID,customerName);
		this.agentID = agentID;
		
		customergrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	// calcPrice =>Overriding
	// return 자기가격-saleRatio 활용
	@Override
	public int calcPrice(int price) {
		price = (int)(price - (price * saleRatio));
		return super.calcPrice(price);
	}

	// showCustomerInfo() => overriding
	@Override
	public String showCustomerInfo() {
		// 부모클래스의 메소드를 사용하고 상담원 아이디 추가
		return super.showCustomerInfo() + "상담원 아이디는 " + agentID + "입니다.";
	}

	public int getAgentId() {
		return agentID;
	}

}
