package day10;

import java.util.Scanner;

public class UpDownGameManerT {

	public static void main(String[] args) {
		int menu;
		Record[] records = new Record[5];
		
		//반복
		do {
			//메뉴 출력
			printMenu(
					"☆☆UPDOWN MANAGER 2002★★",
					"☆★☆★☆★☆★☆★☆★☆★☆★☆★",
					"        NEW GAME",
					"         RECORD",
					"          QUIT",
					"☆★☆★☆★☆★☆★☆★☆★☆★☆★",
					" ★☆★☆SELECT MENU★☆★☆"
					);
			//메뉴 선택
			menu=insertInt();
			runMenu(menu,records);
		
			//메뉴에 따른 기능 실행 : 선택한 메뉴, 기록정보
				//플레이
					//랜덤수 생성
		
					//반복
						//사용자 입력
						
						//Up Down 판별
					//기존 기록보다 좋으면 기록을 추가
				
			//기록확인
				//기록된 순위를 출력
			//종료
		}while(menu!=3);
	}
/**고정된 메뉴를 출력하는 메소드/주어진 메뉴를 출력하는 메소드
 * 
 * 
 * */

	private static void printMenu(String...std) {
		
		for(int i=0;i<std.length;i++) {
			System.out.print(std[i]);
			System.out.println();
		}
		
	}

	/**콘솔에서 정수를 입력받아 입력받은 정수를 알려주는 메소드
	 * @return 입력받은 정수(메뉴)
	 * */
	public static int insertInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	/** 주어진 기록정보를 이용하여 메뉴에 따른 기능을 실행하는 메소드.
	 * @param records 기록정보들
	 * @param menu 선택한메뉴
	 * 
	 * */
	public static void runMenu(int menu, Record[] records) {
		switch(menu) {

		case 1:
			//플레이를 하고난 후 맞출때까지의 시행횟수를 알아야 함.
			int tryCount = playGame();
			
			//기존 기록보다 좋으면 기록을 추가
			writeRecord (records, tryCount);
			break;
		case 2:
			printRecords(records);
	
			break;
		case 3:System.out.println("작동을 종료합니다.");
			break;	
		default:
			System.out.println("잘못입력하였습니다.");
		
		}
	}
	private static void printRecords(Record[] records) {
		for(int i=0; i<records.length;i++) {
			System.out.print("RANK " + (i+1) );
			if(records[i] != null) {
				records[i].print();
			}
			{
				System.out.println();
			}
		}
		
	}
	/**
	 * 기록 정보보다 사용자 기록이 좋으면 기록을 추가하는 메소드
	 * */
	private static void writeRecord(Record[] records, int tryCount) {
		int index = 0;
		for(int i = 0; i<records.length; i++) {
			//1등부터 비교하여 나보다 기록이 좋으면 내 순위가 밀림
			if(records[i] != null && tryCount >= records[i].getCount()) {
				index++;
			}
			//기록이 없는 처음 순위를 내 기록으로 하기위해 i를 index에 저장
			else if(records[i]==null){
				index = i;
				break;
			}
			//비교 순위보다 내가 기록이 좋으면 반복문 종료
			else {
				index = i;
				break;
			}
		}
		//순위안에 못들으면
		if(index==5) {
			return;
			
		}
		System.arraycopy(records, index, records, index+1, records.length -1 - index -1);
		System.out.println("이 름을입 력하시 오 : ");
		Scanner scan = new Scanner(System.in);
				String name = scan.next();
		records[index] = new Record(tryCount, name);
	}
	
	private static int playGame() {	
		//랜덤수생성
		int num = random(1,100);
		System.out.println(num);
		int tryCount = 0;
		int user;
		//반복
		do {
		//사용자입력
			System.out.println("정수 입력 : ");
			user = insertInt();
			if (user > num) {
				System.out.println("DOWN♬");
			}
			else if(user < num) {
				System.out.println("UP♬");
			}
			else {
				System.out.println("정답♨");
			
			}
			tryCount++;
		//Up Down 판별
		}while(num != user);
		return tryCount;
	}
	
	private static int random(int min, int max) {
		return (int)(Math.random()*(max -min +1) +min);
	}
}
