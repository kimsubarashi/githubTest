package test;

public class _05_MyInfo {
	
	private String name;
	private String birthday;
	private int money;
	private String address;

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
	
	public void showInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("생일 : " + getBirthday());
		System.out.println("월급 : " + getMoney());
		System.out.println("주소 : " + getAddress());
	}
}