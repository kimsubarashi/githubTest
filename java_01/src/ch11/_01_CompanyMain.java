package ch11;

public class _01_CompanyMain {

	 /* p193  
	 * [면접] 싱글톤패턴
	 * - 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - static을 응용하여 프로그램 전반에서 사용하는 동일한 인스턴스를 하나만 생성하는 방식
	 * - 접근할 클래스에 여러 메서드가 있을 때, 외부 클래스가 해당 메서드에 접근할 때마다 
	 *   객체를 생성할 필요없이 getInstance()를 통해 참조변수만 리턴받아 접근한다.
	 *   열번, 백번을 호출해도 항상 같은 주소의 인스턴스가 반환된다.
	 *  
	 * 싱글톤패턴 생성
	 * - 1단계. 디폴트생성자를 private으로 만들기
	 * - 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	 * - 3단계. 외부에서 참조할 수 있는 public 메서드 만들기
	 * 
	 * 호출
	 * - 접근클래스명 참조변수 = 접근클래스명.getInstance();
	 * 예) _08_Company com1 = _08_Company.getInstance();  // 클래스명.메서드명
	 */
	public static void main(String[] args) {
		_01_Company instance = _01_Company.getInstance();
		_01_Company instance2 = _01_Company.getInstance();
		
		System.out.println("company : " + instance);
		System.out.println(instance == instance2);
		
		_01_Company.getInstance().gotoCafeteria("김성태");
		
		
		instance.gotoWork("홍길동");
		instance.work("홍길동");
		instance.gotoCafeteria("홍길동");
		instance.gotoHome("홍길동");
		
		instance.gotoWork("김태희");
		instance.work("김태희");
		instance.gotoCafeteria("김태희");
		instance.gotoHome("김태희");
		
		/* [실행결과] => 주소값이 동일하다.
		 * company : ch11._01_Company@49e4cb85 true 김성태가 점심먹다 홍길동가 출근하다. 홍길동가 일하다. 홍길동가
		 * 점심먹다 홍길동가 퇴근하다 김태희가 출근하다. 김태희가 일하다. 김태희가 점심먹다 김태희가 퇴근하다
		 */
		
	}
}
