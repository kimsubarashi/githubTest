package ch06;

public class _02_PoliceCar extends _02_Car {
	//디폴트 생성자
	public _02_PoliceCar() {
		System.out.println("<< _02_PoliceCar() 디폴트>>");
	}
	
	//매개변수 생성자
	public _02_PoliceCar(String kind, int speed) {
		setKind(kind);
		setSpeed(speed);
	}
	
	//멤버메서드
	public void siren() {
		System.out.println("사이렌을 울리다.~~ 삐용삐용삐용");
	}
}
