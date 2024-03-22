package tcp.chat.multi;

import java.net.*;

class ServerExample4 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			// 서버 소켓을 포트번호 9002번으로 생성
			serverSocket = new ServerSocket(9002);
			while (true) {
				// 클라이언트의 연결을 기다림
				Socket socket = serverSocket.accept();
				// 각 클라이언트마다 새로운 스레드 생성
				Thread thread = new PerClinetThread(socket);
				thread.start(); // 스레드 시작
			}
		} catch (Exception e) {
			// 예외 발생 시 메시지 출력
			System.out.println(e.getMessage());
		}
	}
}
