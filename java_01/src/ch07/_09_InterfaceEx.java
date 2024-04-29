package ch07;

public class _09_InterfaceEx {
	public static void main(String[] args) {
		A09 a09 = new A09();
		a09.methodA();
		//methodA() 호출
	}
}

class A09 {
	public void methodA() {
		I09 i09 = InstanceManager.getInstance();
		i09.methodB();
	}
}

interface I09 {
	public void methodB();
}

class B09 implements I09{
	
	public B09() {
		System.out.println("B09 디폴트 생성자 호출");
	}
	@Override
	public void methodB() {
		System.out.println("B09 클래스 - methodB()");
	}
}

/*
 * 팩토리 메서드(factory method)
 * - 객체를 생성하는 정적 팩토리메서드이다.
 *    이것은 디자인 패턴의 하나로서 객체를 생성하는 부분을 자식클래스에게 위임하는 패턴이다.
 *    즉 new 연산자를 호출하여 객체를 생성하는 코드를 자식클래스에게 위임하는 패턴이다.
 *    사용하는 이유는 하나의 클래스가 변경되었을 경우에 다른 클래스의 변경을 최소화하기 위합이다.
 *    
 *    팩토리 메서드 이름으로 많이 사용하는 것은 getInstance()이다.
 *    인터페이스에서 팩토리 메서드를 제공할 때 정적메서드를 사용하게 된다.
 *    static이므로 클래스명.정적메서드로 접근
 */
class InstanceManager {
	public static I09 getInstance() { //static 적용해서 바로 접근
		return new B09();  // I09 i09 = new B09 // 다형성 적용
	}
}
