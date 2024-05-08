package ch11;

// p364
// String, Integer 클래스는 equals() 메서드의 결과값이 true인 경우 동일한 hashCode() 반환
public class _06_HashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
}
