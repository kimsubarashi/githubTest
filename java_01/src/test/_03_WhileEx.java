package test;

public class _03_WhileEx{
	public static void main(String[] args){
	
		int dan = 2;
		int num = 1;
	
		System.out.println("****************");
		System.out.println("*** 구구단 출력 ***");
		System.out.println("****************");

		while(dan <= 9){
			num = 1;
			System.out.println("=== " + dan + "단 ===");
			while(num <= 9){
				System.out.println(dan + " * " + num + " = " + (dan * num++));
			}
			dan++;
		}
		System.out.println("==========");
	}
}
