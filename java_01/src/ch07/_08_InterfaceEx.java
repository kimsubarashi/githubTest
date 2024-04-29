package ch07;

public class _08_InterfaceEx {
	public static void main(String[] args) {
		A08 a08 = new A08();
		a08.autoPlay(new B08());
		a08.autoPlay(new C08());
		// autoPlay() 호출
	}
}

//부모클래스

class A08 {
	public void autoPlay(I08 i08) { // 다형성 적용
		i08.play();
	}
}

interface I08 {
	public void play(); //추상메서드
}

//자식클래스
class B08 implements I08{
	@Override
	public void play() {
		System.out.println("B08 클래스 - play() 호출");
	};
}

//자식클래스
class C08 implements I08{
	@Override
	public void play() {
		System.out.println("C08 클래스 - play() 호출");
	};
}