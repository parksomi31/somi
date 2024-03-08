package Day4;

import java.util.Scanner;

public class Allstudent {

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
