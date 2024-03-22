package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class AllStudentArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<StudentScoreHasA> stu = new ArrayList<StudentScoreHasA>();

		System.out.println("성적입력 및 조회프로그램을 시작합니다");
		System.out.println("메뉴를 선택해주세요 1.성적입력 2.종료");
		int a = sc.nextInt();

		if (a == 1) {
			StudentScoreHasA stu1 = new StudentScoreHasA();
			while (a == 1) {

				System.out.println("이름 : ");
				stu1.setName(sc.next());
				System.out.println("kor : ");
				stu1.setKor(sc.nextInt());
				System.out.println("mat : ");
				stu1.setMat(sc.nextInt());
				System.out.println("eng : ");
				stu1.setEng(sc.nextInt());

				stu.add(stu1);

				System.out.println("다시 메뉴를 선택해주세요 1.성적입력 2.종료");
				a = sc.nextInt();

			}

			for (int i = 0; i < stu.size(); i++) {
				System.out.println("당신의 이름은: " + stu.get(i).getName() + "입니다.");
				System.out.println("당신의 국어성적은: " + stu.get(i).getKor() + "입니다.");
				System.out.println("당신의 수학성적은: " + stu.get(i).getMat() + "입니다.");
				System.out.println("당신의 영어성적은: " + stu.get(i).getEng() + "입니다.");
				System.out.println("당신의 총성적은: " + stu.get(i).getTotal() + "입니다.");
				System.out.println("당신의 평균성적은: " + stu.get(i).getAvg() + "입니다.");
			}

		} else {
			System.out.println("프로그램을 종료합니다");
		}
	}
}
