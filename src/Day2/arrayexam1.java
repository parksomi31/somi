/*
 * 한사람의 성적처리 프로그램
 * *입력: 이름, 국어, 영어, 수학
 * *연산: 총점,평균
 * *출력: 이름, 국, 영, 수, 총, 평균
 */
package Day2;

import java.util.Scanner;

public class arrayexam1 {

	public static void main (String[] args)  {
		
		// string name; // 변수선언(이름)
		int score[] = new int[4]; // 변수 선언(국,영,수,총)
		float avg;
		int total = 
		
		Scanner sc = new Scanner(System.in); //키보드에 글자 입력을 받기 위해 사용되는 클래스
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		for(int i=0;i<score.length;i++) {
			System.out.println("국어, 영어, 수학 점수를 입력하세요") ;
			score[i]=sc.nextInt();
		}

	}
}
