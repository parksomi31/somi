package Day8;

	class MyRunnableTwo implements Runnable {
		
		public void run() {
			System.out.println("run"); 
			first();
		}
		public void first() {
			System.out.println("first"); 
			second();
		}

		public void second() {
			System.out.println("second");
		}
	}

	public class JoinExam1 {
		public static void main (String[] args) {
			System.out.println(Thread.currentThread().getName() + "start");
			Runnable r = new MyRunnableTwo() ;    //22,23 줄은 인터페이스를 활용할 때는 이렇게 선언하도록 쓰레드를 만든사람이 만든 규칙? 같은거라고 생각하면될듯
			Thread myThread = new Thread(r);
			myThread.start();
			try {
				myThread.join();
			} catch(InterruptedException ie) {
				ie.printStackTrace(); 
			} 
			System.out.println(Thread.currentThread().getName()+ "end");
		}
}
