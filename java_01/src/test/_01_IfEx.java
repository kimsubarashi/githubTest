package test;

import java.util.Scanner;

public class _01_IfEx {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("점수를 입력해주세요 : ");
		int jumsu = sc.nextInt();

		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();

		char result = ' ';
		
		if( (jumsu > 100) || (jumsu < 0)) {
			result = 'W';
		} else {
			if(jumsu >= 90){
				result = 'A';
			} else if (jumsu >= 80){
				result = 'B';
			} else if (jumsu >= 70){
				result = 'C';
			} else if (jumsu >= 60){
				result = 'D';
			} else {
				result = 'F';
			} 
		}
		System.out.println("이름 : " + name + ", 점수 : " + jumsu + ", 학점 : " + result);
		
		sc.close();
	}
} 