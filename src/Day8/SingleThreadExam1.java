package Day8;

public class SingleThreadExam1 extends Thread{
	
	//필드
	private int[] temp;
	
	//생성자
	public SingleThreadExam1(String threadname) { //String 타입의 threadname 변수명
		super(threadname);  //부모생성자 호출
		temp = new int[10];
		for(int start=0;start<temp.length;start++) {
			temp[start] = start;
		}
	}

	public void run() {
		for(int start : temp ) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드이름: %s ,", currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
	}
	public static void main(String[] args) {
		SingleThreadExam1 st = new SingleThreadExam1("superman");
		st.start();
	}
}
