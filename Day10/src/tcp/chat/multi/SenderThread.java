package tcp.chat.multi;

import java.net.*;
import java.io.*;

class SenderThread extends Thread {
	Socket socket;
	String name;

	SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	public void run() {
		try {
			// 키보드 입력을 읽어오기 위한 BufferedReader 생성
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// 소켓의 출력 스트림을 PrintWriter로 래핑하여 초기화
			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			// 제일 먼저 서버로 대화명 송신한다.
			writer.println(name);
			writer.flush(); // 버퍼 비우기

			// 키보드로 입력된 메시지를 서버로 송신
			while (true) {
				String str = reader.readLine(); // 키보드로부터 한 줄 읽기
				if (str.equals("bye")) // 사용자가 "bye"를 입력하면 반복문 종료
					break;
				writer.println(str); // 송신한 메시지를 서버로 보냄
				writer.flush(); // 버퍼 비우기
			}
		} catch (Exception e) {
			// 예외 발생 시 메시지 출력
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); // 소켓 닫기
			} catch (Exception ignored) {
			}
		}
	}
}
