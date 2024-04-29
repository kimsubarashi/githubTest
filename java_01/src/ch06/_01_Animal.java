package ch06;

// 부모클래스(공통)
public class _01_Animal {
	
	// 멤버 변수
	private String kind; // 종류	고양이	멍뭉이
	private int legs;	//	다리	4		4
	private String color; //
	
	// 디폴트 생성자
	public _01_Animal() {
		System.out.println("<<< 부모클래스 디폴트 생성자 >>>");
	}
	
	public _01_Animal(String kind, int legs, String color) {
		System.out.println("<<< 부모클래스 매개변수 생성자 >>>");
		this.kind = kind;
		this.legs = legs;
		this.color = color; 
	}
	
	// 멤버메서드
	// getter, setter
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getKind() {
		return kind;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public String getColor() {
		return color;
	}
	
	//printInfo() - 멤버변수 정보 출력
	public void printInfo() {
		System.out.println("종류 : " + kind);
		System.out.println("다리 : " + legs);
		System.out.println("색깔 : " + color);
	}
		
}
