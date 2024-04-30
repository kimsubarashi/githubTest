package ch08;

public class _06_Book {
	//멤버변수
	private int bookNo; //	 	book 번호 	101 	102 	103
	private String bookName; // book 이름 	JAVA	JSP		SPRING
	private String author;//	book 저자		박은종	박명수	박나래
	
	//생성자
	//디폴트 생성자
	public _06_Book() {}
	
	//매개변수 생성자
	public _06_Book(int bookNo, String bookName, String author) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
	}
	
	//멤버메서드 Getter, Setter
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	//출력 - 부모 toString() 재정의
	@Override
	public String toString() {
		return "책번호 :" + bookNo + ", 책 이름 : " + bookName + ", 저자 : " + author;
	}
}
