package Day110319;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class BaseBallGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("야구게임을 시작합니다");
		System.out.println("==============");
		System.out.println("몇 게임을 진행하시겠습니까?");
		int num = sc.nextInt();

		int gameCnt = 0; // num만큼을 반복하고 싶어서 count하는 변수를 선언
		int allcount = 0; // 사용자가 전체 게임동안 시도한 횟수를 세고싶어서 변수 선언

		// start
		while (gameCnt < num) {
			Random random = new Random(); // 랜덤 객체 생성
			int randomNumArr[] = new int[3]; // 컴퓨터가 랜덤으로 생성하는 3자리의 배열

			for (int i = 0; i < randomNumArr.length; i++) { // 배열의 길이만큼 랜덤숫자를 넣음
				randomNumArr[i] = random.nextInt(9);
				for (int j = 0; j < i; j++) {
					if (randomNumArr[i] == randomNumArr[j]) {
						i--; // 중복된 숫자가 들어가면 다시 해당배열에 랜덤숫자를 생성
						break;
					}
				}
			}
			
			System.out.println(Arrays.toString(randomNumArr));

			int count = 0; // 한번의 게임동안 사용자가 숫자를 입력한 횟수 카운트를 위한 변수

			while (true) { // 배열의 길이만큼 반복해서 랜덤숫자비교하기
				int inputArr[] = new int[3]; // 사용자가 입력하는 3개의 숫자 배열
				System.out.println("1~9 사이에서 3개의 숫자를 입력해주세요");
				String numString = sc.next(); // 입력받은 3개의 숫자를 String타입으로 받아서
				for (int i = 0; i < inputArr.length; i++) { // charAt을 이용하여 각 배열에다가 숫자로 반환하여 넣음
					inputArr[i] = numString.charAt(i) - '0';
				}
				count++; // 숫자를 입력하는 하나의 동작이 끝났을 때 count 변수를 +1해줌

				int strike = 0; // 스트라이크와 볼은 0으로 초기화
				int ball = 0;

				for (int i = 0; i < randomNumArr.length; i++) {
					for (int j = 0; j < inputArr.length; j++) { // random배열에 i인덱스에 있는 숫자와 input받은 배열의 j인덱스에 있는 숫자 비교
						if (randomNumArr[i] == inputArr[j] && i == j) {
							strike++;
						} else if (randomNumArr[i] == inputArr[j] && i != j) {
							ball++;
						}
					}
				}
				System.out.println(strike + " 스트라이크" + " " + ball + "볼");
				if (strike == 3) {
					System.out.println("와우 정답입니다!");
					System.out.println(count + "번 만에 맞췄습니다");
					break;
				} else {
					System.out.println("다시 시도해보세요");
				}

			}
			gameCnt++;
			allcount += count;
			// 하나의 반복이 끝나면 카운트가 +1되면서 위의 조건을 만족하지 않으면 반복문을 빠져나가게 됨
			// 하나의 반복이 끝난동안의 count 횟수를 allcount에 넣어줌

		} // end
		System.out.println("총" + num + "번의 게임동안" + "평균" + allcount / num + "번만에 성공했습니다.");

	}

}
