package Day100318;

import java.io.*;
import java.net.*;
import java.util.*;

public class PerClinetThread {

	// ArrayList 객체를 여러 스레드가 안전하게 공유할 수 있는 동기화된 리스트로 만듭니다.
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	//서버에 연결된 모든 클라이언트의 출력스트림을 저장하는 동기화된 리스트

	Socket socket; //Soket타입의 socket의 변수 선언
	PrintWriter writer; // PrintWriter 타입의 writer 변수 선언

	//생성자
	PerClinetThread(Socket socket) { // 소켓을 받아서 해당 클라이언트의 출력 스트림을 생성 
		this.socket = socket; //받아온 socket값은 멤버면수 socket에 값 복사대입
		try {
			writer = new PrintWriter(socket.getOutputStream());  //printwiner 
			list.add(writer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		String name = null; //name이라는 변수를 null값으로 초기화
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			//객체주의
			//소켓클래스 안에 정의되어 있는 getInputStream은 서버로부터 데이터를 읽어오는 것
			//BufferedReader 타입의 reader참조형변수를 생성하는데 
			// InputStreamReader가 필요하고 InputStreamReader는 socket을 통해 받아온 InputStream값이 필요

			// 수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장
			name = reader.readLine(); //참조형변수 reader를 통해 받은 문자열을 name이라는 변수에 저장
			sendAll("#" + name + "님이 들어오셨습니다"); //클라이언트가 문자열을 입력하여 전송하면 sendALL 모든 클라이언트에게 해당 클라이언트가 참여했다는 것을 알림
			while (true) { //무한반복
				String str = reader.readLine(); //참조형변수 reader를 통해 받은 문자열을 name이라는 변수에 저장
				if (str == null) //조건문 str변수에 담긴 값이 null이면 break
					break;
				sendAll(name + ">" + str); // 수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신
			}
		} catch (Exception e) { //예외처리 
			System.out.println(e.getMessage ()); //예외발생시 메시지를 출력
		} finally { //예외가 발생하든 안하든 무조건 실행
			list.remove(writer);  //클라이언트가 채팅을 종료하면 출력스트림을 관리하는 리스트에서 해당클라이언트를 제거
			// 근데 채팅을 종료했다는 걸 어떻게알지...?
			sendAll("#" + name + "님이 나가셨습니다"); // 사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보냅니다.
			try {
				socket.close();
			} catch (Exception ignored) { //예외처리, 예외가 발생했을 때 아무일도 일어나지 않고 무시해버림
			}
		}
	}

	// 서버에 연결되어 있는 모든 클라이언트로 똑같은 메시지를 보냅니다.
	private void sendAll(String str) {
		for (PrintWriter writer : list) { //list에 저장된 모든 클라이언트의 출력스트림을 조회? 하면서
			writer.println(str); //
			writer.flush(); //출력스트림을 비워서 모든 데이터 클라이언트에게 즉시 전송
		}
	}
}
