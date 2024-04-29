package test;

public class _07_VipClient extends _07_Client{
	//멤버변수
	private int agentID;		// vip 고객상담원 ID
	private double saleRatio;	// 할인율 : 0.01

	// 디폴트 생성자
	public _07_VipClient(){}

	// 매개변수 생성자
	public _07_VipClient(int id, String name, String grade, int agentID, double saleRatio){
		setId(id);
		setName(name);
		setGrade(grade);
		setAgentID(agentID);
		setSaleRatio(saleRatio);
	}

	// 멤버메서드(getter, setter)
	public void setAgentID(int agentID){
		this.agentID = agentID;
	}

	public void setSaleRatio(double saleRatio){
		this.saleRatio = saleRatio;
	}

	public int getAgentID(){
		return agentID;
	}

	public double getSaleRatio(){
		return saleRatio;
	}

	// showInfo()
	public void showInfo(){
		System.out.println("===== VIP ====");
		super.showInfo();
		System.out.println("VIP 고객상담원 ID : " + agentID);
		System.out.println("할인율 : " + saleRatio);
	}
}