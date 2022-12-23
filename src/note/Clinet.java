package note;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clinet {

	public static void main(String args[]) {
		client();
	}
	public static void client() {
		int port = 3000;
		String serverIP;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			try {
				Socket socket = new Socket(serverIP,port);
		socket.connect(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), port));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
