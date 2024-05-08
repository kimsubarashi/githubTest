package test;

public class _14_EmpMain {
   public static void main(String[] args) {
      System.out.println("<< Manager 정보 >>");
      System.out.println("--- 방법1. setter로 값 전달");
      _14_Manager manager1 = new _14_Manager();
	
	manager1.setSabun("E001");
	manager1.setName("아이유");
	manager1.setDeptName("엔터테이먼트");
	manager1.setSalary(100000);
	manager1.setBonus(1000);

	manager1.printInfo();
	
      System.out.println("--- 방법2. 자식 매개변수 생성자로 값 전달");
      _14_Manager manager2 = new _14_Manager("E002", "김태희", "IT", 500000, 1000);
	
      manager2.printInfo();
      
      System.out.println("<< Sawon 정보 >>");
      System.out.println("--- 방법1. setter로 값 전달");
      _14_Sawon sawon1 = new _14_Sawon();
	
	sawon1.setSabun("E001");
	sawon1.setName("아이유");
	sawon1.setDeptName("엔터테이먼트");
	sawon1.setSalary(100000);
	sawon1.setSudang(5000);

	sawon1.printInfo();

      System.out.println("--- 방법2. 자식 매개변수 생성자로 값 전달");
      _14_Sawon sawon2 = new _14_Sawon("E002", "김태희", "IT", 500000, 5000);

	sawon2.printInfo();
   }
   
}