package ch02;

import java.util.Scanner;

public class _10_WhileEx {
	public static void main(String[] args) {
		/*
	       * === 2단 ===
	       * 2 * 1 = 2
	       * ...
	       * 2 * 9 = 18
	       * ==========
	       */
	      
	      // new : 힙메모리에 생성하라
	      // 클래스명 참조변수 = new 클래스명();  
	      // 참조변수.멤버메서드();
	      // 참조변수에는 생성된 힙메모리의 주소값이 들어있다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		int i = 1;
		
		System.out.println("===" + dan + "단 ===");
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan*i++));
		}
		System.out.println("==========");
		
		sc.close();
	}
}
