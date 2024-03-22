package Day100318;

import java.net.Socket;

public class ClientExample4 {
	public static void main(String[] args) {
		if (args.length != 1) { // args 배열의 길이가 1이 아니라면 유저네임이 입력되지 않은거니까 입력하라고 안내 메시지를 출력
			System.out.println("Usage: java ClientExample4 <user-name>"); // user-name을 입력하도록 안내해주는 메시지 출력
			return;
		}
		try {
			// 서버와 연결
			Socket socket = new Socket("192.168.0.73", 6000); // ip주소와 포트번호를 입력하여 해당 서버객체에 연결

			// 메시지 송신 쓰레드와 수신 쓰레드 생성해서 시작
			Thread thread1 = new SenderThread(socket, args[0]); // 클라이언트가 서버로 메시지를 보내는 작업을 하는 쓰레드를 생성
			Thread thread2 = new ReceiverThread(socket); // 클라이언트가 서버로부터 메시지를 받는 작업을 하는 쓰레드를 생성

			thread1.start(); // thread1을 실행시킴
			thread2.start(); // thread2를 실행시킴
		} catch (Exception e) { // try에서 쭉 실행되다가 예외발생하면 예외구문 (Exception은 모든 예외처리 가능)
			System.out.println(e.getMessage()); // 예외처리 시 메시지 출력
		}
	}
}
