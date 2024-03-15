package Day6;

import java.util.Scanner;

abstract class Memory1 {

	int arr[] = new int[5];
	int top = 0;

	public void push(int a) {
		if (top > 4) {
			System.out.println("더 이상 입력할"
					+ " 수 없습니다");
			
//			System.exit(0);
		} else if (top==4) {
			arr[top++] = a;
			System.out.println("앞으로는 값을 입력할 수 없습니다");
		} else {
			arr[top++] = a;
		}
	}

	public abstract void pop();
}


class MyStack1 extends Memory1 {

	public void pop() {
		if (top == 0) {
			System.out.println("더이상 출력할 것이 없습니다");
////			System.exit(0);
//			return -1;
		} else {
			System.out.println(arr[--top]);
		}

	}
}
class MyQueue1 extends Memory1 {

	private int front;

	public void pop() {
		if (front == 4) {
			System.out.println("더이상 출력할 것이 없습니다");
//			System.exit(0);
		} else {
			System.out.println(arr[front++]);

		}
}
}
public class Memoryexam2 {

	public static void main(String[] args) {

		MyStack1 stack = new MyStack1(); // MySatck1 클래스를 이용하기 위해 객체 생성
		MyQueue1 queue = new MyQueue1(); // MyQueue1 클래스를 이용하기 위해 객체 생성
		Memory1 m = null; // 동적바인딩을 하기위하여 객체 생성...근데 왜 null을 해주라고 하는거지..?

		Scanner sc = new Scanner(System.in);

		System.out.print("어디에서 작업하시겠어요? 1.Stack 2.Queue");
		int num = sc.nextInt();

		if (num == 1) { // 스택을 선택하면
			m = stack; // 동적바인딩을 통해 stack으로 접근하여 사용
		} else if (num == 2) { // 큐를 선택하면
			m = queue; // 동적바인딩을 통해 queue로 접근하여 사용
		} else {
			System.out.println("종료합니다"); // 둘다 아니면 프로그램 종료
		}

		do {

			while (true) { // 스택을 선택 후 들어오면 수행할 작업
				System.out.print("어떤 작업을 수행하시겠어요? 1.입력 2.출력");

				int n = sc.nextInt();
				

				if (n == 1) {
					System.out.println("넣을 숫자를 입력하세요");
					m.push(sc.nextInt());

				} else if (n == 2) {
					m.pop();

				} else {

					System.out.println("종료합니다");
					break;
				}
			}
		} while (true);
	}
}


//				} else if(num == 2) {
//				
//				while(true) {
//					System.out.print("어떤 작업을 수행하시겠어요? 1.입력 2.출력");
//					
//					int n = sc.nextInt();
//					
//					if(n == 1) {
//						queue.push(sc.nextInt());
//						
//					}else if(n == 2) {
//						System.out.println(queue.pop());
//						
//					}else 
//						System.out.println("종료합니다");
//					break;
//				}
//			}else 
//				System.out.println("종료합니다");
//		
