package ch02;

import java.util.Scanner;

public class _07_SwitchCaseEx {
	public static void main(String[] args) {
		/*
	       * Test1. if문을 이용한 학점 구하기
	       * 1. 점수는 score 변수, 학점은 grade 변수
	       * 2. 점수가 90점 이상이면 A
	       *    점수가 80점 이상이면 B
	       *    점수가 70점 이상이면 C
	       *    점수가 60점 이상이면 D
	       *    점수가 60점 미만이면 F
	       *    범위를 벗어나면 W
	       * 3. 결과출력 => 점수 : 80, 학점 : B
	       * 
	       * || : 논리합 : OR(또는) => 양쪽 모두 거짓일 때 거짓
	       * && : 논리곱 : AND(이면서) => 양쪽 모두 참일때 참
	       *    
	       */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		char grade = ' ';
		
		//내가한거
		switch(score/10) {
			case 10 :
				if(score%10 == 0) {
					grade = 'A';
				} else {
					grade = 'W';
				}
				break;
			case 9 : 
				grade = 'A';
				break;
			case 8 : 
				grade = 'B';
				break;
			case 7 : 
				grade = 'C';
				break;
			case 6 : 
				grade = 'D';
				break;
			case 5 : case 4 : case 3 : case 2 : case 1 : case 0 : 
				grade = 'F';
				break;
			default : grade = 'W';
				break;
		}
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
		//내가 안한거
		if((score > 100 || score < 0)) {
			grade = 'W';
		} else {
			switch(score/10) {
			case 10 :
			case 9 : 
				grade = 'A';
				break;
			case 8 : 
				grade = 'B';
				break;
			case 7 : 
				grade = 'C';
				break;
			case 6 : 
				grade = 'D';
				break;
			default : 
				grade = 'F';
				break;
			}
		}
		
	System.out.println("점수 : " + score + ", 학점 : " + grade);
		
		sc.close();
	}
}
