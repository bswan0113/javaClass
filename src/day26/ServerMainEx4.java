package day26;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainEx4 {
/*클라이언트가 연결을 요청하면 연결을 하고, 연결이 종료되기전까지
 * 클라이언트가 전송한 문자열을 계속 출력함
 * 
 * */
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket serverScocket =  new ServerSocket();
			serverScocket.bind(new InetSocketAddress(5001));
			
			while(true) {
				System.out.println("연결대기");
				Socket socket = serverScocket.accept();
				Client c = new Client(socket);
				c.read();
				c.send();
				
	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		
}
