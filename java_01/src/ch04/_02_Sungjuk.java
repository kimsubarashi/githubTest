package ch04;

public class _02_Sungjuk {
	private int kor;
	private int eng;
	private int math;
	
	//디폴트 생성자;
	public _02_Sungjuk() {}
	// 매개변수 생성자;
	public _02_Sungjuk(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//getter, setter
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		int total = kor + eng + math;
		return total;
	}
	
	public void printInfo(int kor, int eng, int math){
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : "  + math);
		System.out.println("총합 점수 : " + getTotal());
	}
}
