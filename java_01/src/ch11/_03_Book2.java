package ch11;

//p356 - 재정의 후
//extends Object 생략
public class _03_Book2 {
	int bookNumber;
	String bookTitle;
	
	_03_Book2(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//재정의
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	
	public static void main(String[] args) {
		_03_Book2 book1 = new _03_Book2(200, "개미");
		
		//재정의한 toString() 호출
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
