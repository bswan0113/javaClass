package day26;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainEx02 {

	/*서버에 연결을 요청하고,
	 * 연결이 되면 exit를 입력하기 전까지
	 * 문자열을 서버에 전송함
	 * */
	static final String encode = "UTF-8";
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket=new Socket();
			socket.connect(new InetSocketAddress(5001));
			System.out.println("연결 완료");
			send(socket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void send(Socket socket) {
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
		
	}
}
