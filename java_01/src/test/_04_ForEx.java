package test;

public class _04_ForEx{
	public static void main(String[] args){
			
		System.out.println("****************");
		System.out.println("*** 구구단 출력 ***");
		System.out.println("****************");

		for(int dan = 2; dan <=9; dan++){
			System.out.println("=== " + dan + "단 ===");
			for(int num = 1; num <=9; num++){
				System.out.println(dan + " * " + num + " = " + (dan * num++));
			}
		}
		System.out.println("==========");
	}
}