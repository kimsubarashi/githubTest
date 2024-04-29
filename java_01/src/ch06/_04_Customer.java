package ch06;

// 부모클래스
public class _04_Customer {
	
	// 멤버변수
	private int id;			// 고객ID : 1001
	private String name;	// 고객명 : 김태희
	private String grade;	// 고객등급 : vip
	private int money;
	
	// 디폴트 생성자
	public _04_Customer() {
		System.out.println("Customer 디폴트 생성자");
	}
	
	public _04_Customer(int id, String name, String grade, int money) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	//멤버메서드
	//getter, setter
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getMoney() {
		return money;
	}
	
	//printInfo()
	public void printInfo(){
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("성적 : " + grade);
		System.out.println("돈 : " + money);
	}

}
