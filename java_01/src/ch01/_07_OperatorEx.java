package ch01;

public class _07_OperatorEx {

	public static void main(String[] args) {
		
		/*
		 * 연산
		 * 1. 사칙연산자
		 */
		System.out.println("==== 1. 사칙연산자 =====");
		
		int num1 = 8;
		int num2 = 4;
		
		int addR = num1 + num2;
		int subR = num1 - num2;
		int mulR = num1 * num2;
		int divR = num1 / num2;
		int modR = num1 % num2;
		
		System.out.println("num1 + num2 = " + addR);
		System.out.println("num1 + num2 = " + subR);
		System.out.println("num1 + num2 = " + mulR);
		System.out.println("num1 + num2 = " + divR);
		System.out.println("num1 + num2 = " + modR);
		
//		num1 + num2 = 12
//		num1 + num2 = 4
//		num1 + num2 = 32
//		num1 + num2 = 2
//		num1 + num2 = 0
		
		/*
		 * 연산
		 * 2.증감연산자 => 매우 중요
		 * 1) 전위연산자 => y = ++x; => x값을 먼저 1증가시키고, 증가한 값을 y에 대입한다.
		 * 2) 후위연산자 => y = x++; => x값을 먼저 y에 대입한 후, x값을 1증가시킨다.
		 */
		System.out.println("=== 2.증감연산자 ===");
		
		// 전위연산자
		int c = 5;
		int nextC = ++c; // ++c => c=c+1
		System.out.println("c : " + c); // c : 6
		System.out.println("nextC : " + nextC); // nextC : 6
		
		// 후위연산자
		int d = 5;
		int nextD = d++;
		System.out.println("nextD : " + nextD); // nextD : 5
		System.out.println("d : " + d); // d : 6
		
		// 단항연산자가 사칙연산자보다 우선순위가 높다.
		// 동일한 변수에는 최종값이 대입된다.
		int e = 2, f = 3, result = 0;
		// System.out.println(e++ + --f * --e); // 2 + 2 * 2 = 6
		// System.out.println(++e + --f * e--); // 3 + 2 * 3 = 9
		System.out.println(e++ + --f * e--); // 2 + 2 * 3 = 8
		System.out.println("e : " + e); //e = 2
		System.out.println("f : " + f); //f = 2
		
		result = ++e + --f * e--; // 3 + 1 * 3 = 6
		System.out.println("result : " + result); // result : 6
		System.out.println("e : " + e); // e : 2
		System.out.println("f : " + f); // f : 1
		
		/*
		 * 연산
		 * 3.관계연산자 => 매우 중요
		 * - >,<,>=,<=,같다(==),같지않다(!=)
		 * - 결과값은 boolean 타입 : 참(true), 거짓(false)
		 */
		System.out.println("=== 3.관계연산자 ===");
		
		int c1 = 10;
		int c2 = 20;
		
		System.out.println("c1 == c2 : " + (c1 == c2)); // c1 == c2 : false
		System.out.println("c1 != c2 : " + (c1 != c2)); // c1 != c2 : true
		System.out.println("c1 > c2 : " + (c1 > c2)); // c1 > c2 : false
		System.out.println("c1 < c2 : " + (c1 < c2)); // c1 < c2 : true
		System.out.println("c1 >= c2 : " + (c1 >= c2)); // c1 >= c2 : false
		System.out.println("c1 <= c2 : " + (c1 <= c2)); // c1 <= c2 : true
		
		/*
		 * 연산
		 * 4.논리연산자 => 매우 중요
		 * - 1 => 참(true) | 0 => 거짓(false)
		 * - &&(논리곱) :
		 * - ||(논리 합) :
		 * 
		 */
		
		System.out.println("=== 4.논리연산자 ===");
		
		int z1 = 4, y1 = 5;
		System.out.println(z1==4 && y1==5); // T && T = 1 * 1 = 1 true
		System.out.println(z1==4 && y1==10); // T && F = 1 * 0 = 0 false
		System.out.println(z1==4 || y1==7); // T || F = 1 + 0 = 1 true
		System.out.println(z1==7 || y1==7); // F || F = 0 + 0 = 0 false
		
		/*
		 * 연산
		 * 5. 복합대입연산자 => 매우 중요
		 */
		System.out.println("=== 5.복합대입연산자 ===");
		
		int ii =5;
		ii += 10; // ii = ii + 10;
		System.out.println("ii : " + ii); // ii : 15
		
		ii -= 10; // ii = ii - 10;
		System.out.println("ii : " + ii); // ii : 5
		
		ii *= 10; // ii = ii * 10;
		System.out.println("ii : " + ii); // ii : 50
		
		ii /= 10; // ii = ii / 10;
		System.out.println("ii : " + ii); // ii : 5
		
		ii %= 10; // ii = ii / 10;
		System.out.println("ii : " + ii); // ii : 5
		
	}

}
