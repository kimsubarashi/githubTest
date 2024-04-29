package ch06;

//자식클래스
public class _04_VipCustomer extends _04_Customer{

	//멤버변수
	private int agentID; //vip 고객상담
	private double saleRation; // 할인율 : 0.01
	
	// 디폴트 생성자
	public _04_VipCustomer(){
		super(); //부모 디폴트 생성자 호출.. 생략가능하며 컴파일러가 자동추가
		System.out.println("VipCustomer 디폴트 생성자");
	}
	
	public _04_VipCustomer(int id, String name, String grade, int money, int agentID, double saleRation){
		super(id, name, grade, money);
		setAgentID(agentID);
		setSaleRation(saleRation);
		System.out.println("VipCustomer 매개변수 생성자");
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
	
	//printInfo() //재정의(오버라이드) - 부모메서드와 자식메서드 동일할 때 자식메서드를 호출
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("agentID : " + agentID);
		System.out.println("saleRation : " + saleRation);
	}
	
	/* p244
     * super : 부모의 참조변수
     *  - 하위클래스에서 상위클래스로 접근할 때 사용한다.
     *    하위클래스는 상위클래스의 주소, 즉 참조값을 알고 있다.
     *    예) super.printInfo();
     *  - 상위클래스의 생성자를 호출할 때도 사용한다.
     *    예) super();  // 부모 디폴트 생성자
     *    예) super(sabun, name, deptName, salary);  // 부모 매개변수 생성자
     *    cf) this : 자기자신의 주소값
     */
}
