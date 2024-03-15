package Day7;

import java.util.*;

public class ExceptionTest3 {
	
	private static int i;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int arr[] = new int[3];
			for(int i=0;i<=3;i++) {
				System.out.println("숫자를 입력하세요");
				arr[i] = sc.nextInt();
		}
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("더 이상 입력할 수 없습니다");
		}
		}
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		



