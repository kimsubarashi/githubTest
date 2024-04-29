package ch06;

public class _03_Main {
	public static void main(String[] args) {
	
		// 고객정보 출력 + vip 정보 출력
		_03_VipCustomer vip = new _03_VipCustomer();
		
		// 부모정보 호출
		vip.setId(1001);
		vip.setName("김태희");
		vip.setGrade("vip");
		
		// 자식정보 호출
		vip.setAgentID(9999);
		vip.setSaleRation(0.01);
		vip.printInfo();
		
		_03_BlackCustomer black = new _03_BlackCustomer();
		//부모 정보
		black.setId(1002);
		black.setName("진상");
		black.setGrade("black");
		//자식 정보
		black.setPenalty(1000);
		black.printInfo();
	}
}
