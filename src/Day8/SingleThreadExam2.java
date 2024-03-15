package Day8;

public class SingleThreadExam2 implements Runnable{  //쓰레드가 되는 건 아니고, 쓰레드를 인식할 수 있는 환경이 되는것 
	                           //extends Thread {    // 다른 걸 상속하고 있는 경우에는 쓸 수 없음
	
	//필드
	private int[] temp;
	
	//생성자
	public SingleThreadExam2() {  
		//super(threadname);  얘는 인터페이스를 이용한거니까 쓰레드가 아니기 때문에 부를 생성자가 없음. 
		temp = new int[10];
		for(int start=0;start<temp.length;start++) {
			temp[start] = start;
		}
	}

	public void run() {
		for(int start : temp ) {
			try {  //sleep함수를 쓰기위해서는 무조건 try catch를 사용해야함
				Thread.sleep(1000); //sleep은 static이라 객체 생성없이도 사용가능
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드이름: %s ,", Thread.currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
	}
	public static void main(String[] args) {
		SingleThreadExam2 st = new SingleThreadExam2();
//		Thread th = new Thread(st);
//		th.setName("Superman");
		
		Thread th = new Thread(st, "superman");
		th.start(); // th의 run이 호출되는 것 (위의 함수 run이 아니라)
	}
}
