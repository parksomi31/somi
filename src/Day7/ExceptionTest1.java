package Day7;

import java.util.Scanner;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = "1000";
		String b = "300";
		
		try { //예상되는 예외 
			
			String c = "돈 더 주세요";

			int num3 = Integer.parseInt(c);

			System.out.println(num3);
			
		} catch (NumberFormatException er) {
			System.out.println("출력할 수 없습니다");
			
		} catch (Exception in) { //혹시나 내가 예외 case생각 못했을 경우에도 예외처리
			System.out.println("출력할 수 없습니다");
		}
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);

		System.out.println(num1);
		System.out.println(num2);
	}
	
}

















