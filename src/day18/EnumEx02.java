package day18;

import java.util.Scanner;

public class EnumEx02 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*	오늘의 영어를 영어로 입력받아  한글로 출력하는 코드를 작성하시오.
		 * 
		 * */
		while(true){
		System.out.print("요일 : ");
		String day =scan.next();
		printKor(day);
		}
		
	}

	
		
	

	public static void printKor(String a) {
		
		try {
		switch(Week.valueOf(a)) {
		case FRIDAY: System.out.println("금요일");
			break;
		case MONDAY:System.out.println("월요일");
			break;
		case SATURDAY:System.out.println("토요일");
			break;
		case SUNDAY:System.out.println("일요일");
			break;
		case THURSDAY:System.out.println("목요일");
			break;
		case TUESDAY:System.out.println("화요일");
			break;
		case WEDNESDAY:System.out.println("수요일");
			break;}
		}catch(Exception e){
			System.out.println("잘못 입력했습니다.");
			
		}
		
	}
		
		


	
}
enum Week{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
