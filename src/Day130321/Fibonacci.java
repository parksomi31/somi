package Day130321;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Fibonacci {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("피보나치 수열의 n번째 항을 값을 구하는 프로그램입니다.");
      System.out.println("몇 번째 항의 값을 구해볼까요?");
      int num = sc.nextInt();
      int result = answer(num);
      System.out.println(num + "번째 항의 값은" + result + "입니다");
      System.out.println(num + "번째 항까지의 피보나치 수열은 아래와 같습니다");
      
      int a =0;
      int b=1;
      for(int i =0; i<num; i++) {
    	  System.out.print(a + " ");
    	  int temp = a;
    	  a = b;
    	  b = temp + b;
      }
   }
   

   static int answer(int num) {
	      if (num != 0 && num <= 3) {
	         return 1;
	      } else if (num > 3) {
	         return answer(num - 1) + answer(num - 2);
	      } else {
	         return 0;
	      }
	   }
	}

/*
 * head: 첫번째 노드(남아있는 애들중에서 무조건 첫번째 노드
 * nextnode : 새로운 노드
 * nest 다음
 * prev 전
 * del 삭제
 * cru 잡일
 * 
 * 
 * 
 */


