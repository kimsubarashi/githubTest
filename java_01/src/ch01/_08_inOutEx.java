package ch01;

import java.util.Scanner;

public class _08_inOutEx {
	public static void main(String[] args) {
		
		// 두 수의 합 구하기
		int x = 0;
		int y = 0;
		
		// 클래스명 참조변수명 = new 클래스명();
		// 참조변수명에는 객체(인스턴스)를 가리키는 주소값이 들어있다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		// 참조변수명.메서드
		x = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		
		y = scan.nextInt();
		
		int sum = x + y;
		System.out.print("sum : " + sum);
		
		scan.close();
		//사용 후 닫아줘야함
	}
}
