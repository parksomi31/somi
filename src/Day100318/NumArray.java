package Day100318;

/*
 * 4자리의 숫자를 오름차순으로 정렬
 * 맨앞에는 0이오면x
 * 1. 4자리의 숫자를 정렬하기 위해서 숫자형 배열로 전환
 * 2. 각 배열을 조건에 맞게 정렬
 * 3. 다시 숫자로 전환
 */

public class NumArray {
	// 변수
	private int[] numArr = new int[4]; // 4자리의 숫자를 입력받을 배열 객체 생성

	// 숫자형배열로 전환
	public void toArray(int num) {
		String tmpArr = Integer.toString(num);
		for (int i = 0; i < tmpArr.length(); i++) // String타입으로 받은 정보를 각 배열에 넣어줌
			numArr[i] = tmpArr.charAt(i) - '0';
	}

	// 정렬메서드
	public void sortNum() {
		int tmp;

		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[i] > numArr[j]) {
					tmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tmp;
				}
			}
		}
		// 0인 경우 자리바꿔주기
		if (numArr[0] == 0) {
			for (int i = 0; i < numArr.length - 1; i++) {
				if (numArr[i] != 0) {
					numArr[0] = numArr[i];
					numArr[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		NumArray numArray = new NumArray();
		for (int k = 1000; k < 10000; k++) {
			numArray.toArray(k);
			numArray.sortNum();
		}
	}
}
