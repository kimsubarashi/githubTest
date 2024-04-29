package test;

import java.util.Scanner;

public class _05_MyInfoMain {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//방법1.setter로 값 전달 => showInfo()로 출력
		_05_MyInfo myInfo = new _05_MyInfo();

		System.out.print("이름을 입력해주세요. : ");
		myInfo.setName(sc.next());

		System.out.print("생일을 입력해주세요. : ");
		myInfo.setBirthday(sc.next());

		System.out.print("월급을 입력해주세요. : ");
		myInfo.setMoney(sc.nextInt());
	
		System.out.print("주소를 입력해주세요. : ");
		myInfo.setAddress(sc.next());
		
		myInfo.showInfo();
		
		sc.close();
		
		System.out.println("================");
		//방법2.setter로 값 전달 -> getter로 출력
		_05_MyInfo yourInfo = new _05_MyInfo();
		
		yourInfo.setName("김신영");
		yourInfo.setBirthday("900101");
		yourInfo.setMoney(100000);
		yourInfo.setAddress("서울시 강남구");
				
		System.out.println("이름 : " + yourInfo.getName());
		System.out.println("생일 : " + yourInfo.getBirthday());
		System.out.println("월급 : " + yourInfo.getMoney());
		System.out.println("주소 : " + yourInfo.getAddress());
	}
}
