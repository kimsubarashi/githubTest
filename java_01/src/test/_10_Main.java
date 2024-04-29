package test;

// 부모클래스(공통)
public class _10_Main {
	// 멤버변수
   	// 사번     E001         E002
   	// 이름  아이유       김태희
   	// 부서명 엔터테인먼트   IT
   	// 급여   100000      500000

	public static void main(String[] args){
	//배열을 이용하여 3명의 사원정보를 출력하세요

		_08_Employee[] emp = new _08_Employee[3];

		emp[0] = new  _08_Employee("E001", "아이유", "엔터테이먼트", 100000);
		emp[1] = new  _08_Employee("E002", "김태희", "IT", 500000);
		emp[2] = new  _08_Employee("E003", "김성태", "연극", 350000);
	
		for(int i = 0; i < emp.length; i++){
			emp[i].printinfo();
			System.out.println("----------------------------------");
		}
	
	}
}