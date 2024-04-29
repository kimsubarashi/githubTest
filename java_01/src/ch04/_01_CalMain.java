package ch04;

import java.util.Scanner;

public class _01_CalMain {
	public static void main(String[] args) {
		// 객체생성 : 클래스명 참조변수 = new 클래스명();
		Scanner sc = new Scanner(System.in);
		
		_01_Calculator cal = new _01_Calculator();
		
		System.out.print("첫번째 숫자를 입력하세요. : ");
		double num1 = sc.nextDouble();
		
		System.out.print("두번째 숫자를 입력하세요. : ");
		double num2 = sc.nextDouble();
		
		System.out.println("덧셈 : " + cal.add(num1, num2));
		System.out.println("뺄셈 : " + cal.sub(num1, num2));
		System.out.println("곱셈 : " + cal.mul(num1, num2));
		System.out.println("나눗셈 : " + cal.div(num1, num2));
		
		System.out.println("==========");
		cal.calInfo(num1, num2);
		System.out.println("==========");
		double sum = cal.add(num1, num2);
		double sub = cal.sub(num1, num2);
		double mul = cal.mul(num1, num2);
		double div = cal.div(num1, num2);
		
		System.out.println("덧셈 : " + sum);
		System.out.println("뺄셈 : " + sub);
		System.out.println("곱셈 : " + mul);
		System.out.println("나눗셈 : " + div);
		
		sc.close();
	}
}
