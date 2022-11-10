package day14;

import java.util.Scanner;

public class ExceptionEx03 {

	public static void main(String[] args) {
		/* 다음과 같은 메뉴를 출력하고 정수를 입력받는 코드를 작성하세요.
		 * 정수가 아닌 문자열이 입력되어도 프로그램이 계속 진행되도록
		 * 
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴선택 : 
		 * */
		Scanner scan = new Scanner(System.in);
		int select=0;
		do{printmenu2();
		try{select=scan.nextInt();}
		catch(Exception e) {
			System.out.println("Input error");
			scan.nextLine();
		}
		}while(select!=3);
		scan.close();
	}
	
		


	private static void printmenu2() {
		printmenu(	 "메뉴",
				 "1.플레이",
				 "2. 기록확인",
				 "3. 종료",
				 "메뉴선택 : " );
	}
	private static void printmenu(String ...str) {
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
			if(i-1==str.length) {
				System.out.print(str[i]);
			}
		}
		
	}

}
