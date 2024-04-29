package ch04;

import java.util.Scanner;

public class _02_SungjukMain {
	public static void main(String[] args) {
		
		System.out.println(" --[방법1. 디폴트 생성자 호출 -> setter로 값 전달]--");
		//1.1 디폴트 생성자 호출 -> setter -> 매개변수 -> 멤버 변수
		//객체 생성
		Scanner sc = new Scanner(System.in)
				;
		_02_Sungjuk sungJuk = new _02_Sungjuk();
		
		System.out.println("국어 점수를 입력해주세요. : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력해주세요. : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력해주세요. : ");
		int math = sc.nextInt();
		
		sungJuk.setKor(kor);
		sungJuk.setEng(eng);
		sungJuk.setMath(math);
		//1-2. 참조변수. 멤버메서드
		
		//printInfo()로 출력
		sungJuk.printInfo(sungJuk.getKor(),sungJuk.getEng(),sungJuk.getMath());
		
		System.out.println("----------");
		System.out.println("-- [방법2. 매개변수 생성자로 값전달 ] --");
		// 객체생성
		
		_02_Sungjuk Sungjuk2 = new _02_Sungjuk(kor, eng, math);
		
		//getter로 출력
		System.out.println("국어 점수 : " + Sungjuk2.getKor());
		System.out.println("영어 점수 : " + Sungjuk2.getEng());
		System.out.println("수학 점수 : "  + Sungjuk2.getMath());
		System.out.println("총합 점수 : " + Sungjuk2.getTotal());
		
		sc.close();
	}
}
