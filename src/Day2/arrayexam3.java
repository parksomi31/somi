/*
	 * 학생 수 정의 
	 * *입력: 이름, 국어, 영어, 수학
	 * *연산: 총점,평균
	 * *출력: 이름, 국, 영, 수, 총, 평균
	 */
package Day2;


import java.util.Scanner;

public class arrayexam3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();

		// 변수 선언
		String[] name = new String[num]; // 학생 이름 변수
		int[][] score = new int[num][4]; // 학생 점수 변수
		float[] avg = new float[num]; // 평균

		// 입력
		System.out.println("이름/국어/영어/수학 순으로 입력하세요.");
		for (int i = 0; i < num; i++) {
			name[i] = sc.next(); // 이름입력
			for (int j = 0; j < 3; j++) { // i학생의 점수
				score[i][j] = sc.nextInt(); // i번째 학생 성적 입력
				score[i][3] += score[i][j]; // i학생 성적의 총합
			}
			avg[i] = score[i][3] / 3.f; // i번째 학생의 평균 산출

		}
		// 출력
		for (int i = 0; i < num; i++) {
			System.out.println(name[i]);
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j]+ "\t"); // i번째 학생 그다음학생...점수출력
			}
			System.out.print(avg[i]); //평균 점수 호출
			System.out.println();
		}
	}
}