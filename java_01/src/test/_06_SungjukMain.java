package test;

import java.util.Scanner;

public class _06_SungjukMain {
	public static void main(String[] args) {
		// 국영수 점수, 합계, 평균, 학점 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- [ 방법1. 디폴트 생성자 호출 -> setter] --");

		_06_Sungjuk jumsu1 = new _06_Sungjuk();
		
		System.out.print(" 국어 성적을 입력하세요 : ");
		int kor = sc.nextInt();
		jumsu1.setKor(kor);

		System.out.print(" 영어 성적을 입력하세요 : ");
		int eng = sc.nextInt();
		jumsu1.setEng(eng);

		System.out.print(" 수학 성적을 입력하세요 : ");
		int math = sc.nextInt();
		jumsu1.setMath(math);

		jumsu1.printInfo();
		
		System.out.println("--------------------");
		System.out.println("-- [ 방법2. 매개변수 생성자로 값전달] --");
		_06_Sungjuk jumsu2 = new _06_Sungjuk(kor, eng, math);

		jumsu2.printInfo();
		
		System.out.println("-----직접 입력-----");
		System.out.println(" 국어 성적 : " + jumsu1.getKor());
		System.out.println(" 영어 성적 : " + jumsu1.getEng());
		System.out.println(" 수학 성적 : " + jumsu1.getMath());
		System.out.println(" 합계 : " + jumsu1.getTotal());
		System.out.println(" 평균 : " + jumsu1.getAvg());
		System.out.println(" 학점 : " + jumsu1.getGrade());

		
		System.out.println("-----직접 입력-----");
		System.out.println(" 국어 성적 : " + jumsu2.getKor());
		System.out.println(" 영어 성적 : " + jumsu2.getEng());
		System.out.println(" 수학 성적 : " + jumsu2.getMath());
		System.out.println(" 합계 : " + jumsu2.getTotal());
		System.out.println(" 평균 : " + jumsu2.getAvg());
		System.out.println(" 학점 : " + jumsu2.getGrade());
		
		sc.close();
	}
}