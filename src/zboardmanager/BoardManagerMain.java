package zboardmanager;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.Date;

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
		/*
		 * 메뉴출력
		 * 1. 게시글작성
		 * 2. 게시글조회
		 * 		-1.게시글 전체조회
		 * 		-2.게시글 검색 => 게시글 번호를 입력하여 게시글 내용을 확인
		 * 3. 게시글수정
		 * 4. 게시글삭제
		 * 5. 프로그램종료
		 * 
		 * 정수를 입력해서 메뉴선택
		 * 입력된 메뉴 출력
		 * 
		 * */	
		int select=0;
		ArrayList<Post> postList = new ArrayList<Post>();
		System.out.println("시스템을 시작합니다.");
		do {
			print("1. 게시글 작성",
					"2. 게시글 조회",
					"3. 게시글 수정",
					"4. 게시글 삭제",
					"5. 프로그램 종료",
					"입력 : "
					);
			select=scan.nextInt();
			scan.nextLine();
			run(select, postList);
			
		}while(select !=5);
		System.out.println("시스템을 종료합니다.");

	}

	private static void run(int select, ArrayList<Post> postList) {
		switch(select) {
		case 1: addPost(postList);
			break;
		case 2:	//조회
			break;
		case 3:	//수정
			break;
		case 4:	//삭제
			break;
		case 5:
			break;
			default: System.out.println("잘못된 접근입니다.");
		
		
		}
		
	}

	private static void addPost(ArrayList<Post> postList) {
		Post newPost = new Post();
		Date date = new Date();
		BoardUser user = new BoardUser();
	
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
		String datestr = format.format(date);
		newPost.postDate=datestr;// 현재시간 확인 => 등록
		
		System.out.print("아이디를 입력해주세요 : ");
		user.userName=scan.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		user.password=scan.nextInt();
		scan.nextLine();
		// 게시자 아이디, 비밀번호 등록
		System.out.print("게시글 제목을 입력해주세요. : ");
		newPost.postTitle=scan.nextLine();
		// 게시글 제목 입력
		System.out.println("게시글 내용을 입력해주세요. : ");
		System.out.println("입력이 완료되면 \"QUIT\" 를 따옴표를 포함해서 입력해주세요. ");
		Contents cont = new Contents();

		
		// 게시글 내용 입력
		// 저장
		
		
	}

	private static void print(String ...str) {
		for(int i=0; i<str.length;i++) {
			
		
			System.out.print(str[i]+"\n");}
		
		
	}

	private static void input(Contents a) {
		
	
		
	}
}


