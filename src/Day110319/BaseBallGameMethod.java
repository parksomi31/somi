package Day110319;

import java.security.DomainCombiner;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGameMethod {

	// 필드
	
	// 생성자

	// 메서드 (랜덤숫자생성, 스트라이크, 볼)

	public static int[] randomNums() { // 컴퓨터가 랜덤숫자를 생성하는 함수
		Random random = new Random(); // 랜덤 객체 생성
		int randomNumArr[] = new int[3]; // 컴퓨터가 랜덤으로 생성하는 3자리의 배열
		for (int i = 0; i < randomNumArr.length; i++) { // 배열의 길이만큼 랜덤숫자를 넣음
			randomNumArr[i] = random.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (randomNumArr[i] == randomNumArr[j]) {
					i--; // 중복된 숫자가 들어가면 다시 해당배열에 랜덤숫자를 생성
					break;
				}
			}
		}
		return randomNumArr;
	}

	public static int[] inPutNums() { // 사용자가 숫자를 입력하는 함수
		Scanner sc = new Scanner(System.in);
		int inputArr[] = new int[3]; // inputArr 변수 선언
		System.out.println("1~9 사이에서 3개의 숫자를 입력해주세요");
		String numString = sc.next(); // 사용자에게 받은 숫자 3개를 스트링타입으로 받음
		for (int i = 0; i < inputArr.length; i++) { // 그걸 각 배열에다가
			inputArr[i] = numString.charAt(i) - '0';
		}
		return inputArr;
	}

	public static int strike(int[] randomNumArr, int[] inputArr) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (inputArr[i] == randomNumArr[i]) {
                strike++;
            }
        }
        return strike;
    }

	public static int ball(int[] randomNumArr, int[] inputArr) {
    	int ball = 0;
    	for (int i = 0; i < randomNumArr.length; i++) {
			for (int j = 0; j < inputArr.length; j++) { // random배열에 i인덱스에 있는 숫자와 input받은 배열의 j인덱스에 있는 숫자 비교
				if (randomNumArr[i] == inputArr[j] && i != j) {
					ball++;
				}
			}
}
  
