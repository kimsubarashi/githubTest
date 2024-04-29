package ch06;

public class _01_Dog extends _01_Animal {
	//디폴트 생성자
	public _01_Dog() {
		System.out.println("자식 클래스 디폴트 생성자");
	}
	
	//매개변수 생성자
	public _01_Dog(String kind, int legs, String color) {
		System.out.println("<<< 부모클래스 매개변수 생성자 >>>");
		setKind(kind);
		setLegs(legs);
		setColor(color);
	}
	
	//멤버 메소드
	public void bark() {
		System.out.println("멍멍~~~");
	}
}
