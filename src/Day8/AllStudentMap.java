package Day8;

import java.util.HashSet;
import java.util.Scanner;


public class AllStudentMap {
	
	private int index;
	private StudentScoreHasA[] stu ;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명의 성적을 확인할까요? : ");
		int num = sc.nextInt();

		StudentScoreHasA[] stu = new StudentScoreHasA[num];

		for (int i = 0; i < num; i++) {
			stu[i] = new StudentScoreHasA();
		}
		;
		for (int i = 0; i < num; i++) {
	
			System.out.println("이름 : ");
			stu[i].setName(sc.next());
			System.out.println("kor : ");
			stu[i].setKor(sc.nextInt());
			System.out.println("mat : ");
			stu[i].setMat(sc.nextInt());
			System.out.println("eng : ");
			stu[i].setEng(sc.nextInt());
		}

		for (int i = 0; i < num; i++) {
			System.out.println(stu[i].getName());
			System.out.println(stu[i].getKor());
			
			System.out.println(stu[i].getMat());
			System.out.println(stu[i].getEng());
			System.out.println(stu[i].getTotal());
			System.out.println(stu[i].getAvg());
		}
	}
}



for (Day4.StudentScoreHasA a : stu) {
	System.out.println(a.getName() + "의 국어 점수는: " + a.getKor() + "수학 점수는: " + a.getMat()	+ "영어 점수는 : " + a.getEng() + "이며");
	System.out.println(a.getName() + "의 총 점수는: " + a.getTotal() + "," + "평균 점수는: " + a.getAvg() + "입니다");
	
