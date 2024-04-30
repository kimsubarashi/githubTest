package ch08;

import java.util.Scanner;

public class _06_Main {
	public static void main(String[] args) {

		//디폴트 생성자 호출
		_06_BookArrayList book = new _06_BookArrayList();
				
		// _05_Member 매개변수 생성자로 값 전달
		book.addBook(new _06_Book(101,"JAVA","박은종"));
		book.addBook(new _06_Book(102,"JSP","박명수"));
		book.addBook(new _06_Book(103,"SPIRNG","박나래"));
				
		//회원출력
		book.showAllBook();
				
		// 회원삭제 .. 1004 회원 삭제
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 책의 책번호를 입력 하시오 : ");
		book.removeBook(sc.nextInt());
		
		//12.회원출력
		book.showAllBook();
		sc.close();
	}
}
