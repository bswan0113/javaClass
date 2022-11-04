package day10;

import java.util.Scanner;

public class UpDownGameManger {
/**
 * UpDown 게임을 구현하시오.
 * 1. 플레이
 * 2. 기록확인
 * 3. 종료
 * */
	public static void main(String[] args) {
		int menu;
		Record [] records = new Record [5];
		do{//메뉴출력
		printMenu(
			"☆★☆★☆★☆★☆★☆★☆★",
			"1. NEW GAME",
			"2. RECORD",
			"3. QUIT",
			"☆★☆★☆★☆★☆★☆★☆★"
			
				); // 이 방법이 더 좋음
		//메뉴선택
		menu = selectMenu();
		//선택한 메뉴에 따른 기능 실행
		runMenu(menu,records);}while(menu!=3);
		
		//반복
		
		//메뉴 출력
	
		//메뉴 선택
	
		//메뉴에 따른 기능 실행
			//플레이
				//랜덤수 생성
	
				//반복
					//사용자 입력
					
					//Up Down 판별
				//기존 기록보다 좋으면 기록을 추가
			
		//기록확인
			//기록된 순위를 출력
		//종료
	}

private static void runMenu(int menu, Record[] records) {
	
	
	switch(menu) 
	{
	
	case 1:
		char y='k';
		int count = 0;
		Scanner scan = new Scanner(System.in);
		do {
			
		
		int min=1, max=100;
		int r = (int)(Math.random()*(max-min+1)+min);
		do {
		System.out.println(r);
		
		int user = scan.nextInt();
		count++;
		if(r>user) {
			System.out.println("UP");
		}
		else if(user>r) {
			System.out.println("DOWN");
		}
		else if(user ==r) {
			y ='n';
			System.out.println("Congratuation! Defeated all enemy!");
			int maxRecordCount = getMaxRecordCount(records);
			int maxRecordRank = getMaxRecordRank(records);
			if(maxRecordCount>count || maxRecordRank < 5) {
				addRecord(records, count);}
				System.out.println("You got a score : " + count);

			
		}
		
		
			
		}while(y!='n');
		count=0;
		
		System.out.println("If you want to play once, press y. but do not want, press n");
		y=scan.next().charAt(0);
		
		}while(y!='n');
		
		
		
		break;
	
	case 2:
		printRecords(records);
		break;
	
	case 3:
		System.out.println("Okay, good day guys.");
		break;
	default:
	}
	
}
private static void printRecords(Record[] records) {
	
	Scanner scan = new Scanner(System.in);
	for(int i=0; i<records.length; i++) {
		System.out.print(i+1+"위");
		if(records[i] != null) {
			records[i].print();
		}
		else {
		System.out.println();}
		}
	System.out.println("Press any key, if you want to back.");
	String back = scan.nextLine();
	
	
	
}
private static void addRecord(Record[] records, int tryCount) {
	Scanner scan = new Scanner(System.in);
			System.out.println("Please input your name : ");
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
private static int selectMenu() {
	Scanner scan = new Scanner(System.in);
	
	return scan.nextInt();
	
}
private static void printMenu(String ...strs) {
	for(int i = 0; i<strs.length; i++) {
		System.out.print(strs[i]);
		if( i != strs.length-1) {
			System.out.println();
		}
	
}


}
}