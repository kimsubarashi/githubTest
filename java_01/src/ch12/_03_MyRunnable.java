package ch12;

public class _03_MyRunnable implements Runnable{
	
	// 멤버변수
	private String threadName; //ThreadA ThreadB
	
	// 디폴트 생성자
	public _03_MyRunnable() {}
	
	// 매개변수 생성자
	public _03_MyRunnable(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for(int i = 10; i > 0 ; i--) {
			System.out.print(threadName + "-" + i + " ");
		}
		System.out.println();
	}

}
