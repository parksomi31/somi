package Day7;

import java.util.Scanner;

public class ExceptionExam02 {

	public static void main(String[] args) throws ArithmeticException, InterruptedException {
       // throws를 쓰면 예외처리 시에 쟤네들한테 넘겨서 처리할거야 라는 의미
	   // 단, 100프로 처리가 안될 수 있음(쟤네들한테 만들어져있지 않은 경우). 그런 경우에는 직접 try~catch 만들어줘야함
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println(3 / num);
		
		try {
		Thread.sleep(3000);

		System.out.println("Bye");

	}
}
}