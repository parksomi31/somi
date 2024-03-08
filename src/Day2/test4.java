package Day2;
import java.util.*;

public class test4 {

	public static void main(String[] args) {
		int a = test4.num1(); //class.호출할 함수 입력
		String c = test4.op();
		int b = test4.num2();
		test4.answer(a, b, c);

		// test4.Plus(test4.num1(), test4.num2(), test4.op());

	}

	// method는 main밖에서 작성해야함
	// 입력 함수
	public static int num1() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("첫번째 숫자를 입력해주세요."); // 첫번째 숫자 입력
		  int answer = sc.nextInt();
		  return answer;  
	 }

	public static String op() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자를 입력해주세요"); //연산자 입력
		String answer = sc.next();
		return answer;
	}

	public static int num2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두번째 숫자를 입력해주세요."); // 두번째 숫자 입력
		int answer = sc.nextInt();
		return answer;
	}

	public static void answer(int num1, int num2, String op) {
		if (op.equals("+")) {
			test4.Plus(num1, num2, op); 
		} else if (op.equals('-')) {
			test4.Minus(num1, num2, op);
		} else if (op.equals("*")) {
			test4.Multiply(num1, num2, op);
		} else if (op.equals("/")) {
			test4.Divide(num1, num2, op);
		} else {
			System.out.println("잘못입력하였습니다"); //연산자를 잘못 입력 하였을 경우
		}

	}

	public static void Plus(int num1, int num2, String op) {
		System.out.println(num1 + op + num2 + "=" + (num1 + num2)); //'+'입력 시 호출
	}

	public static void Minus(int num1, int num2, String op) {
		System.out.println(num1 + op + num2 + "=" + (num1 - num2)); //'-'입력 시 호출
	}

	public static void Multiply(int num1, int num2, String op) {
		System.out.println(num1 + op + num2 + "=" + (num1 * num2)); //'*'입력 시 호출
	}

	public static void Divide(int num1, int num2, String op) {
		System.out.println(num1 + op + num2 + "=" + (double) num1 / num2); //'*/'입력 시 호출
	}
}




//Scanner sc = new Scanner(System.in);                             Scanner sc = new Scanner(System.in); 을 공통으로 빼주고 
//
//
//public static int num1(Scanner sc) { /                          //매개변수를 가져다 씀...........?ㅎㅎㅎㅎㅎㅎ이해안됨
//	  System.out.println("첫번째 숫자를 입력해주세요.");
//	  int answer = sc.nextInt();
//	  return answer;  
//}
//
//public static String op(Scanner sc) {
//	System.out.println("연산자를 입력해주세요");
//	String answer = sc.next();
//	return answer;
//}