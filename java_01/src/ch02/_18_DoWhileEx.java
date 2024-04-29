package ch02;

public class _18_DoWhileEx {
	public static void main(String[] args) {
		/*
	     * [ do-while ]
	     * => {} 안의 문장을 무조건 한번 수행한 후에 조건식이 참이면 반복, 거짓이면 빠져나간다.
	     * 
	     * do {
	     *     수행문1;
	     *     ...
	     * } while(조건식);    
	     * 수행문2;
	     */
		
		int num =1;
		int sum =0;
		
		do{
			sum += num++;
		}while(num <= 10);
		
		System.out.println("1부터 10까지의 합 : " + sum);
		// 1부터 10까지의 합 : 55
		
	}
}
