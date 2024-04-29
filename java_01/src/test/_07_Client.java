package test;

//부모클래스
public class _07_Client {
	//멤버변수
	private int id;		// 고객 ID : 1001	1002
	private String name;	// 고객명 : 김태희	블랙
	private String grade;	// 고객등급 : vip	black

	// 디폴트 생성자
	public _07_Client(){}

	// 매개변수 생성자
	public _07_Client(int id, String name, String grade){
		setId(id);
		setName(name);
		setGrade(grade);
	}

	// 멤버메서드(getter, setter)
	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getGrade(){
		return grade;
	}

	// showInfo()
	public void showInfo(){
		System.out.println("고객ID : " + id);
		System.out.println("고객명 : " + name);
		System.out.println("고객등급 : " + grade);
	}
}