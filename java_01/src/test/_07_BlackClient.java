package test;

public class _07_BlackClient extends _07_Client{
	//멤버변수
	private int penalty; // 1000

	// 디폴트 생성자
	 _07_BlackClient(){}

	// 매개변수 생성자
 	_07_BlackClient(int id, String name, String grade, int penalty){
		setId(id);
		setName(name);
		setGrade(grade);
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
	public void showInfo(){
		System.out.println("====== 블랙 ======");
		super.showInfo();
		System.out.println("패널티 : " + penalty);
	}
}