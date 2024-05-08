package test;

//자식클래스
public class _14_Manager extends _14_Employee{
   // 멤버변수
   private int bonus;   // 보너스 1000
   
   // 디폴트 생성자
   	public _14_Manager(){}

   // 매개변수 생성자
   // 부모의 매개변수를 호출해서 값 전달
   	public _14_Manager(String sabun, String name, String deptName, int salary, int bonus){
		super(sabun, name, deptName, salary);
		this.bonus = bonus;
	}
   
   // 멤버메서드
   // getter, setter
   	public void setBonus(int bonus){
		this.bonus = bonus;
	}

	public int getBonus(){
		return bonus;
	}
   
   // 재정의해서 출력
	@Override
	public void printInfo(){
		super.printInfo();
		System.out.println("보너스 :" + bonus);
	}
}