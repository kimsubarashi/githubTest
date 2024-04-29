package test;

public class _07_Main {
	public static void main(String[] args){
	// 상속이란?
	// 자식클래스가 부모클래스의 특성을 이어 받는 것

	// 오버라이드란?
	// 자식클래스가 부모클래스와 같은 메소드를 정의 할때 메소드를 재정의 하는 것 (ex : showInfo())

	//멤버변수
	// 고객 ID : 1001	1002
	// 고객명 : 김태희	블랙
	// 고객등급 : vip	black
	
		_07_VipClient vip = new _07_VipClient(1001,"김태희","vip",2000, 0.01);
		vip.showInfo();

		_07_BlackClient black = new _07_BlackClient(1002,"블랙","black",1000);
		black.showInfo();
	}
}