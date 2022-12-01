package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainEx01 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		final String encode ="UTF-8";
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(5005)); //bind를 이용해 포트와 연결
			while(true) {
				System.out.println("[연결 대기중]");
				Socket socket = serverSocket.accept(); //대기중에 있다가 허용되면 소컷 객체를 생성
				
				
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress(); 
				//연결을 확인하는 절차, 없어도됨
				System.out.println("[연결 수락 함]" + isa.getAddress());
				InputStream is = socket.getInputStream();
				byte [] bytes = new  byte[1024];
				int readCount = is.read(bytes);
				String str = new String(bytes, 0,readCount, encode);
				System.out.println(str);
				//콘솔에서 문자열을 입력받아 클라이언트로 전송		
				OutputStream os = socket.getOutputStream();
				str =scan.nextLine();
				bytes = str.getBytes(encode);
				os.write(bytes);
				os.flush();
				is.close();
				System.out.println("[전송완료]");
				os.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
