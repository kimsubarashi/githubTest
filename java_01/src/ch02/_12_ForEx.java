package ch02;

public class _12_ForEx {
	public static void main(String[] args) {
		/*
	     * 반복문 : 조건이 참인동안 반복(while문, for문)
	     * 
	     * for(초기값; 조건식; 증감식) {  // 반복횟수
	     *     수행문1;
	     *     수행문2;...
	     * }
	     */
	    
	    // 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^
	    //        반복문 종료^^ 
		
		for(int i = 1; i<=5; i++) {
			System.out.println("HappyDay" + i + "^^");
		}
		System.out.println("반복문 종료^^");
		
		// 출력 => HappyDay5^^   HappyDay4^^  HappyDay3^^  HappyDay3^^  HappyDay1^^
        //  
		
		for(int i = 5; i >= 1; i--) {
			System.out.println("HappyDay" + i + "^^");
		}
		System.out.println("반복문 종료^^");
	}
}
