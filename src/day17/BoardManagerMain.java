package day17;
import java.util.ArrayList;
import java.util.Scanner;


public class BoardManagerMain {
static Scanner scan = new Scanner(System.in);
	/*게시글 관리 프로그램을 작성하시오.
	 * 
	 * 1. 게시글 작성
	 * 2. 게시글 조회
	 * 3. 게시글 수정
	 * 4. 게시글 삭제
	 * 5. 프로그램 종료.
	 * - 게시글은 번호 ,제목, 내용, 작성자, 작성일, 조회수로 구성
	 * - 게시글 전체 조회는 최신순으로 조회
	 * - 게시글 상세 조회는 게시글 번호를 입력하여 게시글 내용을 확인
	 * - 게시글 수정은 게시글 번호를 선택하면 해당 게시글의 제목, 내용을 수정
	 * - 게시글 삭제는 게시글 번호를 선택하면 해당 게시글을 삭제
	 * -
	 * */
	public static void main(String[] args) {
		int select=0;
		
		System.out.println("시스템을 시작합니다.");
		ArrayList<Board> list = new ArrayList<Board>();
		do {
			print("1. 게시글 작성",
					"2. 게시글 조회",
					"3. 게시글 수정",
					"4. 게시글 삭제",
					"5. 프로그램 종료",
					"입력 : "
					);
			select=scan.nextInt();
			run(select,list);
			scan.nextLine();
	
			
		}while(select !=5);
		System.out.println("시스템을 종료합니다.");

	}
	
	private static void run(int select, ArrayList<Board> list) {
		scan.nextLine();
		switch(select) {
	
		case 1:	
			insertBoard(list,insert());	
			break;
		case 2:	//서브메뉴출력
			if(list == null || list.size()==0) {System.out.println("텅... 비었습니다."); return;}
				selectSubMenu(list);		
			break;
		case 3:	updateBoard(list);
			break;
		case 4:	//삭제할 게시글 번호 입력
			deleteBoard(list);
			break;
		case 5:
			break;
			default: System.out.println("잘못된 접근입니다.");
		
		
		}
		
	}

	private static void updateBoard(ArrayList<Board> list) {
		System.out.println("수정할 게시글의 번호를 입력 삐리릭 해주십 삐리릭 시오.");
		int num =scan.nextInt();
		scan.nextLine();
		int index=-1;
		index = list.indexOf(new Board(num));
		if(index==-1) {System.out.println("없는 게시글입니다."); return;}
		System.out.println(list.get(index));
		
		
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String content = scan.nextLine();
		Board tmp = new Board(title, content);
		tmp =list.get(index);
		
	
		
		
	}

	private static void deleteBoard(ArrayList<Board> list) {
	System.out.println("삭제할 번호 입력");
		int num =scan.nextInt();
		if(list.remove(new Board(num))){
			System.out.println("삭제 를완 료 했 습니 다");
		}
		else {
			System.out.println("영원히 비와이");
		}
		
	}

	private static void selectSubMenu(ArrayList<Board> list) {
		System.out.println("1. 전체조회");
		System.out.println("2. 게시물 검색");
		System.out.print("메뉴선택 : ");
		
		switch(scan.nextInt()) {
		case 1: printAll(list);
			break;
		case 2: 
			printDetail(list);
				break;
			default:
		}
	
	}

	private static Board insert() {
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String content = scan.nextLine();
		System.out.println("작성자 : ");
		String writter=scan.next();
		Board board = new Board(title, content, writter);
		return 	board;
	}

	private static void insertBoard(ArrayList<Board> list, Board board) {
		//게시글정보입력( 제목, 내용, 작성자)
		//목록에 게시글추가
		list.add(0,board); // 0번지에 추가해야 나중에 등록된 게시물순으로 최신화 가능
		System.out.println("삐빅 삐비빅 게시글 등록 와.. 완료!");
	}

	private static void print(String ...str) {
		for(int i=0; i<str.length;i++) {
			
		
			System.out.print(str[i]+"\n");}
		
		
	}
	
	public static void printAll(ArrayList<Board> list) {

		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).print());
		}
	}
	public static void printDetail(ArrayList<Board> list) {
		System.out.println("검색할 게시글의 번호를 입력 삐리릭 해주십 삐리릭 시오.");
		int num =scan.nextInt();
		int index=-1;
		index = list.indexOf(new Board(num));
		if(index==-1) {System.out.println("없는 게시글입니다."); return;}
		list.get(index).updateViews();
		System.out.println(list.get(index));
	}
	
}
