package ch05;

public class _03_Book {
	
	//멤버변수
	private String title; //태백산맥 데미안 자바
	private String author;//조정래 헷세 김기태
	
	// 디폴트 생성자
	public _03_Book () {};
	
	// 2. 매개변수 -> 3. 멤버변수
	public _03_Book (String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 멤버메서드
	// getter, setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	// 4. 멤버변수값 출력
	public void printInfo() {
		System.out.println("제목 : " + title + ", 저자 : " + author);
	}
}
