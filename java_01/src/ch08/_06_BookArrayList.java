package ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList에 책정보 추가, 삭제, 조회
public class _06_BookArrayList {
	
	List<_06_Book> list;
	
	//디폴트 생성자
	public _06_BookArrayList() {
		list = new ArrayList<_06_Book>();
	}
	
	//책추가 메서드.. 매개변수에 참조변수 전달
	public void addBook(_06_Book book) {
		list.add(book);
	}
	
	//책삭제 메서드 - key로 삭제
	public boolean removeBook(int bookNo) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBookNo() == bookNo) {
				list.remove(i);
				return true;
			}
		}
		System.out.println("책번호 " + bookNo + "이 없습니다.");
		return false;
	}
	
	//전체 회원 출력
	public void showAllBook(){
		//향상된 for문
		System.out.println("=== 방법1. 향상된 for문 ===");
		
		for(_06_Book book : list) {
			System.out.println(book);
		}
		System.out.println();
		//반복자 Iterator
		System.out.println("=== 방법2. 반복자 Iterator ===");
		Iterator<_06_Book> book = list.iterator();
		while(book.hasNext()) {
			_06_Book bk = book.next();
			System.out.println(bk);
		}
		System.out.println();
	}
	
}
