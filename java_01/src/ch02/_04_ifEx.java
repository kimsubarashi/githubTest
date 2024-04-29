package ch02;

import java.util.Scanner;
public class _04_ifEx {
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
		
		 System.out.println("---- 1. 방법1. ----");
	      if((score >= 90) && (score <= 100)) {   // 90~100
	         grade = 'A';
	      }
	      else if((score >= 80) && (score <= 89)) {  // 80~89
	         grade = 'B';
	      }
	      else if((score >= 70) && (score <= 79)) {  // 70~79
	         grade = 'C';
	      }
	      else if((score >= 60) && (score <= 69)) {  // 60~69
	         grade = 'D';
	      }
	      else if((score >= 0) && (score <= 59)) {  // 0~59
	         grade = 'F';
	      }
	      else { // 100보다 클때, 0미만
	         grade = 'W';
	      }
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
		System.out.println("---- 1.방법2 ----");
		if(score > 100 || score < 0) {  // 논리합 : 둘중 하나만 참이어도
			grade = 'W';
		}else {
			if(score >= 90) {
				grade = 'A';
			}else if(score >= 80){
				grade = 'B';
			}else if(score >= 70) {
				grade = 'C';
			}else if(score >= 60) {
				grade = 'D';
			}else if(score >= 0) {
				grade = 'F';
			}else {
				grade = 'W';
			}
		}
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
		sc.close();
	}
}
