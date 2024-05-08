package ch11;

// p370
public class _08_StringTest1 {
	// str1, str2는 동적메모리 공간인 힙메모리 주소이다.
	// String, Integer 클래스는 equals(), hashCode()가 미리 재정의되어 있다.
	// 재정의된 equals()는 주소가 아닌 값을 비교한다.
	public static void main(String[] args) {
		//힙메모리에 새로 생성 -> 주소값 다름
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		//String의 equals는 이미 재정의 되어 있어서 값이 같은지 비교한다.
		System.out.println(str1.equals(str2));
		
		//상수풀에 저장 -> 주소값 같음
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str2));
	}
}
