package ch01;

import java.util.Scanner;

public class _09_InOutEx {
	public static void main(String[] args) {
		// 클래스명 참조변수명 = new 클래스명();
		// 참조변수명에는 객체(인스턴스)를 가리키는 주소값이 들어있다.
		
		// 참조변수명.메서드
		
		//콘솔창에 이름, 나이, 이메일을 입력받아 출력
		System.out.println("=== MyInfo ===");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		System.out.print("이메일을 입력해주세요 : ");
		String email = sc.next();
		
		System.out.println("=== 내 정보 ===");
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n이메일 : " + email);
		sc.close();
	}
}
