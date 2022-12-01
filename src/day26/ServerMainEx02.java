package day26;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ServerMainEx02 {
/*클라이언트가 연결을 요청하면 연결을 하고, 연결이 종료되기전까지
 * 클라이언트가 전송한 문자열을 계속 출력함
 * 
 * */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		final String encode = "UTF-8";
		try {
			ServerSocket serverScocket =  new ServerSocket();
			serverScocket.bind(new InetSocketAddress(5001));
			while(true) {
				System.out.println("연결대기");
				Socket socket = serverScocket.accept();
				System.out.println("연결완료");
				InputStream is = socket.getInputStream();
				
				while(true) {
					System.out.println(socket);
					byte [] bytes = new byte[1024];
					int readCount = is.read(bytes);
					if(readCount==-1)break;
					String str = new String(bytes, 0, readCount, encode);
					System.out.println(str);
					}
				is.close();
				
	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
