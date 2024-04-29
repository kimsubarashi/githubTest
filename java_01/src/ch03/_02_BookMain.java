package ch03;

import java.util.Scanner;

public class _02_BookMain {
	public static void main(String[] args) {
		/*
		 * [인스턴스(객체) 생성]
		 * 클래스명 참조변수 = new 클래스명();
		 * 참조변수에는 클래스의 주소값이 들어있다.
		 * 참조변수.멤버변수 = 값;
		 * 참조변수.멤버메소드();
		 */
		Scanner sc = new Scanner(System.in);
		
		// 클래스명 참조변수 = new 클래스명();
		_02_Book java = new _02_Book();
		
		// 참조변수.멤버변수 = 값;
		java.setBookNo(1); //1.
		java.setBookTitle("JAVA입문");
		
		System.out.print("금액을 입력하세요. : ");
		java.setPrice(sc.nextInt());
		java.setAuthor("박은종");
		
		// 참조변수.멤버메소드();
		java.printInfo();
		
		//printInfo(직접)
		System.out.println("===============");
		System.out.println("책 번호 : " + java.getBookNo());
		System.out.println("책 이름 : " + java.getBookTitle());
		System.out.println("책 가격 : " + java.getPrice());
		System.out.println("책 저자 : " + java.getAuthor());
		
		// 클래스명 참조변수 = new 클래스명();
		_02_Book jsp = new _02_Book();
		
		// 참조변수.멤버변수 = 값;
		jsp.setBookNo(2);
		jsp.setBookTitle("JSP");
		jsp.setPrice(20000);
		jsp.setAuthor("최범균");
		
		// 참조변수.멤버메소드();
		System.out.println("===============");
		jsp.printInfo();
		
		//printInfo(직접)
		System.out.println("===============");
		System.out.println("책 번호 : " + jsp.getBookNo());
		System.out.println("책 이름 : " + jsp.getBookTitle());
		System.out.println("책 가격 : " + jsp.getPrice());
		System.out.println("책 저자 : " + jsp.getAuthor());
		
		sc.close();
	}
}
