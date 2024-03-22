package Day100318;

import java.net.*;
import java.io.*;

class SenderThread extends Thread {
	Socket socket; //Socket타입의 socket 객체 선언
	String name; //String 타입의 name객체 선언

	//생성자
	SenderThread(Socket socket, String name) {  //Socket socket, String name 두 개의 매개변수를 받아서 SenderThread클래스 멤버변수에 대입
		this.socket = socket;
		this.name = name;
	}

	//메서드
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//클라이언트 측에서 사용자의 입력을 받기 위해 키보드 입력값을 읽어들이는 BufferedReader 객체를 생성합니다.
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			//클라이언트 소켓의 출력 스트림을 이용하여 서버에 메시지를 보낼 PrintWriter 객체를 생성
			
			// 제일 먼저 서버로 대화명 송신한다.
			writer.println(name); 
			writer.flush();

			// 키보드로 입력된 메시지를 서버로 송신
			while (true) { //무한반복
				String str = reader.readLine(); //str이라는 변수에 입력받은 문자를  받아옴
				if (str.equals("bye")) //입력받은 문자가 bye와 일치하면
					break; //중단
				writer.println(str); //입력받은 문자를 받아와서 출력
				writer.flush(); //출력스트럼을 비워서 
			}
		} catch (Exception e) { //예외처리
			System.out.println(e.getMessage()); //예외에 해당될 때 메시지 출력
		} finally { //예외든 아니든 무조건  실행
			try {
				socket.close(); //네트워크종료
			} catch (Exception ignored) { //예외가 발생하면 무시하고 실행
			}
		}
	}
}
