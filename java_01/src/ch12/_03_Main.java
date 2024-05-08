package ch12;

public class _03_Main {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new _03_MyRunnable("ThreadA"));
		thread.start();
		
		System.out.println();
		
		Thread thread2 = new Thread(new _03_MyRunnable("ThreadB"));
		thread2.start();
		
		System.out.println();
		
		Thread thread3 = new Thread(new _03_MyRunnable("ThreadC"));
		thread3.start();
		
		System.out.println();
	}
}
