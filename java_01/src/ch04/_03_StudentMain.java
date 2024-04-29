package ch04;

public class _03_StudentMain {
	   public static void main(String[] args) {
		
		   _03_Student lee = new _03_Student();
		   lee.setName = ("이지원");
		   // System.out.printl("serial : " + lee.serialNum);
		   
		   System.out.println("serial : " + _03_Student.seriaNum);
		   System.out.println("이름 : " + lee.getName());
		   System.out.println("학번 : " + lee.getStudentID());
		   
		   System.out.println("-------------");
		   
		   _03_Student son = new _03_Student();
		   son.setName("손수경");
		   // System.out.printl("serial : " + son.serialNum);
		   System.out.println("serial : " + _03_Student.seriaNum);
		   System.out.println("이름 : " + son.getName());
		   System.out.println("학번 : " + son.getStudentID());
	}
	
	
}
