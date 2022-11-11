package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordListMain {
/*	영어 단어장 프로그램을 구현하세요.
 * 메뉴
 * 1. 단어 추가
 * 2. 단어 확인
 * 3. 단어 수정
 * 4. 단어 삭제
 * 5. 종료
 * 
 * 단어 : [한단어, 공백입력X]
 * 뜻 : [한문장]
 * 
 * 단어 확인 : 원하는 단어를 검색
 * 단어 수정 : 원하는 단어 입력 => 수정할 번호입력 => 뜻 수정
 * 단어 삭제 : 삭제를 원하는 단어 입력 => 삭제할 번호 입력시 단어 삭제
 * */
	public static void main(String[] args) throws Exception {
		int menu=-1;
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Word> word = new ArrayList<Word>();
		
	
		do {
			printMenu(
					"메뉴",
					"1.단어 추가",
					"2.단어 확인",
					"3.단어 수정",
					"4.단어 삭제",
					"5. 종료",
					"메뉴 입력 : "
					);
			
			try {
				menu = scan.nextInt();
				runMenu(menu, word);
				//선택한 메뉴실행
				
				}catch(InputMismatchException e) {	System.out.println("------------------------");
				System.out.println("에러발생: 정수를 입력하세요..");
				System.out.println("------------------------");
				scan.nextLine();}
					catch(Exception e) {
				
					System.out.println("------------------------");
					System.out.println(e.getMessage());
					System.out.println("------------------------");
					scan.nextLine();
				}
			
		}while(menu!=5);
	}

private static void runMenu(int menu, ArrayList<Word> word) throws Exception {
	switch(menu) {
	case 1://단어추가
		break;
	case 2:	
		break;
	case 3: //단어 수정
		break;
	case 4: //단어삭제
		break;
	case 5: System.out.println("시스템을 종료합니다.");
		break;
	default:throw new Exception("예외 발생 : 잘못된 번호입니다. 다시 입력해주세요.");
	}
}

//메뉴출력
private static void printMenu(String ...str) {
	for(int i =0; i<str.length;i++) {
		System.out.println(str[i]);
	}
	
}

}

