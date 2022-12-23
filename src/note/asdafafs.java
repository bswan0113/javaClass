package note;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class asdafafs {

	public static void main(String[] args) {

		String ServerIP;
		try {
			ServerIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(ServerIP);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
