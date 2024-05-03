package ch09;

import java.util.Scanner;

public class _06_Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// id를 콘솔에서 입력하기 -> 예외처리
		_06_IDFormat test = new _06_IDFormat();
		
		// 5.예외처리
		System.out.print("아이디를 입력해주세요. : ");
		String userID = sc.nextLine(); //userID를 null로 받으려면 nextLine()사용
		
		try {
			test.setUserID(userID);
		} catch (_06_IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
