package ch02;

public class _13_ForEx {
	public static void main(String[] args) {
		/*
	       * 반복문 : 조건이 참인동안 반복(while문, for문)
	       * 
	       * for(초기값; 조건식; 증감식) {  // 반복횟수
	       *     수행문1;
	       *     수행문2;...
	       * }
	       */
	      
	      /* [ 1~10까지의 합 ]
	       * num=1, sum=1;
	       * num=2, sum=3..
	       * num=10, sum=55
	       * 1~10까지의 합 : 55 => 1번 출력
	       */
		int sum = 0;
		for(int num = 1; num <= 10; num++) {
			sum += num;
			System.out.println("num =" + num + ", sum =" + sum);
		}
		System.out.println("1~10까지의 합 : " + sum);
	}
}
