package day30;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	/*	기능
	 * 	-게시글 등록
	 * 	-게시글 수정
	 * 	-게시글 삭제
	 * 	-게시글 목록
	 * 	-게시글 확인
	 * 		-댓글 등록
	 * 		-댓글 확인
	 * 		-이전
	 * 	-프로그램종료
	 * */
	//메뉴가 프로그램 종료가 아니면 반복하는 코드
	
	static Scanner scan = new Scanner(System.in);
	static {System.out.println("반갑습니다 ^ㅇ^\n\n");}
	static ArrayList<Board> boardList = new ArrayList<Board>();
	
	public static void main(String[] args) {
		int menu=1213;
	for(;;) {
		printMainMenu();
		menu=scan.nextInt();
		scan.nextLine();
		if(menu==6)break;
		runMenu(menu);
		
	}
		System.out.println("\n시스템을 종료합니다.");
	}

	/**runMenu();
	 * 메뉴가 주어지면 주어진 메뉴에 맞는 기능을 출력하는 메소드
	 * @param menu 선택된 메뉴
	 * 
	 * */
	
	static void runMenu(int menu) {
		System.out.println("\n\n");
		switch(menu) {
		case 1: insertBoard();
			break;
		case 2: System.out.println("게시글 수정메뉴 작업해야 합니다. 놀 시간 없습니다.\n\n");
			break;
		case 3: System.out.println("게시글 삭제메뉴 작업해야 합니다. 서둘러주세요~\n\n");
			break;
		case 4: System.out.println("게시글 목록메뉴 작업해야 합니다. 급하게 좀 생각해주셔야 할것 같아요. 다들 밤새워 야근하는데 혼자만 느긋한거 같다는 생각은 안 해보셨나요?\n\n");
			break;
		case 5: System.out.println("게시글 확인메뉴 작업해야 합니다. 내일까지 마감이에요. 마무리 못할것 같으면 사직서양식이랑 본인 장례식장 찾아보고 계세요~\n\n");
			break;
		case 6: 
			break;
			default: System.out.println("잘못된 접근입니다.\n\n");
		}
	}
	/**insertBoard();
	 * 게시글 정보를 입력받아 게시글을 출력하는 메소드
	 * */
	public static void insertBoard() {
		
		System.out.println("제목은");
		String title = scan.nextLine();
		System.out.println("ㅇㅋ 내용 써");
		String contents = scan.nextLine();
		System.out.println("이름");
		String name = scan.nextLine();
		
		Board board = new Board(title, contents, name);
		
		board.print();
		
		boardList.add(board);
		
		
	}

	/**메뉴를 출력하는 메소드
	 * */
	static void printMainMenu() {
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 목록");
		System.out.println("5. 게시글 확인");
		System.out.println("6. 시스템 종료");

	}
	
}
