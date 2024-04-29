package ch02;

import java.util.Scanner;

public class _19_DoWhileEx {
	public static void main(String[] args) {
		/*
	       * [ do-while ]
	       * => {} 안의 문장을 무조건 한번 수행한 후에 조건식이 참이면 반복, 거짓이면 빠져나간다.
	       * 
	       * do {
	       *     수행문1;
	       *     ...
	       * } while(조건식);    
	       * 수행문2;
	       */
	      
	      /*
	       * 콘솔에서 입력 => 월 입력[1~12] :
	       * 정상 : ~월입니다.
	       * 잘못입력 : ~월은 잘못된 월입니다. 다시 입력하세요 :
	       */
		
		Scanner sc = new Scanner(System.in);
		
		int mon = 0;
		String text = "월 입력[1~12] : ";
		
		do {
			System.out.print(text);
			mon = sc.nextInt();
			text = mon + "월은 잘못된 월입니다. 다시 입력하세요 :";
		}while(mon > 12 || mon < 1);
		
		System.out.println(mon + "월 입니다.");
		
		sc.close();
		
//      방법1.      
//      Scanner input = new Scanner(System.in);
//         
//      System.out.print("월을 입력하세요: ");
//      int month = input.nextInt();
//      
//      do {
//         if(month < 1 || month > 12) {
//            System.out.print("잘못입력: " + month + "월은 잘못된 월입니다. 다시입력하세요: ");
//            month = input.nextInt();
//         }
//      } while(month < 1 || month > 12);
//      
//      System.out.println("정상: " + month + "월 입니다.");
   
      
      // 방법2.
//      Scanner sc = new Scanner(System.in);
//         
//         int month = 0;
//         System.out.print("월을 입력해 주세요 : ");
//            
//         do {
//            month = sc.nextInt();
//            if(month >= 1 && month <= 12) {
//               continue;
//            }
//            System.out.println("잘못입력하였습니다. 월을 다시 입력해 주세요. :");
//            
//         } while(month <=0 || month >= 13);
//         System.out.println("입력하신 월은 :"+month+"월 입니다.");
		
	      // 방법2.
//      Scanner sc = new Scanner(System.in);
//         
//         int month = 0;
//         System.out.print("월을 입력해 주세요 : ");
//            
//         do {
//            month = sc.nextInt();
//            if(month >= 1 && month <= 12) {break;};
//            System.out.println("잘못입력하였습니다. 월을 다시 입력해 주세요. :");    
//         } while(true);
//		
//         System.out.println("입력하신 월은 :"+month+"월 입니다.");
	}
}
