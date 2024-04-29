package ch05;

public class _07_ArrayEx {
	public static void main(String[] args) {
		/*
	     *                      *** 성적표 ***
	     * =========================================
	     * 번호    국어   영어     수학     총점  평균 학점
	     * =========================================
	     *  1    100   100    100     300  100  A
	     *  2     90    90     90     270   90  A
	     *  3     70    70     70     210   70  C
	     *  4     70    100   100     300  100  A
	     *  5     60    100    78     238   79  B         
	     *  ========================================
	     * 과목합계  390  460  460   
	     *  
	     *  평균 : 소수점 이하 둘째자리
	     *  2차원배열명 => scores  국,영,수 점수는 주어진 값
	     *  총점(sum), 평균(avg), 학점, 과목합계(korTot, engTot, mathTot)는 직접계산
	     *  
	     *  100점, 총점 270점 !                    
	   */
		int sum = 0;
		double avg = 0;
		char grade = 0;
		int korTot = 0;
		int engTot = 0;
		int mathTot = 0;
		int[][] scores = {{100,100,100},
							{90,90,90},
							{70,70,70},
							{70,100,100},
							{60,100,70}};
		
		System.out.println("\t\t*** 성적표 ***");
		System.out.println("===================================================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("===================================================");
		for(int i = 0; i<scores.length; i++) {
			sum = 0;
			avg = 0;
			grade =' ';
			System.out.print((i+1) + "\t");
			for(int j = 0; j<scores[i].length;j++) {
				sum += scores[i][j];
				System.out.printf("%d" + "\t",scores[i][j]);
			}
			avg = sum/scores[i].length;
			grade = gradeOut(avg);
			korTot += scores[i][0];
			engTot += scores[i][1];
			mathTot += scores[i][2];
			System.out.printf("%d" + "\t",sum);
			System.out.printf("%6.2f" + "\t",avg);
			System.out.printf("%c" + "\t\n",grade);
		}
		System.out.println("===================================================");
		System.out.printf("과목합계 : " + "%d" + "\t" + "%d" + "\t" + "%d" + "\t",korTot,engTot,mathTot);
		
	}
	
	public static char gradeOut(double avg) {
		if(avg < 0 || avg > 100) {
			return 'W';
		}else {
			if(avg >= 90) {
				return 'A';
			} else if(avg >= 80) {
				return 'B';
			} else if(avg >= 70) {
				return 'C';
			} else if(avg >= 60) {
				return 'D';
			} else {
				return 'F';
			}
		}
	}
}
