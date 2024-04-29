package ch01;

public class _04_VariableEx {
	public static void main(String[] args) {
		/* 인코딩 : 문자에 해당하는 정수값(아스키코드값) 출력
	     * 디코딩 : 정수값(아스키코드값)에 해당하는 문자 출력
	     * 
	     * 인코딩  A -> 65  디코딩 65 -> A
         * B : 66
         * C : 67
         * Z : 90
         * a : 97
         * b : 98
         * z : 122
       */
		
		// 문자 자료형
		char ch1 = 'A'; // char : 2바이트 문자자료형
		System.out.println("ch1 : " + ch1); //c1 : A
		
		// 인코딩 : 문자에 해당하는 정수값(아스키코드값) 출력
		int ch2 = 'B'; // 묵시적 형변환(자동형변환)
		System.out.println("ch2 : " + ch2); // 66
		
		int ch3 = 67;
		System.out.println("ch3 : " + ch3); // ch3 : 67
		
		// 디코딩 : 정수값(아스키코드값)에 해당하는 문자 출력
		System.out.println("ch3 : " + (char)ch3); // ch3 : C // 명시적형변환(큰 -> 작은)
	}
}
