package ch06;

// 부모클래스(공통)
public class _02_Car {

	//멤버변수
	private String kind;	// 소방차	경찰차
	private int speed;		//
	
	// 디폴트 생성자
	public _02_Car() {
		
	}
	
	// 매개변수 생성자
	public _02_Car(String kind, int speed) {
		
	}
	
	// 멤버변수
	// getter, setter
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getKind() {
		return kind;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	// 출력 : carInfo()
	public void carInfo() {
		System.out.println("종류 : " + kind);
		System.out.println("속도 : " + speed);
	}
}
