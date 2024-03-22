package Day120320;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("팩토리얼을 진행할 숫자를 입력해주세요");
		int num = sc.nextInt();
		int result = answer(num);
		System.out.println(num + "의 팩토리얼은" + result + "입니다");
	}

	static int answer(int num) {

		if (num <= 1) {
			return 1;
		} else {
			return num * answer(num - 1);
		}
	}
}
