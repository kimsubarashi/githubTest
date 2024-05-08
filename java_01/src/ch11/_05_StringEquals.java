package ch11;

//p358
// == : => 물리적 주소 비교
// equals() => String 클래스와 Integer 클래스에는 equals() 메서드가 이미 재정의 되어 있으므로 비교시 true
public class _05_StringEquals {
	public static void main(String[] args) {
		_04_Student StudentLee = new _04_Student(100, "이상원");
		_04_Student StudentLee2 = StudentLee;
		_04_Student StudentSang = new _04_Student(100, "이상원");
		
		if(StudentLee == StudentLee2) {
			System.out.println("StudentLee와 StudentLee2의 주소는 같습니다.");
		} else {
			System.out.println("StudentLee와 StudentLee2의 주소는 다릅니다.");
		}
		
		if(StudentLee.equals(StudentLee2)) {
			System.out.println("StudentLee와 StudentLee2의 주소는 같습니다.");
		} else {
			System.out.println("StudentLee와 StudentLee2의 주소는 다릅니다.");
		}
		
		if(StudentLee == StudentSang) {
			System.out.println("StudentLee와 StudentSang의 주소는 같습니다.");
		} else {
			System.out.println("StudentLee와 StudentSang의 주소는 다릅니다.");
		}
		
		if(StudentLee.equals(StudentSang)) {
			System.out.println("StudentLee와 StudentSang의 주소는 같습니다.");
		} else {
			System.out.println("StudentLee와 StudentSang의 주소는 다릅니다.");
		}
		
		if(new _04_Student(100, "이상원") == new _04_Student(100, "이상원")) {
			System.out.println("StudentLee와 StudentLee2의 주소는 같습니다.");
		} else {
			System.out.println("StudentLee와 StudentLee2의 주소는 다릅니다.");
		}
	}
}
