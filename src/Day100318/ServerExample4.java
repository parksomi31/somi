9package Day100318;

import java.net.*;

//클라이언트끼리 통신할 수 있도록 서버를 먼저 실행

class ServerExample4 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버소켓을 널로 초기화
		try {
			serverSocket = new ServerSocket(9002); // 포트번호 9002인 서버소켓을 생성함
			while (true) { // 무한반복시킴
				Socket socket = serverSocket.accept(); // ?서버소켓을 사용하여 클라이언트의 연결요청이 오면 수락해주고 클라이언트와 
				                                                                //통신할 수 있는 socket객체를 반환
				Thread thread = new PerClinetThread(socket); // 
				// 여러개의 클라이언트를 실행시키기위해서 쓰레드를 생성
				thread.start(); // 쓰레드를 동작시킴
			}
		} catch (Exception e) { // 예외처리 (Exception은 가장 상위의 예외처리 가능)
			System.out.println(e.getMessage()); // 예외발생시 출력메시지
		}
	}
}