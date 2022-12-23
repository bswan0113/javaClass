package note;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Adadasfa {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat s= new SimpleDateFormat("yyyy년 mm월 dd일 yy시 mm분 ss초");		
		String a = s.format(date);		
		System.out.println(a);
		
		
		
		

	}
	
	

}
