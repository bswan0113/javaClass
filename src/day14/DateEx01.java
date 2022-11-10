package day14;

import java.util.Date;

public class DateEx01 {

	public static void main(String[] aradfasdada) {
		/*Date 클래스
		 * - 시스템으로부터 시간 정보를 가져와서 다루게 하는 클래스
		 * Date() => 현재시간 정보
		 * Date(num) => 1970년도 1월 1일 0시 0분 0초를 기준으로 num 밀리세컨 만큼 흐른 시간을 가져옴
		 * */
		
		Date date1 = new Date();
		System.out.println("현재 시간은 : "+ date1 +" 똑딱똑딱 입니다. 똑딱똑딱");				
		Date date2 = new Date();
		System.out.println(date2);
		
		// System.currentTimeMillis(); : 현재 시스템 시간을 밀리세컨드로 환산
		long nowMillis = System.currentTimeMillis();
		int week = 7*24*60*60*1000;
		
		Date date3 = new Date(nowMillis+week);
		System.out.println(date3);
		
	}
}
