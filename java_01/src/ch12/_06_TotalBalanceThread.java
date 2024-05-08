package ch12;

// 3-2 잔액합계 스레드 - Thread 클래스 상속
public class _06_TotalBalanceThread extends Thread{
	
	// 멤버변수
	private _06_ShareArea shareArea;
	
	//디폴트 생성자
	public _06_TotalBalanceThread() {}
	
	//매개변수 생성자
	public _06_TotalBalanceThread(_06_ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	
	// run 재정의 => getBalanceTotal() 3번 호출해서 잔액합계 출력, 1초간격
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("잔액 합계 :" + shareArea.getBalanceTotal());
			
			try {
				Thread.sleep(1000); //1000 : 1초 => cup의 시간을 다른 스레드에게 넘겨주는 효율적인 방법
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
