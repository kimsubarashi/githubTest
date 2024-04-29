package ch03;

public class _01_StudentMain {
	public static void main(String[] args) {
		
		/*
		 * [인스턴스(객체) 생성]
		 * 클래스명 참조변수 = new 클래스명();
		 * 참조변수에는 클래스의 주소값이 들어있다.
		 * 참조변수.멤버변수 = 값;
		 * 참조변수.멤버메소드();
		 */
		
		// 클래스명 참조변수 = new 클래스명();
		_01_Student iu = new _01_Student();
		
		System.out.println("=== 아이유 정보 출력 ===");
		// 참조변수.멤버변수 = 값;
		iu.studentID = "S001";
		iu.name = "아이유";
		iu.age = 25;
		iu.email = "id@gmail.com";
		iu.address = "아프리카";
		
		// 참조변수.멤버메소드();
		iu.printInfo();
		
		//내 정보
		_01_Student st = new _01_Student();
		
		System.out.println("=== 내 정보 출력 ===");
		st.studentID = "2453707";
		st.name = "김성태";
		st.age = 25;
		st.email = "tjdxo1422@gmail.com";
		st.address = "서울특별시";
		
		st.printInfo();
	}
}
