package ch12;

//3-2. 계좌이체 스레드 - Thread 클래스 작성
public class _06_TransferThread extends Thread{
	// 멤버변수
	private _06_ShareArea shareArea;
	
	//디폴트 생성자
	public _06_TransferThread(){}
	
	//매개변수 생성자
	public _06_TransferThread(_06_ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	
	//run 재정의 => 계좌이체 transfer(1000) 5번 호출
	@Override
	public void run() {
			for(int i = 0; i < 5; i++) {
				shareArea.transfer(1000);
			}
	}
}
