package ch03;

import java.util.Scanner;

public class _03_MyInfoMain {
	public static void main(String[] args){
		/*
		 * 참조변수 : 생성된 클래스의 힙메모리 주소값이 들어있다.
		 * 멤버변수, 멤버메서드 접근
		 */
		String name;
		String birthday;
		int money;
		String address;
		
		Scanner sc = new Scanner(System.in);

		_03_MyInfo myInfo = new _03_MyInfo();
	
		System.out.print("이름을 입력해주세요. : ");
		name = sc.next();
		
		System.out.print("생일을 입력해주세요. : ");
		birthday =sc.next();
		
		System.out.print("월급을 입력해주세요. : ");
		money = sc.nextInt();
		
		System.out.print("주소를 입력해주세요. : ");
		address = sc.next();
		
		// 방법1. setter로 값 전달 -> showInfo()로 출력
		myInfo.setName(name);
		myInfo.setBirthday(birthday);
		myInfo.setMoney(money);
		myInfo.setAddress(address);
		
		myInfo.showInfo();
		
		System.out.println("================");
		// 방법2. setter로 값 전달 -> getter로 출격
		_03_MyInfo yourInfo = new _03_MyInfo();
		
		yourInfo.setName("김신영");
		yourInfo.setBirthday("900101");
		yourInfo.setMoney(100000);
		yourInfo.setAddress("서울시 강남구");
				
		System.out.println("이름 : " + yourInfo.getName());
		System.out.println("생일 : " + yourInfo.getBirthday());
		System.out.println("월급 : " + yourInfo.getMoney());
		System.out.println("주소 : " + yourInfo.getAddress());
		
		// 매개변수 생성자 호출
		_03_MyInfo myInfo2 = new _03_MyInfo(name, birthday, money, address);
		
		// 방법1. setter로 값 전달 -> showInfo()로 출력
		myInfo2.showInfo();
		
		// 방법2. setter로 값 전달 -> getter로 출격
		System.out.println("이름 : " + myInfo2.getName());
		System.out.println("생일 : " + myInfo2.getBirthday());
		System.out.println("월급 : " + myInfo2.getMoney());
		System.out.println("주소 : " + myInfo2.getAddress());
		
		sc.close();
	}
}
