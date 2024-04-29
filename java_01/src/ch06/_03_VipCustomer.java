package ch06;

//자식클래스
public class _03_VipCustomer extends _03_Customer{

	//멤버변수
	private int agentID; //vip 고객상담
	private double saleRation; // 할인율 : 0.01
	
	// 디폴트 생성자
	public _03_VipCustomer(){
		super(); //부모 디폴트 생성자 호출.. 생략가능하며 컴파일러가 자동추가
		System.out.println("VipCustomer 디폴트 생성자");
	}
	
	//멤버메서드s
	//getter, setter
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	public void setSaleRation(double saleRation) {
		this.saleRation = saleRation;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public double getSaleRation() {
		return saleRation;
	}
	
	public _03_VipCustomer(int id, String name, String grade, int agentID, double saleRation){
		super(id, name, grade);
		//setId(id);
		//setName(name);
		//setGrade(grade);
		setAgentID(agentID);
		setSaleRation(saleRation);
	}
	
	//printInfo() //재정의(오버라이드) - 부모메서드와 자식메서드 동일할 때 자식메서드를 호출
	@Override
	public void printInfo() {
		System.out.println("======= VIP =========");
		super.printInfo();
		System.out.println("agentID : " + agentID);
		System.out.println("saleRation : " + saleRation);
	}
}
