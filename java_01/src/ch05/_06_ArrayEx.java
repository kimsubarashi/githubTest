package ch05;

public class _06_ArrayEx {
	public static void main(String[] args) {
		
		// 배열 선언과 초기화
		// 1차원 배열
		int[] arr1 = {1,2,3}; // 1차원 배열
		
		// 배열 출력 - 배열의 길이
		System.out.println("-------------------");
		for(int arr : arr1) {
			System.out.println(arr);
		}
		System.out.println("-------------------");
		// 2차원 배열
		int[][] arr2 = {{1,2,3},{4,5,6}}; // 2차원 배열 - 행열, 2행 3열
		
		// 배열 출력
		for(int i = 0; i < arr2.length; i++) { // 행 - 배열.length => 2회반복
			for(int j = 0; j < arr2[i].length; j++) {	// 열 - 행.length => 3회반복
				// 출력 : 배열명[행][열]
				System.out.println(arr2[i][j]);
				// 0행일 때 0열 1열 2열 => [0][0] [0][1] [0][2]
				// 1행일 때 0열 1열 2열 => [1][0] [1][1] [1][2]
			}
			System.out.println(); // 행이 바뀔때마다 빈줄
		}
		System.out.println("-------------------");
		for(int[] i : arr2) {
			for(int j : i) {
				System.out.println(j);
			}
			System.out.println(); // 행이 바뀔때마다 빈줄
		}
	}
}
