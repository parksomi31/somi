package Day120320;

public class SortExam {

	public static void main(String[] args) {

		int data[] = { 90, 78, 100, 30, 55 };

		bubbleSort(data);

		for (int i : data) {
			System.out.println(i + "\t");
		}
	}

	public static int[] bubbleSort(int[] data) { // 객체 생성없이 메인에서 접근할 수 있도록 static이용
		int tmp; // 값을 저장해둘 수 있는 변수 생성
		int all = 0; // 반복횟수를 저장할 수 있는 변수 생성
		int count = 0;// 수가 바뀐 값을 저장할 수 있는 변수 생성
		for (int i = 0; i < data.length - 1; i++) { // 각 시작 지점부터 마지막 원소 직전까지 비교(비교해야될 수보다 -1만큼만 반복해주면됨. 2개씩잡고돌리니까)
			for (int j = 0; j < data.length - i - 1; j++) { // 현재원소와 다음원소를 비교하여 정렬, 그리고 한번 정렬이 되면 맨 마지막수는 고정이니까 -1을 해줌
				if (data[j + 1] < data[j]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
					count++;
				}
				all++;
			}
		}
		System.out.println("총 반복횟수: " + all);
		System.out.println("숫자가 바뀐 횟수: " + count);
		return data;
	}
}
