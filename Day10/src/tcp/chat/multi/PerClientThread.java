package tcp.chat.multi;

import java.io.*;
import java.net.*;
import java.util.*;

class PerClinetThread extends Thread {

	// ArrayList 객체를 여러 스레드가 안전하게 공유할 수 있는 동기화된 리스트로 만듭니다.
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

	Socket socket;
	PrintWriter writer;

	PerClinetThread(Socket socket) {
		this.socket = socket;
		try {
			// 소켓의 출력 스트림을 PrintWriter로 래핑하여 초기화
			writer = new PrintWriter(socket.getOutputStream());
			// 출력 스트림을 리스트에 추가
			list.add(writer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장
			name = reader.readLine();
			// 모든 클라이언트에게 입장 메시지 송신
			sendAll("#" + name + "님이 들어오셨습니다");
			while (true) {
				String str = reader.readLine();
				if (str == null)
					break;
				sendAll(name + ">" + str); // 수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//클라이언트가 나갔음을 모든 클라이언트에게 알림
			list.remove(writer);
			sendAll("#" + name + "님이 나가셨습니다"); // 사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보냅니다.
			try {
				socket.close();
			} catch (Exception ignored) {
			}
		}
	}

	// 서버에 연결되어 있는 모든 클라이언트로 똑같은 메시지를 보냅니다.
	private void sendAll(String str) {
		for (PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}
}
