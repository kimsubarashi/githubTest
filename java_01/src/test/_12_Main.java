package test;

import test._12_Book;

//	book 번호 	101 	102 	103
// 	book 이름 	JAVA	JSP		SPRING
//	book 저자		박은종	박명수	박나래

public class _12_Main {
	// HashMap을 이용하여 Book 정보 추가, 삭제, 출력
	public static void main(String[] args) {
		_12_BookHashMap bookHashMap = new _12_BookHashMap(); //생성자
		
		bookHashMap.addBook(new _12_Book(101,"JAVA","박은종"));
		bookHashMap.addBook(new _12_Book(102,"JSP","박명수"));
		bookHashMap.addBook(new _12_Book(103,"SPRING","박나래"));
		
		bookHashMap.showAllBook();
		
		bookHashMap.removeBook(103);
		
		bookHashMap.showAllBook();
		
	}
}
