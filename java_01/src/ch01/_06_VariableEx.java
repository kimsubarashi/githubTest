package ch01;

public class _06_VariableEx {
	public static void main(String[] args) {
		/*
		 * 형변환-1
		 * 
		 * 소->대 : 자동 형변환 : 묵시적 형변환, 확대형 변환 => 형변환 생략 가능 => 자료 손실이 발생하지 않으므로
		 * 대->소 : 강제 형변환 : 명시적 형변환, 축소형 변환 => 형변환 생략 불가 => 자료 손실이 발생하므로
		 * 
		 * 1. 자동 형변환 : 묵시적 형변환 => 형변환 생략 가능
		 * - 데이터 큰타입 = 데이터 작은타입;  // 큰타입으로 변환후 대입
		 *   ex) float fnum = 10; float fnum = 10.0f;
		 *   
		 * - 자료형이 다른 값을 연산하는 경우 하나의 큰타입 자료형으로 통일 후 대입
		 *   ex) double dnum = 10.0 + 30;  double dnum = 10.0 + 30.0;  // 40.0이 대입
		 *   
		 * 2. 강제 형변환 : 명시적 형변환 => 형변환 생략 불가이며, 생략시 컴파일 에러가 발생하므로 반드시 형변환해야 한다.
		 * - 데이터 작은타입 = (작은타입)데이터 큰타입;  // 작은타입으로 형변환후 대입 
		 * 
		 * - 자료형이 다른 값을 연산하는 경우 하나의 큰타입 자료형으로 통일 후 대입
		 */
		
		System.out.println("*** 형변환-1 ***");
		// 1. 자동 형변환 : 묵시적 형변환 => 형변환 생략 가능
		double dval = 20;
		System.out.println("dval : " + dval); // dval : 20.0
		
		float fval = 20.5f + 10; // 30.5 = 20.5f + 10.0f;
		System.out.println("fval : " + fval); // fval : 30.5
		
		double dval2 = 10.5 + 30; // 10.5 + 30.0
		System.out.println("dval2 : " + dval2); // dval2 : 40.5
		
		// 2. 강제 형변환 : 명시적 형변환 => 형변환 생략 불가이며, 생략시 컴파일 에러가 발생하므로 반드시 형변환해야 한다.
		int iVal = (int)10.5;
		System.out.println("ival : " + iVal);
		
		int num1 = (int) (10.5 + 30); // ()가 우선순위, 큰타입으로 통일(10.5 + 30.0)
		System.out.println("num1 : " + num1); //num1 : 40
		
		int num2 = (int) 10.5 + 30; // 10 + 30 = 40
		System.out.println("num2 : " + num2);
		
		/*
		 * 형변환 -2
		 * 
		 * 3. int(4바이트)보다 작은 자료형(byte, short)은 int로 형변환후 계산
		 * 예) byte + short => int + int
		 * 
		 * 4. 두개의 피연산자중 표현 범위가 큰쪽에 맞춰서 형변환후 계산
		 * 
		 */
		System.out.println("***** 형변환-2 *****");
		
		int ival2, ival3;
		double dval3;
		
		ival2 = 5 / 4; // int / int => int형임, 원래 결과는 1.25이나 int으로 대입되면서 1로 바뀜
		System.out.println("ival2 : " + ival2); // ival2 : 1
		
		dval3 = 5 / 4; // int / int => int형임, 원래 결과는 1.25이나 int형 1, double형으로 바뀜
		System.out.println("dval3 : " + dval3); // dval3 : 1.0
		
		ival3 = (int)(2.5 + 3.2); // (int) (5.7)
		System.out.println("ival3 : " + ival3); // ival3 : 5
		
		System.out.println("===============");
		
		// int num3 = 3333333333; // 범위(-21억 ~ + 21억) 초과
		
		int ival4 = 1000000;
		int ival5 = 1000000;
		
		long lval1 = 2000; // 자동 형변환됨, int -> long
		long lval2 = 20000000000L;
		
		int num3 = ival4 * ival5; // 오버플로우 : 잘못된 데이터가 들어온다.
		System.out.println("num3 : " + num3); //num3 : -727379968
		
		// 연산 후 대입 => long형으로 대입하기 전부터 연산결과가 int형 범위초과(오버플로우 : 잘못된 데이터가 들어온다.)
		long num4 = ival4 * ival5;
		System.out.println("num4 : " + num4); //num4 : -727379968
		
		// 연산 후 대입 => long형으로 대입하기 전부터 연산결과가 int형 범위초과(오버플로우 : 잘못된 데이터가 들어온다.)
		long num5 = (long)(ival4 * ival5);
		System.out.println("num5 : " + num5); //num5 : -727379968
		
		// 4. 두개의 피연산자중 표현 범위가 큰쪽에 맞춰서 형변환후 계산
		long num6 = (long)ival4 * ival5; // long * int 이므로 long형으로 자동형변환
		System.out.println("num6 : " + num6); // num6 : 1000000000000
	}
}
