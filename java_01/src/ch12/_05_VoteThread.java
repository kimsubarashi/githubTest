package ch12;

import java.util.Random;

// 지역별 투표 현황
public class _05_VoteThread implements Runnable{
	int sum = 0; // 총투표율
	int targetNum = 100;	// 개표율 100%
	Random random = new Random(); // 개표율 속도
	
	@Override
	public void run() {
		StringBuffer sb = new StringBuffer(); // *모양의 그래프를 출력하기 위함 => 개표율을 *의 갯수로 출력
		while(true) {
			sum += random.nextInt(10); //총개표율 : 10까지의 난수발생숫자를 누적
			sb.delete(0, sb.length()); //그래프를 0으로 초기화, *의 길이만큼
			
			if(sum > targetNum) {
				sum = 100;
				for(int i=0; i<sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + sb);
				break;
			} else {
				for(int i=0; i<sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + sb);
			}
			
			try {
				Thread.sleep(500); //1000 : 1초 => cup의 시간을 다른 스레드에게 넘겨주는 효율적인 방법
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
		
	}
}
