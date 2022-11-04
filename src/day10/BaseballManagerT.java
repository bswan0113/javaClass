package day10;

import java.util.Scanner;

import day08.MethodBaseballGameEx01;

public class BaseballManagerT {
	/*숫자 야구게임을 플레이 한 후, 기록을 저장 하는 프로그램
	 * 
	 * 1. 플레이
	 * 2. 기록확인
	 * 3. 종료
	 * 메뉴선택 : 2
	 * 1. 홍길동 2회
	 * 2. 임꺽정 3회
	 * 3. 김선달 3회
	 * 4. 이정재 4회
	 * 
	 * */
	
	public static void main(String[] args) {
		int menu;
		Record [] records = new Record [5];
		do{//메뉴출력
		printMenu(
			"------------",
			"메뉴",
			"1. 플레이",
			"2. 기록확인",
			"3. 종료",
			"------------",
			"메뉴선택 : "
				); // 이 방법이 더 좋음
		//메뉴선택
		menu = selectMenu();
		//선택한 메뉴에 따른 기능 실행
		runMenu(menu,records);}while(menu != 3);
		
		
	}
/**
 * 주어진 메뉴에 맞는 기능을 실행하는 메소드
 * @param menu 실행할 메뉴 번호
*/
private static void runMenu(int menu, Record[] records) {
		switch(menu) {

		case 1:
			int size = 3;
			int min=1, max=9;
			//컴퓨터가 랜덤으로 숫자 생성
			int[]com = MethodBaseballGameEx01.newGame(min,max,size);
			
			BaseballGame bg = new BaseballGame(com);
			
			for (int tmp : com) {
				System.out.print(tmp + " ");
			}
			int tryCount = 0;
			do {
			//사용자가 숫자 입력
			int[]user = MethodBaseballGameEx01.scanArray(new Scanner(System.in), size);
			bg.setUser(user);
			//판별
			bg.printGame();
			tryCount++;
	
			//3S 종료
			}while(bg.getStrike() != size);
			//new 횟수를 기록
			// 5등 기준으로 횟수가 동일한 경우 먼저플레이한 사용자 기록을 유지
			// 기록의 최대 회수를 찾음
			// 기록된 수를 찾음(꼴지 순위)
			int maxRecordCount = getMaxRecordCount(records);
			int maxRecordRank = getMaxRecordRank(records);
			if(maxRecordCount>tryCount || maxRecordRank < 5) {
				addRecord(records, tryCount);
			}
			// 기록된 최대 횟수가 내 횟수보다 크거나 기록된 수가 5보다 작으면 기록
			break;
		case 2:
			printRecords(records);
			break;
		case 3:
			break;
		default:
		
		
		}
	}
private static void printRecords(Record[] records) {
	for(int i=0; i<records.length; i++) {
		System.out.print(i+1+"위");
		if(records[i] != null) {
			records[i].print();
		}
		else {
		System.out.println();}
		}
	
}
private static void addRecord(Record[] records, int tryCount) {
	Scanner scan = new Scanner(System.in);
			System.out.println("이름을 입력하시오 : ");
			String name = scan.next();
			Record r = new Record(tryCount, name);
			int index = 0;
			for(Record record : records) {
				if(record != null && record.getCount() < tryCount) {
					index++;
				}
			}
	for(int i = records.length-1; i>index; i--) {
		records[i] = records[i-1];
	}
	records[index] = r;
}
private static int getMaxRecordRank(Record[] records) {
	int rank = 0;
	for(Record record : records) {
		if(record != null) {
			rank++;
		}
	
}return rank;
}
private static int getMaxRecordCount(Record[] records) {
	int count = 99999999;
	for(Record record : records) {
		if(record != null) {
			record.getCount();
		}
	}
	return count;
}
/**
 * 메뉴를 콘솔에서 입력받아 돌려주는 메소드
 * @return 입력받은 메소드
 * */
private static int selectMenu() {
	Scanner scan = new Scanner(System.in);
	
		return scan.nextInt();
	}
/**
 * 메뉴를 출력하는 메소드로, 마지막 메뉴는 엔터를 안침
 * @param strs 콘솔에 출력할 메뉴들
 * */
	private static void printMenu(String ...strs ) { // 가변인자를 이용
		
		for(int i = 0; i<strs.length; i++) {
			System.out.print(strs[i]);
			if( i != strs.length-1) {
				System.out.println();
			}
//			System.out.print(strs[i] + (i!= strs.length-1?"\n":"")); 위와 동일
		}
		
	}

}
