package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceMain {
	/* 출석부 관리 프로그램
	 * 1. 학생 등록
	 *  - 이름과 생년월일	 
	 * 2. 학생 수정
	 *  - 이름과 생년월일로 검색해서 이름과 생년월일 수정
	 * 3. 학생 삭제
	 * 	- 이름과 생년월일로 검색해서 삭제
	 * 4. 학생 출결 확인
	 *  - 이름과 생년월일로 검색해서 해당 학생의 모든 출결을 확인
	 *  - 2022-11-22 : O
	 * 5. 출석 확인
	 *  - 날짜 입력 : 2022-11-22
	 *  - 출석 : O, 지각 : /, 조퇴 : \, 결석 : X
	 * 홍길동 출석현황 : X
	 * 고길동 출석현황 : O
	 * 임꺽정 출석현황 : /
	 * 6. 출석 수정
	 *  - 날짜 입력
	 *  - 수정할 학생의 이름과 생년월일 입력
	 * 7. 출석 삭제
	 *  - 날짜 입력하여 해당 날짜 출석 삭제
	 * 8. 날짜별 출석 확인
	 *  - 날짜 입력하여 해당 날짜의 모든 학생의 출석 여부를 확인
	 * 9. 프로그램 종료
	 * */
	
	static Scanner scan = new Scanner(System.in);	
	static {System.out.println("프로그램을 시작합니다.");}
	static ArrayList<Indivisual> abc = new ArrayList<Indivisual>();
	
	public static void main(String[] args) {
		
		ArrayList<Std> std = new ArrayList<Std>();
		
		int menu;
do {		
		printMainMenu();
		menu=scan.nextInt();
		runMainMenu(menu,std);

	}while(menu!=5);

System.out.println("시스템을 종료합니다.");
	}

//메인메뉴
	private static void runMainMenu(int menu, ArrayList<Std> std) {
		scan.nextLine();
		switch(menu) {
		
		case 1: inputAttend(std);
			break;
		case 2: runStdMenu();
			break;
		case 3: runAttendMenu(std);
			break;
		case 4: 
			for(int i=0; i<abc.size();i++) {
				abc.get(i).print();
			}
			break;
			 
		
		
		}
	}
//날짜를 입력하면 등록된 학생들이 출력되고 해당 날짜의 출석을 입력하는 메뉴
	private static void inputAttend(ArrayList<Std> std) {
		if(abc.size()==0) {System.out.println("등록된 학생이 없습니다."); return;}
		System.out.println("출결 등록을 시작합니다.");
		System.out.println("(O(출석), L(지각), T(조퇴), X(결석))");
		System.out.println("금일 날짜를 입력해주세요.");
		String date = scan.nextLine();
		for(int i=0; i<abc.size(); i++) {
			
			System.out.print(abc.get(i) +" : ");
			
			String att = scan.nextLine();
			Std a = new Std(date,abc.get(i),att);
			std.add(a);
			System.out.println();
		}
		System.out.println(date);
		System.out.println(std);

			
		}

//메인메뉴출력
	private static void printMainMenu() {
		System.out.println();

		System.out.println("1. 출결등록");
		System.out.println("2. 학생관리");
		System.out.println("3. 출결관리");
		System.out.println("4. 전체학생조회");
		System.out.println("5. 시스템 종료");
	}
//출결관리 메뉴--------------------------------------------------------------------------------------------
//출결관리 메뉴--------------------------------------------------------------------------------------------
//출결관리 메뉴--------------------------------------------------------------------------------------------
private static void runAttendMenu(ArrayList<Std> std) {
		printAttendMenu();
		int select = scan.nextInt();
		switch(select) {
		
		case 1: dailyResist(std);
			break;
		case 2: stdResist(std);
			break;
		case 3: correctAttend(std);
			break;
		case 4: correctDailyResist(std);
			break;
		case 5: return;
		default: System.out.println("잘못된 입력입니다.");
			
		}
	}

//원하는 날짜를 입력하여 해당 날짜의 출결기록을 모두 삭제
private static void correctDailyResist(ArrayList<Std> std) {
	scan.nextLine();
	System.out.println("삭제를 원하는 날짜를 입력해주세요.");
	String delete = scan.nextLine();
	for(int i=0; i<std.size();i++) {
		if(std.get(i).getDate().equals(delete)) {
			System.out.println(std.get(i));
			if(judgeYorNo()) {
				std.remove(i);
				System.out.println("삭제가 완료되었습니다.");
			}
		}
	}
	
	
}

//원하는 날짜와 학생을 입력하여 해당 날짜의 출결기록을 수정
private static void correctAttend(ArrayList<Std> std) {
	scan.nextLine();
	System.out.println("수정을 원하는 학생의 이름을 입력해주세요.");
	String a = scan.nextLine();
	System.out.println("수정을 원하는 날짜를 입력해주세요.");
	String day = scan.nextLine();
	
	for(int i=0; i<std.size();i++) {
		if(std.get(i).getDate().equals(day) && std.get(i).getStd().getName().equals(a)) {
			System.out.println("(O(출석), L(지각), T(조퇴), X(결석))");
			System.out.print("어떻게 수정하시겠습니까? : ");
			String att = scan.nextLine();
			std.get(i).attend(att);
			System.out.println("수정이 완료되었습니다.");
			System.out.println(std.get(i).getStd() +  " : " + std.get(i).getAttend());
		}
	}
	
}

//원하는 학생의 출결을 전체출력
private static void stdResist(ArrayList<Std> std) {
	scan.nextLine();
	System.out.println("학생별 출결조회를 시작합니다.");
	System.out.println("원하는 학생을 입력해주세요.");
	String stdName = scan.nextLine();
	for(int i=0; i<std.size();i++) {
		if(std.get(i).getStd().getName().equals(stdName)) 
		{	
			System.out.print(std.get(i).getDate());
			System.out.print(" : ");
			System.out.print(std.get(i).getAttend());
			System.out.println();
		}
	}
	}

//날짜별로 학생의 데이터를 출력
private static void dailyResist(ArrayList<Std> std) {
	scan.nextLine();
	System.out.println("일자별 학생 출결조회를 시작합니다.");
	System.out.println("원하는 일자를 입력해주세요.");
	String date = scan.nextLine();
	
	for(int i=0; i<std.size(); i++) {
		if(std.get(i).getDate().equals(date)) {
			System.out.print(std.get(i));
			
		}
	}
	
}


private static void printAttendMenu() {
	System.out.println();
	System.out.println("출결관리");
	System.out.println("1.일자별 출결조회");
	System.out.println("2.학생별 출결조회");
	System.out.println("3.출결수정");
	System.out.println("4.일자별 출결기록 삭제");
	System.out.println("5.이전으로");
	
}



//학생관리메뉴--------------------------------------------------------------------------------------------
//학생관리메뉴--------------------------------------------------------------------------------------------
//학생관리메뉴--------------------------------------------------------------------------------------------
//학생관리메뉴 완료
private static void runStdMenu() {
	printStdMenu();
	int select=scan.nextInt();
	
	switch(select) {

	case 1: addStd();
		break;
	case 2: reviseStd(); 
		break;
	case 3:	addOutStd();
		break;
	case 4: return;
	default: System.out.println("잘못된 접근입니다.");
	}
		
	}

//학생삭제
private static void addOutStd() {
	scan.nextLine();
	System.out.println("학생정보삭제를 시작합니다.");
	System.out.println("삭제할 학생의 이름을 입력해주세요.");
	String name = scan.nextLine();
	System.out.println("삭제할 학생의 생년월일을 입력해주세요.");
	String birth = scan.nextLine();
	Indivisual tmp = new Indivisual(name, birth);
	Indivisual.count= tmp.getStdNum()-1;
	ArrayList<Integer> a = new ArrayList<Integer>();
	findStd(tmp,a);
	for(int i=0; i<a.size();i++) 
	{
		if(abc.get(a.get(i)).equals(tmp))
		{
			System.out.println(abc.get(a.get(i)));
		
			if(judgeYorNo()) {
				abc.remove(abc.get(a.get(i)));
			System.out.println("삭제가 완료되었습니다.");}
		
			else {
				System.out.println("삭제를 실행하지 않았습니다.");
			}
		
			
		}
		else {
			System.out.println("등록되지 않은 학생입니다.");
		}
	}
	

	
	
	
	
}

//학생이 저장된 배열의 번지수를 주어진 정수형 배열의 객체로 추가하는 코드
private static void findStd(Indivisual tmp, ArrayList<Integer> a) {
	
	for(int i=0; i<abc.size(); i++) {
	if(abc.get(i).equals(tmp)) {
		a.add(i);	
	}
	}
}

//실행을 최종적으로 확인하는 코드
private static boolean judgeYorNo() {
	System.out.println("\n 를 삭제하시겠습니까? 맞으면 \"Y\" 아니면 \"N\"을 입력해주세요.");
	String yOrN = scan.nextLine();
	switch(yOrN) {
	
	case "y","Y" : return true;
	case "n","N" : return false;
	default: 
		{System.out.println("\"Y\" 아니면 \"N\" 중에서 입력해주세요.");
	judgeYorNo(); return false;}
	}	
}

//학생정보수정
private static void reviseStd() {
	scan.nextLine();
	System.out.println("학생정보변경을 시작합니다.");
	System.out.println("변경할 학생의 이름을 입력해주세요.");
	String name = scan.nextLine();
	System.out.println("변경할 학생의 생년월일을 입력해주세요.");
	String birth = scan.nextLine();
	Indivisual tmp = new Indivisual(name, birth);
	Indivisual.count= tmp.getStdNum()-1;
	int index;
	for(int i=0; i<abc.size(); i++) {
		if(abc.get(i).equals(tmp)) {
			index=i;
			System.out.println(abc.get(i));
			System.out.println("변경할 이름을 입력해주세요.");
			String name2 = scan.nextLine();
			System.out.println("변경할 생년월일을 입력해주세요.");
			String birth2 = scan.nextLine();		
			abc.get(index).setBirth(birth2);
			abc.get(index).setName(name2);
			System.out.println("변경이 완료되었습니다.");
			System.out.println(abc.get(index) +" "+ abc.get(index).getBirth());
		}
	}

	
	
}

//학생등록
private static void addStd() {
	scan.nextLine();
	System.out.println("학생 등록을 시작합니다.");
	System.out.println("등록할 학생의 이름을 입력해주세요.");
	String name = scan.nextLine();
	System.out.println("등록할 학생의 생년월일을 입력해주세요.");
	String birth = scan.nextLine();
	
	
	Indivisual tmp = new Indivisual(name, birth);
	if(abc.equals(tmp)) {System.out.println("입력에 실패하였습니다."); return;}
	abc.add(tmp);
	System.out.println("학생 등록에 성공했습니다.\n" + tmp+" " +tmp.getBirth()+"\n");
}

//학생관리메뉴 출력
private static void printStdMenu() {
	System.out.println();

	System.out.println("학생관리");
	System.out.println("1.전입 및 신규등록");
	System.out.println("2.학생정보수정");
	System.out.println("3.전출등록");
	System.out.println("4.이전으로");
	
}



}
