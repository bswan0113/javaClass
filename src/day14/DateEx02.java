package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
	//	System.out.println(date);
		//Date를 원하는 패턴 시간 형태의 문자열로 변환
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	//	String datestr = format.format(date);
	//	System.out.println(datestr);
		//문자열을 Date로 변환
		
		String str = "2022-11-12";
		Date date2 = format.parse(str);
		System.out.println(date2);

	}

}
