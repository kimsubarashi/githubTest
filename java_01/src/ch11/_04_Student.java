package ch11;

//358p eqauls() 재정의 전 => studentLee, studentSang => 동일하지 않다.
//361p eqauals() 재정의 후 => studentLee, studentSang => 동일하다.(학번비교)
public class _04_Student {
	int studentId;
	String studentName;
	
	public _04_Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// p361 equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _04_Student) {
			_04_Student std = (_04_Student)obj;
			if(this.studentId == std.studentId) {
				return true;
			}
		}else {
			return false;
		}
		return false;
	}
	// p365 5행 ~ 8행 hashCode() 재정의
	@Override
	public int hashCode() {
		return studentId;
	}
	// @toString()
	public String toString() {
		return studentId + "," + studentName;
	}
}
