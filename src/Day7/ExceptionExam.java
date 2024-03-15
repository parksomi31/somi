package Day7;

/*
 * ㅇ 예외처리
 *  - 정상적인 마무리를 수행하게 해주는 것
 *  - try ~ cacth문을 이용
 * 
 * 
 */

import java.util.*;

public class ExceptionExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try { // 예상되는 예외를 인식
			int num = sc.nextInt();
			System.out.println(3 / num);
			
		} catch (ArithmeticException ae) { // 예외처리기, 참조형변수는 내맘대로 이름만들어서 생성
//			ae.printStackTrace(); // 에러난 경우의 메시지 확인용
			System.out.println("0을 입력하지 마세요");
			
			return;  //  1) return을 만나면 본인을 호출한 곳으로 돌아가는데, 얘는 메인에 있으니까 os로 돌아감. 즉 아래에 있는 건 더이상 실행되지 않음
			
		} catch (Exception in) {  //catch문은 다중으로 쓸 수 있는데, 만약에 정해놓지 않고 나머지 일반적인 예외케이스에서 동일하게 처리하고자하는 경우에는 
			                      // 최상위 부모클래스인 Exception사용, 사용시에는 catch문 맨 아래에 사용함
			System.out.println("숫자를 입력하세요");
		} finally {  //2) finally블럭은 return을 무시함. 무조건 돌아가기 전에 실행함
		System.out.println("Bye");
		}
	}
}
