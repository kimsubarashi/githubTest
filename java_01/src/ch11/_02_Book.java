package ch11;

//354p
class _02_Book {
	int bookNumber;
	String bookTitle;
	
	_02_Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public static void main(String[] args) {
		_02_Book book1 = new _02_Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		/*
		 * ch11._02_Book@7c30a502 //패키지명.클래스명@주소값
		 * ch11._02_Book@7c30a502 //패키지명.클래스명@주소값
		 */
	}
}
