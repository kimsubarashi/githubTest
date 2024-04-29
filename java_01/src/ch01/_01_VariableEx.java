package ch01;

//클래스명은 대문자로 시작합니다.
public class _01_VariableEx {
	public static void main (String[] args) {
		/*
		* 프로그램을 시작하는 main() 메서드 .. 소문자로 시작한다.
		* 자바가상머신(Java Virtual Machine, JVM)이 프로그램을 시작하기 위해 호출하는 메서드
		* p44
		*/
		System.out.println("*** 변수 ***");
		System.out.println("변수 : 하나의 값을 저장할 수 있는 메모리 공간");
		
		/* 
		 * 변수 선언 및 대입 => 자료형 변수명 = 값;
		 * 변수는 소문자로 시작한다.
		 * 해당 자료형에 맞게 대입되어야 한다.
		 */
		
		int level = 10;
		System.out.println("level =>" + level);
		
		System.out.println("-----------------");
		
		int age = 27;
		System.out.println("나는 " + age + "살이고");
		
		String name = "김성태";
		System.out.println("이름은 " + name + "라고해");
		
		System.out.println("-----------------");
		
		System.out.println("age : " + age);
		System.out.println("name : " + name);
		
		System.out.println("-----------------");
		
		int salary = 300000;
		System.out.println("급여 :" + salary);
		
		String email = "tjdxo1422@gmail.com";
		System.out.println("이메일 : " + email);
		
		System.out.println("-----나의 정보-----");
		
		//String name = "김성태";
		System.out.println("이름 : " + name);
		
		String address = "서울특별시 관악구 봉천동";
		System.out.println("주소 : " + address);
		
		String dream = "취직";
		System.out.println("꿈 : " + dream);
		
		int favoriteNumber = 7;
		System.out.println("좋아하는 숫자 : " + favoriteNumber);
		
		char bloodType = 'A';
		System.out.println("혈액형 : " + bloodType);
		
		System.out.println("-----나의 정보(한줄 쓰기)-----");
		
		System.out.println("name : " + name + "\naddress : " + address + "\ndream : " + dream + "\nfavoriteNumber : " + favoriteNumber + "\nbloodType : " + bloodType);
	}
}
