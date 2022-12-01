package day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	private Socket socket;
	static Scanner scan = new Scanner(System.in);
	static String encode = "UTF-8";

	public Client(Socket socket) {
		this.socket = socket;
	}
	public void read() {
		Thread t = new Thread (() -> {
			
			
			System.out.println("연결완료" + socket.getRemoteSocketAddress());
			InputStream is;
			try {
				while(true) {is = socket.getInputStream();
				System.out.println(socket);
				byte [] bytes = new byte[1024];
				int readCount = is.read(bytes);
				if(readCount==-1)break;
				String str = new String(bytes, 0, readCount, encode);
				System.out.println(str);}
				is.close();
			} catch (Exception e) {
		System.out.println("종료하였음");	}
			
			
				
		});
		t.start();
	}
	public void send() {
		
		Thread A = new Thread (() -> {
		try {
			OutputStream os;
			os = socket.getOutputStream();
			while(true) {
				System.out.println("입력 : ");
				String str =scan.nextLine();
				if(str.equals("exit"))break;
				byte [] bytes = str.getBytes(encode);
				os.write(bytes);
				os.flush();
			}
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		});
		A.start();	
	}
}
