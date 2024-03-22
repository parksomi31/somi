package Day130321;

import java.util.Scanner;

public class FactorialFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("팩토리얼을 진행할 숫자를 입력해주세요");
			int num = sc.nextInt();
			int answer = 1;
			for (int i = num; i > 1; i--) {
				answer *= i;
			}
				System.out.println(num + "팩토리얼 계산값은" + answer + "입니다");
				System.out.println("계속 하시겠습니까? 1. 예 2. 아니오");
				choice = sc.nextInt();
		} while (choice == 1);
	}
}
