package tcp.chat.multi;

import java.net.*;
class ClientExample4 {
    public static void main(String[] args) {
    	//인자가 하나가 아닌 경우 사용법 출력 후 종료
        if (args.length != 1) {
            System.out.println(
                "Usage: java ClientExample4 <user-name>");
            return;
        }
        try {
	    // 서버와 연결
            Socket socket = new Socket("192.168.0.84", 9002);

             // 메시지 송신 쓰레드와 수신 쓰레드 생성해서 시작
            Thread thread1 = new SenderThread(socket, args[0]); //송신 쓰레드 생성
            Thread thread2 = new ReceiverThread(socket); //수신 쓰레드 생성

            thread1.start(); //송신 쓰레드 시작
            thread2.start(); //수신 쓰레드 시작
        }
        catch (Exception e) {
        	//예외 발생 시 메시지 출력
            System.out.println(e.getMessage());
        }
    }
}
