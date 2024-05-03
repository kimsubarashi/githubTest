package test;

import java.util.HashMap;
import java.util.Iterator;
import test._12_Book;

public class _12_BookHashMap {
	private HashMap<Integer, _12_Book> hashMap;
	
	//디폴트 생성자
	public _12_BookHashMap() {
		hashMap = new HashMap<Integer, _12_Book>();
	}
	
	//책 추가
	public void addBook(_12_Book book) {
		hashMap.put(book.getBookNo(), book);
	}
	
	//책 삭제
	public boolean removeBook(int bookNo) {
		if(hashMap.containsKey(bookNo)) { //매개변수로 받은 키값이 HashMap에 있는지 확인
			hashMap.remove(bookNo);
			return true;
		}
		System.out.println(bookNo + "가 존재하지 않습니다");
		return false;
	}
	
	//책 출력 (Iterator 사용)
	public void showAllBook() {
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			_12_Book book = hashMap.get(key);
			System.out.println(book);
		}
		System.out.println();
	}
}
