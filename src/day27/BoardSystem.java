package day27;

import java.util.ArrayList;
import java.util.Scanner;


public class BoardSystem {

	static ArrayList<MemberList> memberList = new ArrayList<MemberList>();
	static { System.out.println("반갑습니다 ^ㅇ^");}
	static Scanner scan = new Scanner(System.in);
	static private final Member manager= new Member("ADMIN","1111");
	static {memberList.add(new MemberList(manager));}
	static ArrayList<boardList> boardList = new ArrayList<boardList>();
	
	public void run() {
		int menu;
		do {
			printMenu();
			menu=scan.nextInt();
			scan.nextLine();	
			try {
			runMenu(menu);}catch(Exception e) {
				System.out.println("비정상적인 접근입니다.");
				menu=scan.nextInt();
			}
		}while(menu!=3);
		
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1: entranceBoard();
			break;

		case 2: signUp();
			break;

		case 3: return;

		case 0000: printAdminMenu(); //관리자모드
			break;
		default:
			
		
		}
		
	}

	
	private void entranceBoard() {
		if(!memberConfirmation()) {System.out.println("등록되지 않은 계정입니다."); return;}
		printBoardMenu();
		
		
		
	}

	private void runBoardMenu(Member tmp) {
		int menu= scan.nextInt();
		scan.nextLine();
		switch(menu) {
		case 1: addBoard(tmp);
			break;
		case 2:
			break;
		case 3:viewBoard();
			break;
		case 4:return;
		default : System.out.println("비정상적인 접근입니다.");
		}
		
	}

	private void addBoard(Member tmp) {
		System.out.println("제목을 입력해주세요");
		String title = scan.nextLine();
		System.out.println("내용을 입력해주세요");
		String contents = scan.nextLine();
		Board tmp2 = new Board(title, contents);
		boardList tmp3 = new boardList(tmp2, tmp);
		boardList.add(tmp3);
		
		
		System.out.println("게시글 작성이 완료되었습니다.");
		
	}

	private void printBoardMenu() {
		System.out.println("1.게시글 작성");
		System.out.println("2.게시글 검색");
		System.out.println("3.게시판 입장");
		System.out.println("4.뒤로");
	}

	private void viewBoard() {
		for(int i=0; i<boardList.size();i++) {
			
			System.out.println(boardList.get(i));
			
		}
	
		System.out.println("메인 화면으로 가려면 아무키나 눌러주세요.");
		scan.nextLine();
		
	}

	private boolean memberConfirmation() {
		System.out.println("ID를 입력해주세요 : ");
		String id = scan.nextLine();
		if(duplicateCheck(id)) return false;
		System.out.println("비밀번호를 입력해주세요.");
		String pw = scan.nextLine();
		if(!duplicatepwCheck(pw))return false;
		
		return true;
		
	}

	private boolean duplicatepwCheck(String pw) {
		for(int i=0; i<memberList.size();i++) {
			if(memberList.get(i).getMember().getPw().equals(pw)) return true;
		}
		return false;
	}

	//회원가입기능 구현완료
	private void signUp() {
		System.out.println("약관을 읽어보시고 동의하시면 O, 동의하지 않으시면 X를 입력해주세요.");	
		System.out.println("이러이러한 약관1");
		System.out.println("저러저러한 약관2");
		System.out.println("이러저러한 약관3");
		char agree = scan.next().charAt(0);
		scan.nextLine();
		switch(agree) {
		case 'O': addMem();
			break;
		case 'X': System.out.println("약관에 동의하지 않으면 회원가입이 불가능합니다.");return; 			
		default:
			signUp();
		}		
	}

	

	private void addMem() {
		System.out.println("회원가입을 진행합니다");
		System.out.println("사용 할 ID를 입력해주세요");
		String id = scan.nextLine();
		if(!duplicateCheck(id)) {System.out.println("이미 존재하는 ID입니다.");return;}
		System.out.println("사용할 비밀번호를 입력해주세요.");
		String pw = scan.nextLine();
		MemberList a = new MemberList(new Member(id, pw));
		memberList.add(a);
		System.out.println("회원가입이 완료되었습니다.!\n"+a);		
	}

	private boolean duplicateCheck(String id) {
		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).getMember().getId().equals(id)) {
				
				return false;
			}
		}
		return true;
	}

	private void printAdminMenu() {
		System.out.println("관리자모드");
		System.out.println("1. 회원관리");
		System.out.println("2. 게시글 관리");
		System.out.println("3.관리자 모드 종료");
		
	}

	private void printMenu() {
		System.out.println("1. 게시판 입장");
		System.out.println("2. 회원등록");
		System.out.println("3. 종료");
		
	}

}
