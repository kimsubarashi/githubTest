package ch02;

import java.util.Scanner;

public class _05_IfEx {
	public static void main(String[] args) {
		System.out.println("--- 3항연산자 (1) ---");
		
		// 결과 = 조건식 ? 참 : 거짓;
		
		int age = 6;
		String result = "";
		
		result = ( age >=  8) ? "학교에 다닙니다." : "학교에 다니지 않습니다.";
		System.out.println("result : " + result);
		
		System.out.println("--- 3항연산자 (2) ---");
		int score = 39;
		
		if(score >= 60) {
			result = "합격";
		}
		else if(score >= 40) {
			result = "불합격";
		}
		else {
			result = "과락";
		}
		System.out.println(score + " : " + result);
		
		// 3항연산 적용
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		result = (score >= 60) ? "합격" : ((score >= 40) ? "불합격" : "과락");
		System.out.println(score + " : " + result);
		
		sc.close();
	}
	
}
