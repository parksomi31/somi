package Day8;

class ATMTwo implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		 synchronized(this){  //동기화
		for (int i = 0; i < 10; i++) {
			if (getDepositeMoney() <= 0)
				break;
			withDraw(1000);
			notify(); //출금을 하고나서 대기중인 다른 쓰레드를 깨움
			try { 
				wait(); //출금 후에는 현재 쓰레드를 대기상태로 전환
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	 }
	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch; 
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("%d %n", getDepositeMoney());

		} else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("End.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class WaitNotifyEx {
	public static void main(String[] args) {
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm, "mother");
		 Thread son = new Thread(atm,"son");
		mother.start();
		 son.start();
	}
}
