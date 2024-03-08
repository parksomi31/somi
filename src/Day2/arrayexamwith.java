/*
	 * 한사람의 성적처리 프로그램
	 * *입력: 이름, 국어, 영어, 수학
	 * *연산: 총점,평균
	 * *출력: 이름, 국, 영, 수, 총, 평균
	 */
package Day2;

import java.util.Scanner;

public class arrayexamwith {
		
		public static void main (String[] args)  {
			
			//string name; // 변수선언(이름)
			int []score = new int[4]; // 변수 선언(국,영,수,총)
			float avg;
			
			Scanner sc = new Scanner(System.in); //키보드에 글자 입력을 받기 위해 사용되는 클래스
			
			//입력 
			System.out.println("이름을 입력하세요");
			String name = sc.next();
			
			for(int i=0;i<score.length-1;i++) {
				System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요") ;
				score[i]=sc.nextInt();
				
				score[3] += score[i];
			}
			//연산
			avg = score[3]/3.f;  //3. 은 double로 하겠다. .f를 붙이면 float로
			
			//출력
			System.out.println(name+"\t");
			for(int sco:score) {
				System.out.print(sco+"\t");
			}
			System.out.println(avg);
		}
	} 
