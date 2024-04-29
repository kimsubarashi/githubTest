package ch02;

import java.util.Scanner;
public class _14_ForEx {
	public static void main(String[] args) {
		 /*
	       * for문을 이용해 콘솔에서 단을 입력받아 구구단 출력
	       * 단을 입력하세요 : 2
	       * === 2단 ===
	       * 2 * 1 = 2..
	       * 2 * 9 = 18
	       * =========== 
	       */
	      // new : 힙메모리에 생성하라
	      // 클래스명 참조변수 = new 클래스명();  
	      // 참조변수.멤버메서드();
	      // 참조변수에는 생성된 힙메모리의 주소값이 들어있다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();

		System.out.println("===" + dan + "단 ===");
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		System.out.println("===========");
		
		sc.close();
	}
}
