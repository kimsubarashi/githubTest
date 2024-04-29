package ch01;

public class _05_VariableEx {
	public static void main(String[] args) {
		  /*
	       * 상수 : 프로그램이 실행되는 동안, 값이 변하지 않는 수 또는 변경 불가능한 수
	       *       주로 대문자 사용(변수는 소문자)
	       *       만약 값을 변경해야 할 경우, 상수를 선언한 곳의 값만 변경하면 된다.
	       *       
	       * 문법 : final 자료형 변수명;  예) final double PI = 3.14;
	       *     1) 변수(상수) : 변수에 값 변경불가
	       *     2) 메서드 : 재정의 불가
	       *     3) 클래스 : 상속 불가     
	       */
		
			final double PI = 3.14;
			System.out.println("PI => " + PI);
			
			// PI = 2.3; // 오류 : PI는 상수이므로 변경불가
			
			double value = 0.8;
			double result = PI * value;
			System.out.println("result : " + result); //result : 2.198
			
			System.out.println(); // 빈줄삽입
			//상수(MY_NAME, MY_AGE, MY_EMAIL, MY_ADDRESS)로 내정보 출력
			
			final String MY_NAME = "김성태";
			final int MY_AGE = 27;
			final String MY_EMAL = "tjdxo1422@gmail.com";
			final String MY_ADDRESS = "서울특별시 관악구 봉천동";
			System.out.println("=========내 정보 ============");
			System.out.println("MY_NAME : " + MY_NAME + "\nMY_AGE : " + MY_AGE + "\nMY_EMAL : " + MY_EMAL + "\nMY_ADDRESS : " + MY_ADDRESS);
	}
}
