package Day6;

import java.util.*;

abstract class Memory {

	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];

	public int push(int a) {
		System.out.println("넣을 숫자를 입력해주세요");
		int num = sc.nextInt();
		return num;

	}

	public abstract int pop();
}

class MyStack extends Memory {

	Scanner sc = new Scanner(System.in);
	public int pop() {
		System.out.println("Stack에서 출력할 숫자를 입력해주세요");
		int num = sc.nextInt();
		return num;

	}
}

class MyQuene extends Memory {
	
	Scanner sc = new Scanner(System.in);
	public int pop() {
		System.out.println("Quene에서 출력할 숫자를 입력해주세요");
		int num = sc.nextInt();
		return num;

	}
}

public class MemorExam01 {
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		MyQuene quene = new MyQuene();

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("어디에서 작업하시겠어요? 1.Stack 2.Queue");
			int num = sc.nextInt();
			
			if(num == 1) {
				
				while(true) {
					System.out.print("어떤 작업을 수행하시겠어요? 1.입력 2.출력 3.뒤로가기");
					
					int n = sc.nextInt();
					
					if(n == 1) {
						stack.push(sc.nextInt());
						
					}else if(n == 2) {
						System.out.println(stack.pop());						
					}else break;
				}
			}else if(num == 2) {
				
				while(true) {
					System.out.print("어떤 작업을 수행하시겠어요? 1.입력 2.출력 3.뒤로가기");
					
					int n = sc.nextInt();
					
					if(n == 1) {
						quene.push(sc.nextInt());
						
					}else if(n == 2) {
						System.out.println(quene.pop());
					}else break;
				}
			}else System.exit(0);
		
		}while(true);
	}

}