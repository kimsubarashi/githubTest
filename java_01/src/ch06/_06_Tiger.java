package ch06;

//자식클래스
public class _06_Tiger extends _06_Animal {

	//멤버메소드
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}
