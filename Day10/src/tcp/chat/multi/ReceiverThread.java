package tcp.chat.multi;

import java.io.*;
import java.net.*;

class ReceiverThread extends Thread {
	Socket socket;

	ReceiverThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			// 소켓의 입력 스트림을 BufferedReader로 래핑하여 초기화
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {

				// 서버로부터 수신된 메시지를 모니터로 출력
				String str = reader.readLine();
				if (str == null)
					break; // 메시지가 null이면 반복문 종료
				// 수신된 메시지를 모니터로 출력
				System.out.println(str);
			}
		} catch (IOException e) {
			// 입출력 예외 발생 시 메시지 출력
			System.out.println(e.getMessage());
		}
	}
}
