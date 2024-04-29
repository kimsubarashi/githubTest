package ch07;

public class _07_InterfaceEx {
	public static void main(String[] args) {
		First f = new First();
		f.method1(new Second()); // 매개변수로 주소값 전달 : call by reference => 매개변수로 주소값 전달
		
		//매개변수로 주소값 전달
	}
}

class First {
	public void method1(Second second) { // 클래스명 참조변수 = new 클래스명();
		System.out.println("First 클래스 - method1()");
		second.method2(new Third());
	}
}

class Second {
	public void method2(Third third) { 
		System.out.println("Second 클래스 - method2()");
		third.method3();
	}
}

class Third {
	public void method3() {
		System.out.println("Third 클래스 - method3()");
	}
}

