package ch05;

public class _03_BookMain {
	// 멤버변수
	// 태백산맥 데미안 자바
	// 조정래 헷세 김기태

	public static void main(String[] args) {
		_03_Book[] library = new _03_Book[3];

		library[0] = new _03_Book("태백산맥", "조정래");
		library[1] = new _03_Book("데미안", "헷세");
		library[2] = new _03_Book("자바", "김기태");

		for (int i = 0; i < library.length; i++) {
			library[i].printInfo();
		}
	}
}
