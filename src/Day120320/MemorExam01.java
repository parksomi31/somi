package Day120320;

import java.util.*;

abstract class Memory {

	int arr[] = new int[5];
	int top = 0;

	public void push(int a) {
		arr[top++] = a;
	}
	public abstract int pop();
}
class MyStack extends Memory {

	public int pop() {
		return arr[--top];
	}
}
class MyQueue extends Memory {

	private int front;
	public int pop() {
		return arr[front++];
	}
}

public class MemorExam01 {
	public static void main(String[] args) {

		MyStack stack = new MyStack();
		MyQueue queue = new MyQueue();

		Scanner sc = new Scanner(System.in);

		System.out.print("어디에서 작업하시겠어요? 1.Stack 2.Queue");
		int num = sc.nextInt();
		do {
			if (num == 1) {

				while (true) {
					System.out.print("어떤 작업을 수행하시겠어요? 1.입력 2.출력");

					int n = sc.nextInt();

					if (n == 1) {
						System.out.println("넣을 숫자를 입력하세요");
						stack.push(sc.nextInt());

					} else if (n == 2) {
						System.out.println(stack.pop());
					} else
						System.out.println("종료합니다");
					break;
				}
			} else if (num == 2) {

				while (true) {
					System.out.print("어떤 작업을 수행하시겠어요? 1.입력 2.출력");

					int n = sc.nextInt();

					if (n == 1) {
						queue.push(sc.nextInt());

					} else if (n == 2) {
						System.out.println(queue.pop());

					} else
						System.out.println("종료합니다");
					break;
				}
			} else
				System.out.println("종료합니다");

		} while (true);
	}

}