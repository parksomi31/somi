package Day8;

import java.util.HashMap;
import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> stu = new HashMap<Integer, String>();

        System.out.println("점수입력 및 조회프로그램을 시작합니다");
        System.out.println("메뉴를 선택해주세요 1.점수입력 2.점수수정 3.종료");
        int a = sc.nextInt();

        while (a != 3) {
            switch (a) {
                case 1: 
                    inputScores(sc, stu);
                    break;
                case 2:
                    modifyScores(sc, stu);
                    break;
                default:
                    System.out.println("번호를 잘못 선택하였습니다.");
            }

            // 점수 입력 또는 수정 후 학생 정보 조회
            System.out.println("입력한 학생의 정보와 점수입니다:");
            for (StudentScoreHasA student : stu) {
                System.out.println("이름: " + student.getName());
                System.out.println("국어점수: " + student.getKor());
                System.out.println("수학점수: " + student.getMat());
                System.out.println("영어점수: " + student.getEng());
                System.out.println("총점: " + student.getTotal());
                System.out.println("평균: " + student.getAvg());
                System.out.println();
            }

            System.out.println("메뉴를 선택해주세요 1.점수입력 2.점수수정 3.종료");
            a = sc.nextInt();
        }

        System.out.println("프로그램을 종료합니다");
        sc.close();
    }

    private static void inputScores(Scanner sc, HashMap<StudentScoreHasA> stu) {
        int a = 1;
        while (a == 1) {
            StudentScoreHasA stu1 = new StudentScoreHasA();

            System.out.println("이름 : ");
            stu1.setName(sc.next());
            System.out.println("국어점수 : ");
            stu1.setKor(sc.nextInt());

            System.out.println("수학점수: ");
            stu1.setMat(sc.nextInt());
            System.out.println("영어점수: ");
            stu1.setEng(sc.nextInt());

            stu.add(stu1);

            System.out.println("학생정보를 계속입력하시겠습니까? 1. 예 2. 아니오");
            a = sc.nextInt();
        }
    }

    private static void modifyScores(Scanner sc, HashMap<StudentScoreHasA> stu) {
        System.out.println("누구의 점수를 수정할까요? 이름: ");
        String name = sc.next();

        boolean found = false;

        for (StudentScoreHasA student : stu) {
            if (student.getName().equals(name)) {
                found = true;

                System.out.println("어떤 과목의 점수을 수정하시겠어요?");
                System.out.println("1. 국어 2. 수학 3. 영어");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("새로운 국어점수를 입력해주세요: ");
                        int newKor = sc.nextInt();
                        student.setKor(newKor);
                        break;
                    case 2:
                        System.out.println("새로운 수학점수를 입력해주세요: ");
                        int newMat = sc.nextInt();
                        student.setMat(newMat);
                        break;
                    case 3:
                        System.out.println("새로운 영어점수를 입력해주세요: ");
                        int newEng = sc.nextInt();
                        student.setEng(newEng);
                        break;
                    default:
                        System.out.println("잘못 선택하셨습니다. 번호를 확인하고 다시 입력해주세요");
                }
                System.out.println("점수수정이 완료되었습니다");
            }
        }
        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }
}