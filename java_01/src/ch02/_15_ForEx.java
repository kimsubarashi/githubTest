package ch02;

public class _15_ForEx {
	public static void main(String[] args) {
		/*
	       * Test4. for문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * *** 구구단 출력 ***
	       * === 2단 ===
	       * 2 * 1 = 2
	       * ...
	       * 2 * 9 = 18
	       * === 9단 ===
	       * 9 * 1 = 9
	       * ...
	       * 9 * 9 = 81
	       * ==========  마지막에 한번만
	       */
		
		System.out.println("****************");
		System.out.println("*** 구구단 출력 ***");
		System.out.println("****************");
		int dan =2;
		
		for(dan = 2; dan <= 9; dan++) {
			System.out.println("===" + dan + "단 ===");
			for(int i = 1; i <=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		}
		System.out.println("===========");
	}
}
