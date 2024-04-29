package ch03;

public class _03_MyInfo {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 객체 : 이 디자인을 바탕으로 만들어진 힙메모리
	 * - 멤버변수(속성) + 멤버메서드(동작, 기능)
	 */
	private String name;
	private String birthday;
	private int money;
	private String address;
	
	//생성자
	public _03_MyInfo() {
		System.out.println("<<기본생성자>>");
	}
	
	public _03_MyInfo(String name, String birthday, int money, String address) {
		System.out.println("<<매개변수 생성자>>");
		this.name = name;
		this.birthday = birthday;
		this.money = money;
		this.address = address;
	}
	
	//멤버메서드(기능)
	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setAddress(String address) {
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}

	public int getMoney() {
		return money;
	}

	public String getAddress() {
		return address;
	}
	
	//출력정보
	
	//public void showInfo() {
	//	System.out.println("이름 : " + getName());
	//	System.out.println("생일 : " + getBirthday());
	//	System.out.println("월급 : " + getMoney());
	//	System.out.println("주소 : " + getAddress());
	//}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생일 : " + birthday);
		System.out.println("월급 : " + money);
		System.out.println("주소 : " + address);
	}
}