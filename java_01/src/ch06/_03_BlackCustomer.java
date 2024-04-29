package ch06;

public class _03_BlackCustomer extends _03_Customer{
	//멤버변수
	private int penalty; // 1000

	// 디폴트 생성자
	 _03_BlackCustomer(){}

	// 매개변수 생성자
 	_03_BlackCustomer(int id, String name, String grade, int penalty){
		super(id, name, grade);
		setPenalty(penalty);
	}

	// 멤버메서드(getter, setter)
	public void setPenalty(int penalty){
		this.penalty = penalty;
	}

	public int getPenalty(){
		return penalty;
	}

	// showInfo()
	@Override //오버라이드 어노테이션 : 컴파일러에게 이 메소드는 재정의된 메소드라고 알려주는 역할(컴파일러가 오버라이드 확인할 수 있도록 표시하는 것)
	public void printInfo(){
		System.out.println("====== 블랙 ======");
		super.printInfo();
		System.out.println("패널티 : " + penalty);
	}
}