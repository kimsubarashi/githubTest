package ch05;

public class _02_ArrayEx {
	public static void main(String[] args) {
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
		
		String[] drink1 = new String[5];
		drink1[0] = "매실녹차";
		drink1[1] = "제로콜라";
		drink1[2] = "칠성사이다";
		drink1[3] = "환타";
		drink1[4] = "파워에이드";
		
		for(int i = 0; i < drink1.length ; i++) {
			System.out.println("drink1[" + i + "] : " + drink1[i]);
		}
		
		String[] drink2 = {"아이스티","밀키스","닥터페퍼","게토레이","포카리스웨트"};
		
		for(int i = 0; i < drink2.length ; i++) {
			System.out.println("drink2[" + i + "] : " + drink2[i]);
		}
	}
}
