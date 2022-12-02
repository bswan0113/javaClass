package day30;

import java.util.ArrayList;
import java.util.List;
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
	static List<Comment> commentList = new ArrayList<Comment>();
	
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
		case 1: insertBoard();break;
		case 2: updateBoardList();break;
		case 3: deleteBoardList();break;
		case 4: printBoardList();break;
		case 5: printBoard();break;
		case 6: 
			break;
			default: System.out.println("잘못된 접근입니다.\n\n");
		}
	}
	/**insertBoard();
	 * 게시글 정보를 입력받아 게시글을 출력하는 메소드
	 * */
	public static void insertBoard() {
		
		
		int boardNum =inputBoardNum();
		Board board =inputBoard(boardNum);
		if(boardList.contains(board)) {
			System.out.println("이미 있지롱~");
			return;
		}
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
	
	/**inputBoardNum : Scanner를 통해 번호를 입력받아 알려주는 메소드
	 * @return 입력받은 게시글 번호
	 * 
	 * */
	static int inputBoardNum() {
		System.out.println("번호는?");
		int a=scan.nextInt();
		scan.nextLine();
		return a;
	}
	/**inputBoard : 게시글 번호가 주어지면 제목, 내용, 작성자를 입력하여 게시글을 반환
	 * @param num 게시글 번호
	 * @return 게시글 객체
	 * */
	
	static Board inputBoard(int boardNum) {
	

				System.out.println("제목 입력해줘~");
				String title = scan.nextLine();
				System.out.println("내용 입력해줘~");
				String contents = scan.nextLine();
				System.out.println("작성자 입력해줘~");
				String author = scan.nextLine();
				return new Board(boardNum, title, contents, author);
				
				
			}

	/**updateBoard : 게시글 리스트에 주어진 게시글을 수정하는 메소드로 수정하면 true 실패하면 false를 반환
	 * @param boardList 게시글 리스트
	 * @param 수정할 게시글
	 * @return 수정성공 true, 실패 false
	 * */
	
	static boolean updateBoard(Board board) {
		if(boardList.size()==0)return false;
		int index = boardList.indexOf(board);	
		if(index==-1)return false;
		boardList.set(index, board);
		return true;
		
		
	}
	
	/**updateBoardList:게시글 리스트에  게시글 정보를 입력받아 수정
	 * 
	 * */
	public static void updateBoardList() {
		System.out.println("수정할 게시글의 번호를 입력해줘~");
		Board board =inputBoard(inputBoardNum());
		if(!updateBoard(board)) {System.out.println("실패해버렸다ㅠ");return;}
		System.out.println("교체 성공!");
		System.out.println(board);
		
			
		
	}
	
	/**deleteBoard : 게시글 리스트에 주어진 게시글을 수정하는 메소드
	 * @param boardList 게시글 리스트
	 * @param num 삭제할 게시글 번호
	 * @return 삭제성공 true/false
	 * */
	
	static boolean deleteBoard(int num) {
		Board board=new Board(num);
		return boardList.remove(board);
	}
	/**deleteBoardList : 게시글 번호를 입력받아 삭제하는 메소드
	 * 
	 * */
	static void deleteBoardList() {
		int num = inputBoardNum();
		if(!deleteBoard(num)) {
			System.out.println("그런사람 안살아요~");return;
		}
		System.out.println("삭제 성공~");
	}
	
	/**printBoardList : 게시글 전체를 출력하는 메소드
	 * */
static void	printBoardList(){
	boardList.forEach(b->System.out.println(b)); // 자체 내부적으로 하나씩 리스트에서 꺼내어 가져옴
	}

/*람다식함수적 인터페이스
 * supply 매x   리o
 * consumer매o  리x
 * function매o  리o
 * predicate매o 리o boolean
 * */

/**printBoard() : 게시글 번호를 입력받아 입력받은 게시글을 출력하고 서브메뉴를 출력하고 서브메뉴를 선택하면 선택한 서브메뉴를 실행
 * */

static void printBoard() {

	int num= inputBoardNum();
		Board board = new Board(num);
	int index=boardList.indexOf(board);
	if(index ==-1) {
		System.out.println("없거나 없어졌어용");return;
	}
	board = boardList.get(index);
	board.print();
	int subMenu=-1;
	do{
		printSubMenu();
		subMenu=scan.nextInt();
		scan.nextLine();
		runPrintSubMenu(subMenu, num);
	}while(subMenu!=3);
}
/**printSubMenu() : 게시글을 확인해서 필요한 서브메뉴를 출력해줌
 * 
 * */

static void printSubMenu() {
	System.out.println("1. 댓글 등록");
	System.out.println("2. 댓글 확인");
	System.out.println("3. 이전으로");
}
/**runPrintSubMenu() : 선택한 서브메뉴를 실행
 * @param num2 게시글 번호
 * @param num 선택한서브메뉴
 * */
static void runPrintSubMenu(int num, int num2) {
	switch(num) {
	case 1: insertCommentList(num2);
		break;
	case 2:printCommentList(num2);
		break;
	case 3: return;
	default: System.out.println("잘못된 접근이에요~");
	}
}
/**insertComment: 댓글을 댓글 리스트에 추가하는 메소드
 * @param commnetList 댓글리스트
 * @param commnet 댓글
 * @return 댓글 추가여부
 * */

static boolean insertComment(Comment comment) {
	int index = commentList.indexOf(comment);
	if(index!=-1) return false;
	commentList.add(comment);
	return true;
}

/**댓글정보를 입력받아 댓글을 추가*/
static void insertCommentList(int boardNum) {
	try {
	int num = inputBoardNum();
		System.out.println("작성자 입력해줘~");
	String author = scan.nextLine();
	System.out.println("내용 입력해줘~");
	String contents = scan.nextLine();
	Comment comment = new Comment(num, author, contents, boardNum);
	if(!insertComment(comment)) {
		System.out.println("등록 실패에요!"); return;
	}
	System.out.println("등록완료에요!");
	}catch(Exception e) {
		System.out.println("똑바로해주세요~");
	}
	
	
}

/**printCommentList: 선택한 게시글에 있는 댓글들을 확인하는 메소드
 * @param boardNum 게시글 번호*/

static void printCommentList(int boardNum) {
	if(commentList.size()==0) {System.out.println("아무도... 없었다!"); return;}
	commentList.forEach(c->{
		if(c.getBoardNum()==boardNum) {
			System.out.println(c);
		}
	});
	}
}

