package Day100318;

import java.io.*;
import java.net.*;

class ReceiverThread extends Thread { 
	Socket socket; //소켓 객체 선언 (멤버변수 = 필드)

	//생성자
	ReceiverThread(Socket socket) { //소켓 객체를 받아서 소켓 초기화
		this.socket = socket; //받은 소켓은 멤버변수에 소켓으로 값복사 대입
	}

	//메서드
	public void run() {
		try {  
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//??? 소켓을 통해 입력받은 메시지를 
			while (true) { //무한반복 

				// 서버로부터 수신된 메시지를 모니터로 출력
				String str = reader.readLine(); //reader를 통해 읽어온 한줄의 문자열을 str에 값 저장
				if (str == null)  //str이 null이면 
					break; //멈추고
				System.out.println(str); //str을 출력
			}
		} catch (IOException e) { //예외처리
			System.out.println(e.getMessage()); //예외처리시 메시지 출력
		}
	}
}
