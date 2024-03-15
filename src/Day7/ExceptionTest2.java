package Day7;

import java.util.Scanner;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int arr[] = new int[4];
		
		System.out.println("숫자를 입력해주세요");
	
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		
		try {			
			arr[4] = sc.nextInt();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("더이상 입력할 수 없습니다");
		} catch (Exception se) {
			System.out.println("더이상 입력할 수 없습니다");
		}
		
	}
}




