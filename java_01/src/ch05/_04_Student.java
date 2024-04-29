package ch05;

public class _04_Student {
	private String studentID; //학번 S001 S002 S003
	private String name;	  //이름 홍길동 아이유 유느님
	private int age;
	
	// 디폴트 생성자
		public _04_Student () {};
		
		// 2. 매개변수 -> 3. 멤버변수
		public _04_Student (String studentID, String name, int age) {
			this.studentID = studentID;
			this.name = name;
			this.age = age;
		}
		
		// 멤버메서드
		// getter, setter
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		
		public void setAuthor(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getStudentID() {
			return studentID;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		// 4. 멤버변수값 출력
		public void printInfo() {
			System.out.println("학번 : " + studentID + ", 이름 : " + name + ", 나이 : " + age);
		}
}
