package day26;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx01 {

	public static void main(String[] args) {
		InetAddress ia = null;
		
		
		try {
			ia = InetAddress.getByName("localhost");
			ia=InetAddress.getByName("www.naver.com");
			ia=InetAddress.getLocalHost();
			InetAddress []ias = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress tmp : ias) {
				System.out.println(tmp + "   `");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println(ia);

	}

}
