package day17;

import java.util.HashMap;
import java.util.Scanner;

public class UserMapMangerMain {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int menu=-1;
		System.out.println("시스템을 시작합니다.");
		HashMap<String, Member> map = new HashMap<String, Member>();
		do {
			
			printMenu();
			menu=scan.nextInt();
			scan.nextLine();
			switch(menu) {
			case 1:					
				addMember(map);										
				break;
			case 2:
				if(!searchMember(map)) System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				break;
			case 3:
				if(!updateMember(map)) System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				break;
			case 4:		
				System.out.println("수정할 대상의 ID를 입력하세요. ");
			String search = scan.nextLine();
			if(map.get(search)==null)
			{System.out.println("존재하지 않는 ID입니다.");}
			System.out.println("비밀번호를 입력해주세요.");
			Member updateTmp = map.get(search);
			int pw = scan.nextInt();
			scan.nextLine();
			if(updateTmp==null) {continue;}
			if(!updateTmp.getPw().equals(pw)) {continue;}
			map.remove(search);
				break;
			case 5:
				break;
				default: System.out.println("잘못된 접근입니다.");
			}
			
			
		}while(menu != 5);

		System.out.println("시스템을 종료합니다.");
	}

	private static boolean updateMember(HashMap<String, Member> map) {
		System.out.println("수정할 대상의 ID를 입력하세요. ");
		String search = scan.nextLine();
		if(map.get(search)==null)
		{System.out.println("존재하지 않는 ID입니다."); return false;}
		System.out.println("비밀번호를 입력해주세요.");
		Member updateTmp = map.get(search);
		int pw = scan.nextInt();
		scan.nextLine();
		if(updateTmp.getPw().equals(pw)) {return false;}
		System.out.println(updateTmp);
		
		System.out.println("새롭게 사용할 비밀번호를 입력하세요.");
		String PW = scan.nextLine();
		System.out.println("새롭게 사용할 이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("새롭게 사용할 나이를 입력하세요.");
		int age = scan.nextInt();
		 scan.nextLine();
		System.out.println("새롭게 사용할 주민등록번호를 입력하세요.");
		String num = scan.nextLine();			
		updateTmp.update(PW,name,age,num);
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println(map);		
		return true;
	}

	private static boolean searchMember(HashMap<String, Member> map) {
		System.out.println("검색할 대상의 ID를 입력하세요. ");
		String search = scan.nextLine();
		if(map.get(search)==null)
		{System.out.println("존재하지 않는 ID입니다."); return false;}
		System.out.println("비밀번호를 입력해주세요.");
		Member searchTmp = map.get(search);
		int pw = scan.nextInt();
		if(!(searchTmp.getPw().equals(pw)))return false;
		System.out.println(searchTmp);
		return true;
		}
	

	private static boolean addMember(HashMap<String, Member> map) {
		if(map==null) {
			throw new RuntimeException("예외, 예외 Map이 null 입니 다.");
		}
		System.out.println("사용할 아이디를 입력하세요.");
		String ID = scan.nextLine();
	

		if((map.get(ID)!=null)) 
			System.out.println("이미 존재하는 아이디 입니다. 다른 아이디를 생성해주세요.");


		System.out.println("사용할 비밀번호를 입력하세요.");
		String PW = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		 scan.nextLine();
		System.out.println("주민등록번호를 입력하세요.");
		String num = scan.nextLine();			
		map.put(ID, new Member(PW, name, num, age));
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println(map);
		return true;
	}

	private static void printMenu() {
		System.out.println("1.회원추가");
		System.out.println("2.회원검색");
		System.out.println("3.회원수정");
		System.out.println("4.회원삭제");
		System.out.println("5.종료");
		
	}
}
