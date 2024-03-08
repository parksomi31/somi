/*
	 * 세사람의 성적처리 프로그램
	 * *입력: 이름, 국어, 영어, 수학
	 * *연산: 총점,평균
	 * *출력: 이름, 국, 영, 수, 총, 평균
	 */
package Day2;


import java.util.Scanner;

public class arrayexam2 {

	public static void main(String[] args) {

		String[] name = new String[3]; // 이름
		int[][] score = new int[3][4]; // 국,영,수,총
		float[] avg = new float[3]; // 평균

		Scanner sc = new Scanner(System.in); //키보드에 글자 입력을 받기 위해 사용되는 클래스

		for (int i = 0; i < 3; i++) {

			System.out.println("이름/국어/영어/수학 순으로 입력하세요.");
			name[i] = sc.next(); // 이름 입력

			for (int j = 0; j < 3; j++) { // i학생의 점수 입력
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j]; // i학생의 점수 총합
			avg[i] = score[i][3] / 3.f; // 3. 은 double로 하겠다. .f를 붙이면 float로
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(name[i] + "\t"); // 학생 이름 호출
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t"); // 학생 점수 호출
			}
			System.out.print(avg[i]); // 평균점수 호출
			System.out.println();
		}
	}
}
}