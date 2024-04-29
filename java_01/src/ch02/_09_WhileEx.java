package ch02;

public class _09_WhileEx {
	public static void main(String[] args) {
		/*
        반복문 : 조건이 참인 동안 계속해서 반복수행(while문, for문)
               1.초기값 -> 2.조건식 -> 3.증감식
               
        [ while 문법 ]
        1. 초기값;
        while(조건식) { // 2. 조건식
           수행문1;
           증감식;  // 3. 증감식
        }
        수행문2;
        
     */
	
		System.out.println("=== 1. 1~10까지 출력 ===");
		//1. 초기값;
		int i = 1;
		
		// 1 2 3 4 5 6 7 8 9 10
		while(i <= 10) {
			System.out.print(i++ + " ");
		}
		System.out.println("\n반복문 종료");
		
		System.out.println("=== 2. 1~10까지 합계 출력 ===");
		
		int k = 1;
		int sum1 = 0;
		
		while(k < 11) {
			sum1 += k++;
		}
		System.out.println("1~10까지의 합계 : " + sum1);
		System.out.println("반복문 종료~~");
		
		System.out.println("===3. 1~10까지의 합계 과정 출력 ===");
		int j = 1;
		int sum2 = 0;
		
		while(j < 11) {
			System.out.println(j + "+" + sum2 + "=" + (j+sum2));
			sum2 += j++;
		}
		System.out.println("반복문 종료~~");
	}
}
