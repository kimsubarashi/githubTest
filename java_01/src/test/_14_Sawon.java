package test;

// 자식클래스
public class _14_Sawon extends _14_Employee{

   // 멤버변수
   private int sudang;   // 수당 5000
   
   // 디폴트 생성자
   	public _14_Sawon(){}

   // 매개변수 생성자
   // 부모의 매개변수를 호출해서 값 전달
   	public _14_Sawon(String sabun, String name, String deptName, int salary, int sudang){
		super(sabun, name, deptName, salary);
		this.sudang = sudang;
	}
   
   // 멤버메서드
   // getter, setter
	public void setSudang(int sudang){
		this.sudang = sudang;
	}

	public int getSudang(){
		return sudang;
	}
   
   
   // 재정의해서 출력
	@Override
	public void printInfo(){
		super.printInfo();
		System.out.println("수당 :" + sudang);
	}
      
}