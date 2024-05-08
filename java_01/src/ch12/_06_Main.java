package ch12;

public class _06_Main {
	public static void main(String[] args) {
		/*
	       * 1) 한계좌의 금액을 다른 계좌로 이체
	       * 2) 공유영역(김태희 계좌(200만원) + 비 계좌(100만원)
	       * 3) 두 계좌의 잔액합계를 출력하는 일을 동시에 한다.
	       */
	      // 스레드 발생
		
		//객체 5개, 스레드 5개
		//객체
		//멤버변수
		//계좌정보 	010-1111-2222	010-8888-9999
		//예금주명	김태희			비
		//잔액		2000000			1000000
		_06_Account kim = new _06_Account("010-1111-2222", "김태희", 2000000);
		_06_Account bi = new _06_Account("010-8888-9999", "비", 1000000);
		_06_ShareArea share = new _06_ShareArea(kim, bi);
		
		_06_Account iu = new _06_Account("010-3333-4444", "아이유", 2000000);
		_06_Account suk = new _06_Account("010-6666-7777", "김숙", 1000000);
		_06_ShareArea share2 = new _06_ShareArea(iu, suk);
		
		//이체
		System.out.println("[계좌 이체 5회 _06_TransferThread]");
		_06_TransferThread transfer = new _06_TransferThread(share);
		transfer.start(); // run() 호출
		
		_06_TransferThread transfer2 = new _06_TransferThread(share2);
		transfer2.start(); // run() 호출
		
		//합계
		System.out.println("[잔액합계 3회 출력 _06_TotalBalanceThread]");
		_06_TotalBalanceThread totalBalance = new _06_TotalBalanceThread(share);
		totalBalance.start(); // run() 호출
		
		_06_TotalBalanceThread totalBalance2 = new _06_TotalBalanceThread(share2);
		totalBalance2.start(); // run() 호출
		
	}
}
