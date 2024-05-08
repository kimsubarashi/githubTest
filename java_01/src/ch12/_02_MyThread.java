package ch12;

//Runnable 인터페이스를 구현하기 - run() 메서드를 override
public class _02_MyThread implements Runnable{
		
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <= 10; i++) {
			System.out.print(i+" ");
		}
	}
}
