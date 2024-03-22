package Day140322;

import java.util.Scanner;

import Day130321.LinkNode;

public class StudentLinkNode {
	// 변수 선언
	static StudentScoreHasA head;
	static StudentScoreHasA cur;
	static StudentScoreHasA del;
	static StudentScoreHasA newNode;

	// 메인
	public static void main(String[] args) {

		System.out.println("학생성적관리 프로그램입니다.");

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("원하는 메뉴를 선택해주세요");
			System.out.println("1. 학생성적입력 2.학생성적수정 3. 학생성적출력 4. 학생성적삭제 5. 종료");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				newNode = new StudentScoreHasA();
				if (head == null) {
					head = newNode; // 첫 번째 학생의 노드를 head로 설정
					cur = newNode;
				} else {
					cur = head;
					while (cur.next != null) {
						cur = cur.next;
					}
						cur.next = newNode;
				}
				// 정보입력받기
				System.out.println("이름: ");
				newNode.setName(sc.next());
				System.out.println("국어점수"
						+ ": ");
				newNode.setKor(sc.nextInt());
				System.out.println("수학점수: ");
				newNode.setMat(sc.nextInt());
				System.out.println("영어점수: ");
				newNode.setEng(sc.nextInt());
				
				break;

			// 학생성적수정
			case 2:
				cur = head; // 커서 위치를 head로 초기화

				System.out.println("어떤 학생의 성적을 수정하시겠어요?");
				String name = sc.next();

				System.out.println("어떤 과목점수를 수정하시겠어요? 1.국어 2. 수학 3. 영어");
				int subject = sc.nextInt();

				System.out.println("변경할 점수를 입력해주세요");
				int score = sc.nextInt();

				while (cur != null) {
					if (cur.getName().equals(name)) { // 입력받은 학생 이름과 일치하는 경우
						switch (subject) {
						case 1:
							cur.setKor(score); // 국어점수 수정
							break;
						case 2:
							cur.setMat(score); // 수학점수 수정
							break;
						case 3:
							cur.setEng(score); // 영어점수 수정
							break;
						default:
							System.out.println("번호를 확인하고 다시 입력해주세요");
							return;
						}
						System.out.println(name + " 학생의 성적이 수정되었습니다.");
						return;
					} else {
						cur = cur.next; // 다음 노드로 이동
					}
				}
				// 입력받은 학생 이름과 일치하는 학생이 없는 경우
				System.out.println("해당 학생을 찾을 수 없습니다.");
				break;
			// 학생성적출력

			case 3:
				cur = head; // 커서 위치를 head로 초기화
				System.out.println("1. 전체학생 성적조회 2. 특정학생 성적조회");
				int num = sc.nextInt();

				switch (num) {
				case 1:

					cur = head;
					while (cur != null) { // 커서가 null이 아닐때까지 계속 반복
						System.out.println("이름: " + cur.getName());
						System.out.println("국어: " + cur.getKor());
						System.out.println("수학: " + cur.getMat());
						System.out.println("영어: " + cur.getEng());
						cur = cur.next; // 다음 학생으로 이동
					}
					break;
				case 2:
					System.out.println("어떤학생의 성적을 조회할까요?");
					String nameSearch = sc.next();
					boolean found = false; // 반복문을 멈춰줄 수 있도록 찾은 여부를 찾은 변수 선언

					while (cur != null) {
						if (cur.getName().equals(nameSearch)) { // 커서가 받아온 이름이 사용자가 입력한 이름과 일치하면 출력
							System.out.println("이름: " + cur.getName());
							System.out.println("국어: " + cur.getKor());
							System.out.println("수학: " + cur.getMat());
							System.out.println("영어: " + cur.getEng());
							found = true; // 찾았음을 넣어줌
							break;
						}
						cur = cur.next; // 못찾았으면 다음학생으로 이동
					}
					// 학생성적 삭제
				case 4: {
					System.out.println("어떤 학생의 성적을 삭제하시겠어요?");
					String delName = sc.next();
					boolean found2 = false; // 삭제할 학생을 찾았는지 여부를 나타내는 변수

					cur = head; // 커서 위치를 head로 초기화
					while (cur.next != null) {
						if (cur.next.getName().equals(delName)) { // 입력받은 학생 이름과 일치하는 경우
							if (cur == head) { // 삭제할 학생이 맨 처음 노드인 경우
								head = head.next; // head를 다음 노드로 변경하여 첫 번째 학생을 삭제함
							} else {
								del = cur.next;
								cur.next = cur.next.next;
								del.next = null;
								del = null;
								found2 = true; // 학생을 찾았음을 표시
								System.out.println(delName + " 학생의 성적이 삭제되었습니다.");
								break; // 삭제 후 반복문 종료
							}
						}
						cur = cur.next; // 다음 학생으로 이동
					}
					break;
				}
				case 5:
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
				break;
			}
		} while (true);
	}
}