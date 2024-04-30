package ch08;

import java.util.ArrayList;
import java.util.Iterator;

public class _03_ArrayList {
	public static void main(String[] args) {
		
		//선언
		//클래스명<데이터타입클래스> 참조변수 = new 클래스명<데이터타입클래스>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		
		//1.for
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//2.향상된 for문
		for(String str : list) {
			System.out.println(str);
		}
		
		//3.반복자
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String food = iterator.next();
			System.out.println(food);
		}
		
		Iterator iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			String food = (String)iterator2.next();
			System.out.println(food);
		}
	}
}
