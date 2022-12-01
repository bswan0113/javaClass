package day27;

import java.net.Socket;

public class Client {
	private Socket socket;

	public Client(Socket socket) {
		this.socket = socket;
	}
	public void recive() {
		Thread t = new Thread(()->{
			
		});
		t.start();
		
	}
	
	public void send(String data) {
	}
	
	
	

}
