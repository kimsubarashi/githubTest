package ch10;

import java.io.IOException;

public class _01_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 하나(1byte)를 쓰고 [Enter]를 누르세요.");
		
		try {
			int i = System.in.read(); 		// 콘솔창에서 1byte 읽어서 아스키값 대입
			System.out.println("i : " + i);	// 아스키값 출력 : 65 => 인코딩(문자 -> 아스키숫자)
			System.out.println((char)i);	// A => 디코딩(아스키숫자 -> 문자)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
