package Day130321;

import java.util.Scanner;

public class LinkedExam {

	static LinkNode head;
	static LinkNode cur;
	static LinkNode newNode;
	static LinkNode del;

	public static void main(String[] args) {

		head = cur = newNode = new LinkNode(); // LinkNode의 객체를 참조할 수 있는 변수를 3개 선언 (초기화)
		newNode.next = null; // 뉴노드의 next를 null로 초기화

		newNode.setData(1); // newNode에다가 data에 1을 넣어

		newNode.next = new LinkNode(); // 뉴노드의 넥스트에다가 새로운 링크도드 객체를 참조할수있는 참조값을 넣음
		newNode.next.setData(2); // 뉴노드의 넥스트가 참조하고 있는 뉴노드 객체에다가 데이터 2를 넣어
		newNode.next.next = null; // 뉴노드의 넥스트

		newNode.next.next = new LinkNode();
		newNode.next.next.setData(3);
		newNode.next.next.next = null;

		newNode.next.next.next = new LinkNode();
		newNode.next.next.next.setData(4);
		newNode.next.next.next.next = null;

		newNode = new LinkNode();
		newNode.next = head;
		head = newNode;

		newNode.setData(5);

		cur = head;
		// 출력
		while (cur != null) {
			System.out.print(cur.getData() + ",");
			cur = cur.next;
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("몇번째에 삽입할까요? ");
		int num = sc.nextInt();
		// 몇번째 추가할거야?
		// 데이터삽입.
		newNode = new LinkNode();
		newNode.setData(6);

		if (num == 1) { // 맨 처음에 삽입할거면
			newNode.next = head; // 새로만든 객체의 next에다가 기존 head를 연결
			head = newNode; // head변수에 새로만든 뉴노드를 연결해줌
		} else { // 맨 처음 삽입할 게 아니라면
			cur = head; // 커서 위치가 현재 어딨는 지 모르니까 head의 위치로 초기화
			for (int i = 0; i < num - 2; i++) { // 그리고 for문을 돌려서 커서를 둘 위치를 찾는 것
				cur = cur.next;
			}
			newNode.next = cur.next;
			cur.next = newNode;
		}
		cur = head;
		// 출력
		while (cur != null) {
			System.out.print(cur.getData() + ",");
			cur = cur.next;
		}
		// 삭제
		System.out.println("몇번째를 삭제할까요? ");
		int num2 = sc.nextInt();

		if (num == 1) {
			del = head;
			head = head.next;
		} else {
			cur = head;

			for (int i = 0; i < num - 2; i++) {
				cur = cur.next;
			}
			del = cur.next;
			cur.next = del.next;
		}
		del.next = null;
		del = null;
		cur = head;
		// 출력
		while (cur != null) {
			System.out.print(cur.getData() + ",");
			cur = cur.next;
		}
	}
}