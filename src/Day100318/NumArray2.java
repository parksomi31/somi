package Day100318;

import java.util.Arrays;

public class NumArray2 {

	public static void main(String[] args) {
		//변수선언
		int[] numArray = new int[4];  // 4자리 숫자를 받을 수 있는 배열 생성
		int num = 0;
		for (int j = 1000; j < 10000; j++) {  //1000부터 9999까지 반복
			num = j; 
			for (int i = 0; i < 4; i++) {		// 숫자 자르기		
				numArray[i] = num%10;
				num = num/10;
			}		
			Arrays.sort(numArray);			//sort함수를 이용해서 정렬
			
			if (numArray[0] == 0) {  // 0일때 자리변경
				for (int i = 1; i < 4; i++) {
					if (numArray[i] != 0) {
						numArray[0] = numArray[i];
						numArray[i] = 0;
						break;
					}
				}
			}
			//출력 //헷갈림...
			System.out.print(j+"\t");
			for (int i : numArray)   // 변수i를 numArray 배열의 각 요소에 돌면서
				System.out.print(i); //각 배열의 들어있는 값을 출력
			System.out.println(); //하나를 출력 후 줄바꿈
		}
	}
}