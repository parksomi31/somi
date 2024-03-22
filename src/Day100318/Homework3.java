package Day100318;

public class Homework3 {
	
	//필드
	private int num1 = 0;  // 100~9,999,999 사이의 시작값 넣을 변수
	private int num2 = 0; // x~9,999,999 사이의 마지막 값을 넣을 변수
	private int numArray[]; // 그 안에 들어갈 배열
	
	//생성자
	
	
	public void toArray(int num) {
		String Arr = Integer.toString(num);
		for(int i = 0; i<Arr.length();i++) 
			Arr[i] = tmpArr.charAt(i) - '0';
	}


}
