package Day140322;

import java.util.Scanner;

public class AllStudentFinal {

	static StudentScoreHasA head;
	static StudentScoreHasA cur;
	static StudentScoreHasA del;
	static StudentScoreHasA newNode;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean yn = true; // 반복문 종료해주기 위해서 변수선언

		System.out.println("학생성적 관리 프로그램입니다.");
		System.out.println("======================");

		while (yn) {// yn의 변수가 true인 동안 반복을 할건데
			System.out.println("원하는 메뉴를 선택해주세요 1. 학생성적입력 2. 학생성적수정 3. 학생정보삭제 4. 학생정보조회  5.종료");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				inputScore(); // 인풋함수 불러올거임
				break;
			case 2:
				modiSocre(); // 수정함수 불러올거임
				break;
			case 3:
				delScore(); // 삭제함수 불러올거임
				break;
			case 4:
				printScore();// 조회함수 불러올거임
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				yn = false; // 종료하겠다고 했으니까 yn변수를 false로 바꿔서 더이상 반복하지 않도록 해줄게
				break;
			}
		}
	}

	// 점수입력함수
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		newNode = new StudentScoreHasA();
		// 정보입력받기
		System.out.println("이름: ");
		newNode.setName(sc.next());
		System.out.println("국어점수" + ": ");
		newNode.setKor(sc.nextInt());
		System.out.println("수학점수: ");
		newNode.setMat(sc.nextInt());
		System.out.println("영어점수: ");
		newNode.setEng(sc.nextInt());
		if (head == null) { // 첫번째로 데이터를 입력하는 경우
			head = newNode; // 첫 번째 학생의 노드를 head로 설정
			cur = newNode; // 커서도 뉴도드로 초기화
		} else {
			StudentScoreHasA pre = null;
			cur = head; // 커서를 헤드로 초기화
			// 새로운 노드의 평균 점수가 현재 노드의 평균 점수보다 높을 때까지 반복
			while (cur != null && cur.getAvg() >= newNode.getAvg()) { // 부등호의 방향을 변경
				pre = cur;
				cur = cur.next;
			}

			// 이 부분에서 새로운 노드를 중간에 삽입
			if (cur == null) { // 새로운 노드가 맨 앞에 삽입되어야 하는 경우
				pre.next = newNode; // 새로운 노드를 head로 연결
			} else if (head.getAvg() < newNode.getAvg()) { // cur == head
				newNode.next = head;
				head = newNode;
			} else {
				// 중간에 삽입되는 경우
				newNode.next = cur; // 새로운 노드의 next를 현재 노드(cur)로 지정
				pre.next = newNode; // 이전 노드(pre)의 next를 새로운 노드로 지정하여 새로운 노드를 삽입
			}
		}

	}

	// 정보수정함수
	public static void modiSocre() {
		Scanner sc = new Scanner(System.in);
		cur = head; // 커서 위치를 head로 초기화

		System.out.println("어떤 학생의 성적을 수정하시겠어요?");
		String name = sc.next();

		System.out.println("어떤 과목점수를 수정하시겠어요? 1.국어 2. 수학 3. 영어");
		int subject = sc.nextInt();

		System.out.println("변경할 점수를 입력해주세요");
		int score = sc.nextInt();

		StudentScoreHasA modi = null;

		while (cur != null) { // 커서가 null이 아닐 때까지 반복할건데
			if (cur.getName().equals(name)) { // 입력받은 학생 이름과 일치하는 경우
				modi = cur; // modi변수에다가 해당 학생의 정보를 저장
				break; // 찾았으니까 멈춤
			} else { // 못찾으면 찾을 때 까지 커서를 다음으로 넘기면서 찾음
				cur = cur.next;
			}
		}
		if (modi != null) { // 수정할 학생을 찾은 경우
			switch (subject) { // 사용자에게 입력받은 변수를 통해서
			case 1:
				modi.setKor(score); // 국어점수 수정
				break;
			case 2:
				modi.setMat(score); // 수학점수 수정
				break;
			case 3:
				modi.setEng(score); // 영어점수 수정
				break;
			default: // 번호를 잘못 입력한 경우
				System.out.println("번호를 확인하고 다시 입력해주세요");
				return; // 메서드 호출한 곳으로 돌아감
			}
			System.out.println(name + " 학생의 성적이 수정되었습니다.");

			// 새로운 노드를 정렬하여 삽입
			if (head == modi) { // 수정된 노드가 head인 경우
				return; // 이미 맨 앞에 위치하고 있으므로 추가 작업 필요 없음
			}

			// 수정된 노드를 연결 리스트에서 제거
			StudentScoreHasA pre = head;
			while (pre.next != modi) { // 수정된 노드의 이전 노드를 찾음
				pre = pre.next;
			}
			pre.next = modi.next; // 수정된 노드의 이전 노드의 다음을 수정된 노드의 다음으로 설정하여 제거

			// 수정된 노드를 정렬하여 다시 삽입
			cur = head;
			pre = null;
			while (cur != null && cur.getAvg() >= modi.getAvg()) { // 새로운 노드의 평균 점수가 현재 노드의 평균 점수보다 높을 때까지 반복
				pre = cur; // pre에 현재 노드를 저장
				cur = cur.next; // 다음 노드로 이동
			}
			
			if (pre == null) { // 수정된 노드가 가장 작은 평균 점수를 가진 노드인 경우
				modi.next = head; // 수정된 노드를 head로 설정하여 맨 앞에 삽입
				head = modi; // head를 수정된 노드로 업데이트
			} else { // 수정된 노드가 가장 작은 평균 점수를 가진 노드가 아닌 경우
				modi.next = pre.next; // 수정된 노드의 다음을 pre의 다음으로 설정하여 삽입
				pre.next = modi; // pre의 다음을 수정된 노드로 설정하여 삽입
			}
		} else {
			System.out.println("해당 학생을 찾을 수 없습니다.");
		}
	}

	// 정보삭제함수

	public static void delScore() {
		Scanner sc = new Scanner(System.in);
		cur = head; // 커서위치를 헤드로 초기화

		System.out.println("어떤 학생의 점수를 삭제하시겠어요?");
		String name = sc.next();
		boolean found = false; // 삭제할 학생을 찾았는지 여부를 나타내는 변수

		while (cur.next != null) { // 커서의 다음이 null이 아닐때까지 반복하면서 (마지막 노드까지 반복)
			if (cur.next.getName().equals(name)) { // 커서의 다음노드에 있는 이름이 입력받은 학생 이름과 일치하는 경우
				if (cur == head) { // 삭제할 학생이 맨 처음 노드인 경우
					head = head.next; // head를 다음 노드로 변경하여 첫 번째 학생을 삭제함
				} else {
					del = cur.next; // del은 내가 삭제할 노드를 가르키는 임시변수야, 즉 내가 찾은 커서의 다음노드지
					cur.next = cur.next.next; // del을 삭제하고 싶으니까 지금커서가 가르키는 다음노드를 그 다음노드로 연결해서 del은 연결이 끊기도록함
					del.next = null; // del노드는 내가 지울거니까 그거의 next는 null을 줘버려
					del = null; // 삭제할 노드를 가르키던 del변수도 null을줘서 없애버려
					found = true; // 일치하는 학생을 찾았으니까 true로 변경하면 반복이 종료됨
					System.out.println(name + " 학생의 성적이 삭제되었습니다.");
					break; // 삭제 후 반복문 종료
				}
			}
		}
	}

	// 학생성적 조회함수
	public static void printScore() {
		Scanner sc = new Scanner(System.in);
		cur = head; // 커서 위치를 head로 초기화
		System.out.println("1. 전체학생 성적조회 2. 특정학생 성적조회");
		int num = sc.nextInt(); // 사용자한테 입력받은 내용 저장할 변수

		switch (num) { // 입력받은 값에 따라서
		case 1: // 1번 누른경우에는
			cur = head; // 커서 위치를 head로 초기화
			while (cur != null) { // 커서가 null이 아닐때까지 계속 반복하면서 출력
				System.out.print("이름: " + cur.getName() + " " + "|" + "평균" + cur.getAvg() + " " + "|" + "국어: "
						+ cur.getKor() + " " + "|" + "수학: " + cur.getMat() + " " + "|" + "영어: " + cur.getEng());
				System.out.println();
				cur = cur.next; // 다음 학생으로 이동
			}
			break;
		case 2: // 2번 누른경우에는
			System.out.println("어떤학생의 성적을 조회할까요?");
			String nameSearch = sc.next();
			boolean found = true; // 반복문을 멈춰줄 수 있도록 찾은 여부를 찾은 변수 선언

			while (cur != null) {
				if (cur.getName().equals(nameSearch)) { // 커서가 있는 노드의 이름이 사용자가 입력한 이름과 일치하면 출력
					System.out.print("이름: " + cur.getName() + " " + "|" + "평균" + cur.getAvg() + " " + "|" + "국어: "
							+ cur.getKor() + " " + "|" + "수학: " + cur.getMat() + " " + "|" + "영어: " + cur.getEng());
					System.out.println();
					found = false; // 찾았으니까 true로 바꿔줘서 더 반복하지 않도록해줌
					break; // 탈출
				}
			}
		}

	}
}