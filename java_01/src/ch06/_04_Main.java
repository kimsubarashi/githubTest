package ch06;

public class _04_Main {
	public static void main(String[] args) {
		
		System.out.println("==== VIP ====");
		// 고객정보 출력 + vip 정보 출력
		_04_VipCustomer vip = new _04_VipCustomer();
		
		System.out.println("== <방법1> setter로 값 전달 ==");
		// 부모정보 호출
		vip.setId(1004);
		vip.setName("김태희");
		vip.setGrade("vip");
		vip.setMoney(10000);
		
		// 자식정보 호출
		vip.setAgentID(777);
		vip.setSaleRation(0.01);
		vip.printInfo(); //자식메서드가 호출
		System.out.println("== <방법2> 매개변수로 값 전달 ==");
		
		_04_VipCustomer vip2 = new _04_VipCustomer(1004,"김태희","vip",10000, 777, 0.01);
		vip2.printInfo();
		
		System.out.println("--------------------------");
		
		System.out.println("==== Black ====");
		_04_BlackCustomer black = new _04_BlackCustomer();
		
		System.out.println("== <방법1> setter로 값 전달 ==");
		//부모 정보
		black.setId(666);
		black.setName("진상");
		black.setGrade("black");
		black.setMoney(20000);
		//자식 정보
		black.setPenalty(-100);
		black.printInfo(); //자식메서드가 호출
		
		System.out.println("== <방법2> 매개변수로 값 전달 ==");
		
		_04_BlackCustomer black2 = new _04_BlackCustomer(666,"진상","black",20000, -100);
		black2.printInfo();
	}
}
