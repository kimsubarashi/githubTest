package test;

import java.util.Scanner;

public class _06_Sungjuk {

	private int kor;
	private int eng;
	private int math;
	
	Scanner sc = new Scanner(System.in);
	
	//디폴트 생성자
	public _06_Sungjuk() {}

	//매개변수 생성자
	public _06_Sungjuk(int kor, int eng, int math){
		setKor(kor);
		setEng(eng);
		setMath(math);
	}

	//getter, setter
	public void setKor(int kor){
		while(kor > 100 || kor < 0) {
			System.out.print(" 잘못된 입력입니다. 국어 성적을 다시 입력해 주세요 : ");
			kor = sc.nextInt();
		}
		this.kor = kor;
	}

	public void setEng(int eng){
		while(eng > 100 || eng < 0) {
			System.out.print(" 잘못된 입력입니다. 영어 성적을 다시 입력해 주세요 : ");
			eng = sc.nextInt();
		}
		this.eng = eng;
	}

	public void setMath(int math){
		while(math > 100 || math < 0) {
			System.out.print(" 잘못된 입력입니다. 수학 성적을 다시 입력해 주세요 : ");
			math = sc.nextInt();
		}
		this.math = math;
	}

	public int getKor(){
		return kor;
	}

	public int getEng(){
		return eng;
	}

	public int getMath(){
		return math;
	}

	//합계, 평균, 학점
	public int getTotal(){
		return kor + eng + math;
	}

	public double getAvg(){
		return ((double)getTotal()/3);
	}

	public char getGrade(){
		if(getAvg() < 0 || getAvg() > 100){
			return 'W';
		} else {
			if(getAvg() >= 90){
				return 'A';
			} else if ( getAvg() >= 80) {
				return 'B';
			} else if ( getAvg() >= 70) {
				return 'C';
			} else if ( getAvg() >= 60) {
				return 'D';
			} else {
				return 'F';
			}
		}
	}

	public void printInfo() {
		System.out.println(" 국어 성적 : " + kor);
		System.out.println(" 영어 성적 : " + eng);
		System.out.println(" 수학 성적 : " + math);
		System.out.println(" 합계 : " + getTotal());
		System.out.println(" 평균 : " + getAvg());
		System.out.println(" 학점 : " + getGrade());
	}
	
}