package test;

import java.util.Scanner;

public class _02_SwitchCase {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int jumsu = sc.nextInt();

		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();

		char result = ' ';

		switch(jumsu/10){
		case 10:
			switch(jumsu){
				case 100 : result = 'A';
					break;
				default : result = 'W';
					break;
			}
			break;
		case 9: result = 'A';
			break;
		case 8: result = 'B';
			break;
		case 7: result = 'C';
			break;
		case 6: result = 'D';
			break;
		case 5: case 4: case 3: case 2: case 1 : result = 'F';
			break;
		case 0: 
			switch(jumsu) {
			  case 0 : result = 'F';
				  break;
			  default : result = 'W';
				  break;
			}
			break;
		default: result ='W';
			break;
		}
		System.out.println("이름 : " + name + ", 점수 : " + jumsu + ", 학점 : " + result);

		sc.close();
	}
}
