package day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;


public class ClientMainEx01 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(5005));
			System.out.println("[연결이 완료되었습니다.]");
			//Output 스트림 연결,
			OutputStream os = socket.getOutputStream();
			String str = scan.nextLine();
			byte [] bytes = str.getBytes("UTF-8"); 
			//str.getBytes(); 원하는 문자열을 ""형식으로 변환
			os.write(bytes);	//write로 작성
			os.flush();		//flush 로 전송
			bytes = new byte[1024];
			InputStream is =socket.getInputStream();
			int readCount = is.read(bytes);
			str = new String(bytes, 0, readCount, "UTF-8");
			System.out.println(str);
			System.out.println("전송완료");
            os.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
