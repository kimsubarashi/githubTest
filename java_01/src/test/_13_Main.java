package test;

import java.util.Scanner;

import ch09._06_IDFormat;
import ch09._06_IDFormatException;
import test._13_PasswordFormat;
import test._13_PasswordInvalidException;

public class _13_Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String userID;
		String password;
		
		// id를 콘솔에서 입력하기 -> 예외처리
		_06_IDFormat test = new _06_IDFormat();
		
		// 5.예외처리
		while(true) {
			System.out.print("아이디를 입력해주세요. : ");
			userID = sc.nextLine(); //userID를 null로 받으려면 nextLine()사용
			
			try {
				test.setUserID(userID);
			} catch (_06_IDFormatException e) {
				System.out.println(e.getMessage());
				continue;
			}
			break;
		}
		
		// id를 콘솔에서 입력하기 -> 예외처리
		_13_PasswordFormat test2 = new _13_PasswordFormat();
		
		// 5.예외처리
		while(true) {
			System.out.print("비밀번호를 입력해주세요. : ");
			password = sc.nextLine(); //userID를 null로 받으려면 nextLine()사용
			
			try {
				test2.setPassword(password);
			} catch (_13_PasswordInvalidException e) {
				System.out.println(e.getMessage());
				continue;
			}
			break;
		}
		
		System.out.println("아이디 : " + userID);
		System.out.println("아이디 : " + password);
	}
}
