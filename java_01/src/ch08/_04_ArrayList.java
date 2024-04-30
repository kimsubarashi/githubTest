package ch08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_ArrayList {
	public static void main(String[] args) {
		/*
		 * 8. 검색 : list.indexOf(검색할 값); // 중요 => 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그
		 * 위치의 인덱스를 리턴한다.
		 *
		 * list.lastIndexOf(검색할 값) => 리스트에서 검색할 값과 똑같은 값을 갖는 마지막번째 데이터를 찾아서 그 위치의 인덱스를
		 * 리턴한다.
		 *
		 * 검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 */
		
		// HONGKILDONG
		// ArrayList 생성
		List<String> list = new ArrayList<String>();
		list.add("H"); //0번째
		list.add("O");
		list.add("N");
		list.add("G");
		list.add("K");
		list.add("I"); //5번째
		list.add("L");
		list.add("D");
		list.add("O");
		list.add("N");
		list.add("G"); //10번째
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인덱스 입력해주세요 : ");
		String index = sc.next();
		
		// 일치하는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		System.out.println(index + "문자의 인덱스를 : " + list.indexOf(index));
		System.out.println("G문자의 인덱스를 : " + list.indexOf("G")); //3
		System.out.println("N문자의 인덱스를 : " + list.indexOf("N")); //2
		
		System.out.println("G문자의 인덱스를 : " + list.indexOf("G")); //10
		System.out.println("Z문자의 인덱스를 : " + list.indexOf("Z")); //-1
		
		// 전체 리스트 출력 : 향상된 for문
		for(String str : list) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		// 9.전체 삭제 : list.clear();
		list.clear();
		System.out.println("=== 리스트 삭제 후 ===");
		for(String str : list) {
			System.out.println(str);
		}
		
		sc.close();
	}
}
