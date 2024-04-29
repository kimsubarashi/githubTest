package ch03;

public class _04_CarMain {
	public static void main(String[] args) {
		
		// 까페 : 자바 < 중요_인스턴스 생성
		// 객체생성 : 클래스명 참조변수 = new 생성자;
		System.out.println("<<방법1>>");
		//1-1. 디폴트 생성자를 통해 객체 생성(볼보)
		//디폴트 생성자 -> setter -> 매개변수 -> 멤버변수(볼보);
		_04_Car volvo = new _04_Car();
		
		//1-2. setter를 통해 멤버변수로 값 전달
		volvo.setMadein("스페인");
		volvo.setBrand("볼보");
		volvo.setPrice(6000);
		volvo.setColor("grey");
		
		//1-3. 멤버변수 정보를 출력
		volvo.printInfo();
		
		System.out.println("<<방법2>>");
		//2-1.매개변수 생성자를 통해 객체 생성(제네시스)
		_04_Car genesis = new _04_Car("한국","제네시스",100000000,"black");
		
		//2-2. 멤버변수 정보를 출력(printInfo())
		genesis.printInfo();
	}
}
