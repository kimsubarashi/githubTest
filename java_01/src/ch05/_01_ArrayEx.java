package ch05;

public class _01_ArrayEx {
	/*
     * 배열(Array) : 대량의 동일한 자료형의 데이터를 한꺼번에 저장할 수 있는 저장장소이다.
     * 방법1) 선언과 생성을 따로 한다.
     *       int[] scores;  // 선언
     *       scores = new int[갯수];  // 생성
     *       scores[index] = 값;
     * 
     * 방법2) 선언과 생성을 동시에 한다. .. 추천
     *       int[] scores = new int[갯수]
     *      scores[index] = 값;
     *      
     * 방법3) int[] scores = new int[]{값1, 값2,...}   // 갯수는 생략해야 함.  추천
     * 
     * 방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
     *       int[] scores = {값1, 값2,...};      
     */
	public static void main(String[] args) {
		/* 방법2) 선언과 생성을 동시에 한다. .. 추천
	    *    int[] scores = new int[갯수]
	    *     scores[index] = 값;
	    */
		int[] scores = new int[5];
		for(int i = 0; i < scores.length ; i++) {
			scores[i] = 10*(i+1);
			System.out.println("score[" + i + "]" + scores[i]);
		}
		
		/*	방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
	    *       int[] scores = {값1, 값2,...};      
	    */
		int[] scores2 = {10,20,30,40,50};
		
		for(int i = 0; i < scores.length ; i++) {
			System.out.println("score[" + i + "]" + scores2[i]);
		}
	}
}
