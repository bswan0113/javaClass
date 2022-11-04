package CutyCutyThirtyone;

import java.util.Scanner;

public class Thirtyone {
	/* 1. 플레이 
	 * 시작은 컴퓨터 먼저 하기로
	 *	//컴퓨터가 랜덤으로 1~3개의 숫자를 부름
	 *	//사용자가 몇개의 숫자를 부를 지 입력
	 * 2. 기록확인
	 *  //컴퓨터와 사용자의 승리 횟수
	 * 3. 종료
	 * 
	 * */
	public static void main(String[] args) {
		int menu;
		//메뉴출력
		printMenu(
				"★귀엽고 깜찍하게 써리원☆",
				"1. 시이작...★",
				"2. 기록확인...★",
				"3. 바이바이......★"
				);
		//메뉴입력
		menu = selectInt();
		
		//메뉴의 기능
		runMenu(menu);
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1: System.out.println("게임추가해주세요.");
			break;
		case 2:System.out.println("기록창 추가해주세요.");
			break;
		case 3: System.out.println("게임종료창 생성");
			break;
		default: System.out.println("오류입니다.");
			
		}
		
	}

	private static int selectInt() {
		Scanner scan = new Scanner(System.in);
		
		return scan.nextInt();
	}

	private static void printMenu(String ...str) {
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
	}

}
