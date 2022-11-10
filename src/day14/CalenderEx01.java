package day14;

import java.util.Calendar;

public class CalenderEx01 {

	public static void main(String[] args) {
			/* Calendar 클래스 : 날짜와 관련된 클래스
			 *  Calendar cal = Calendar.getInstance(); 
			 *  //년도, 월, 일, 시, 분, 초 등 다양한 정보를 가져옴
			 *  
			 *  cal.add(Calendar.(YEAR,MONTH,DATE .......), num);
			 * */
		
		Calendar cal = Calendar.getInstance();
	//	System.out.print(cal);
		int year = cal.get(Calendar.YEAR);
		System.out.print(year+"년 ");
		int month = cal.get(Calendar.MONTH)+1;
		System.out.print(month + "월 ");
		int day = cal.get(Calendar.DATE);
		System.out.println(day + "일 ");
		int hour = cal.get(Calendar.HOUR);
		System.out.print(hour + "시 ");
		int minute = cal.get(Calendar.MINUTE);
		System.out.print(minute +"분 ");
		int sec = cal.get(Calendar.SECOND);
		System.out.println(sec+"초");
		
		cal.add(Calendar.YEAR, 1);
		System.out.println(cal.get(Calendar.YEAR));
	}

}
