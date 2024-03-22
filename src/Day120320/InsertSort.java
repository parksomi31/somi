package Day120320;
import java.util.Random;

public class InsertSort {

	public static void main(String[] args) {

		int data[] = new int[1000];
		Random random = new Random();

		for (int i = 0; i < 1000; i++) {
			data[i] = random.nextInt(1000); // (int) (Math.random() * 1000);
		}
		insertionSort(data, 1000);

		for (int i = 0; i <= 998; i++) {
			if (data[i] > data[i + 1])
				System.out.println("Error");
			System.out.println(data[i]);
		}
	}

	public static void insertionSort(int[] data, int num) {
		for (int i = 1; i < data.length; i++) {// 2번째 요소부터 시작할 거기때문에 i=1부터 시작하고 data배열의 길이만큼 반복
			int j; // 비교하고자 하는 인덱스 값을 저장하기 위한 변수
			int tmp = data[i]; // 정렬을 하고자하는 현재 기준값
			for (j = i; j > 0 && data[j - 1] > tmp; j--) {// 현재 기준값보다 앞의 배열에 있는 값이 더 크면 계속 한쪽 앞으로 가면서 반복
				data[j] = data[j - 1]; // 앞의 배열의 값을 뒤로 밀어줌
			}
			data[j] = tmp; // 앞에 배열에다가 현재 배열의 값 대입
		}
	}
}
