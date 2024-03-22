package Day120320;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//정돈된 수: 왼쪽부터 차례로 커지는 수 
//100~9,999,999범위를 갖는 변수 x, x~9,999,999 범위를 갖는 변수y를 입력받아
//x와 y사이의 모든 정도된 수와 갯수를 출력하는 프로그램 작성

public class ArrayNum {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("정돈된 수를 구하는 프로그램입니다");
      System.out.println("=========================");
      System.out.println("100~9,999,999사이의 수를 하나 입력해주세요(x)");
      int startNum = sc.nextInt();
      System.out.println("100~9,999,999사이에서 X보다 큰 수를 하나입력해주세요 (Y)");
      int endNum = sc.nextInt();

      //정돈된 수를 저장하기 위한 ArrayList선언
      ArrayList<Integer> sortNums = new ArrayList<>();
      //정돈된 수의 개수를 저장하기 위한 변수 선언 및 초기화
      int count = 0;
      
      for(int i = startNum; i<=endNum; i++) {
         if(isSortedNumber(i)) {
            sortNums.add(i);
            count++;
         }
      }
      
      System.out.println("X와 Y 사이의 정돈된 수: ");
      for(int number: sortNums) {
         System.out.println(number);
      } System.out.println("총 개수: " + count);
      
   }
      //정돈된 수를 확인하는 메서드 

   public static boolean isSortedNumber(int num) {
       String strNum = Integer.toString(num); // 정수를 문자열로 변환해서 str 변수에 저장
       char[] chars = strNum.toCharArray(); // 문자열을 문자 배열로 변환해서 char배열에 저장
       Arrays.sort(chars); // 문자 배열을 정렬
       String sortedStrNum = new String(chars); // 정렬된 문자 배열을 다시 문자열로 변환해서 sortedStrNum 변수에 저장
       return strNum.equals(sortedStrNum); // 정렬된 문자열과 기존 문자열을 비교하여 정돈된 수인지 확인하여 true/false 리턴
   }
}