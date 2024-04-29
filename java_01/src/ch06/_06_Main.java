package ch06;

public class _06_Main {
	public static void main(String[] args) {
		
		System.out.println("[ 다형성 적용 ]");
		
		// 부모클래스 참조변수 = new 자식클래스();
		/*
		 * _06_Animal animal = new _06_Animal(); animal.move();
		 * 
		 * _06_Animal human = new _06_Human(); human.move();
		 * 
		 * _06_Animal tiger = new _06_Tiger(); tiger.move();
		 * 
		 * _06_Animal eagle = new _06_Eagle(); eagle.move();
		 */
		
		//매개변수를 통한 다형성 적용
		moveAnimal(new _06_Animal());
		moveAnimal(new _06_Human());
		moveAnimal(new _06_Tiger());
		moveAnimal(new _06_Eagle());
	}
	
	public static void moveAnimal(_06_Animal animal) {
		animal.move();
		
		//animal이 어디로부터 온건지 묻는 조건
		if(animal instanceof _06_Human) {
			//human에 있는 readBook을 사용하기 위해 형변환
			_06_Human human = (_06_Human) animal; // 다운캐스팅 : 형변환을 큰거에서 작은걸로
			human.readBook();
			human.listenMusic();
		}else if(animal instanceof _06_Tiger) {
			_06_Tiger tiger = (_06_Tiger) animal;
			tiger.hunting();
		}else if(animal instanceof _06_Eagle) {
			_06_Eagle eagle = (_06_Eagle) animal;
			eagle.flying();
		}
	} // moveAnimal
}
