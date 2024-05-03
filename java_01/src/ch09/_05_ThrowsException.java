package ch09;

import java.util.Scanner;

public class _05_ThrowsException {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("나이 : " + age);
		}catch(Exception e) {
			System.out.println("메시지 : " + e.getMessage());
		}finally {
			System.out.println("정상종료^^");
			input.close();
		}
		
	}
	
	public static int readAge() throws Exception{
		System.out.print("나이를 입력하세요 : ");
		int age = input.nextInt();
		
		if(age < 0) {
			// 1.강제예외발생 : throw new Exception(message);
			throw new Exception("나이는 0보다 큽니다.!!"); //Exception 매개변수 생성자 호출
		}
		
		return age;
	}
}
