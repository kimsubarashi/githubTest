package ch06;

public class _01_Main {
	public static void main(String[] args) {
		//객체생성
		//클래스명 참조변수 = 생성자
		//_01_Cat cat = new _01_Cat("고양이",4,"brown");
		_01_Cat cat = new _01_Cat();
		
		cat.setKind("고양이");
		cat.setLegs(4);
		cat.setColor("brown");
		cat.cry();
		
		cat.printInfo();
		
		//_01_Dog dog = new _01_Dog("강아지",4,"white");
		_01_Dog dog = new _01_Dog();
		
		dog.setKind("강아지");
		dog.setLegs(4);
		dog.setColor("white");
		dog.bark();
		
		dog.printInfo();
	}
}
