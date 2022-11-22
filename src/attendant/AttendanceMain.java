package attendant;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceMain {

	static Scanner scan = new Scanner(System.in);
	static {System.out.println("시스템을 시작합니다.");}
	
	//메인
	public static void main(String[] args) {
		int menu=-111;
		Attendance attendance = new Attendance();
		
		do {
			printMenu();
			menu=scan.nextInt();
			scan.nextLine();
			printbar();
			runMenu(menu,attendance);
			
		}while(menu!=3);
		printStr("시스템을 종료합니다.");

	}
	
		private static void printbar() {
			System.out.println("===============");
		}
		private static void printStr(String ...str) {
			for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
			printbar();}
		}
//메뉴출력
	private static void printMenu() {


		System.out.println("======메뉴======");
		System.out.println("1.학생관리");
		System.out.println("2.출석관리");
		System.out.println("3.종료");
		printbar();
		System.out.println("메뉴 선택 : ");
}
	
//서브메뉴출력
private static void printSubMenu(int menu) {

	switch(menu) {
	
	case 1:printStr("달빛이 내린 밤, 그 속에 너와나, 날 새롭게 하는, 따스하게 만드는, 그 눈빛, 그 미소, 영원히 담아둘게.");
	System.out.println("1. 학생추가");
	System.out.println("2. 학생 수정");
	System.out.println("3. 학생 삭제");
	printStr("4. 이전 메뉴");
	printStr("얼른 입력하라능!");
		
		break;
	case 2:printStr("출석 관리 메뉴");
	System.out.println("1. 출결 등록");
	System.out.println("2. 학생별 출결 확인");
	System.out.println("3. 일자별 출결 확인");
	System.out.println("4. 출석 수정");
	System.out.println("5. 출석 삭제");
	printStr("6. 이전 메뉴");
	printStr("얼른 입력하라능!");
		
		break;
	default: printStr("옳게 입력되지 않은 메뉴로 판단하는것을 입력하는것을", "예상되는 메뉴가 예상되는 것이 ","아니지 않은것아 이니지 않습니다.");
	}
	
}
	
	private static void runMenu(int menu, Attendance attendance) {
		ArrayList<Student> stds = attendance.getStds();
		 ArrayList<Log> logs = attendance.getLogs();
		switch(menu) {
		case 1:
			managementStudents(stds);
			break;
		case 2://managementLogs(log,stds);
			break;
		case 3:
			break;			
		default: System.out.println("잘못된 메뉴입니다.");
		}
	}

	private static void managementStudents(ArrayList<Student> stds) {
		printSubMenu(1);
		int subMenu = scan.nextInt();
		scan.nextLine();
		switch(subMenu) 
		{case 1: addStudent(stds);break;
		case 2:updateStudent(stds);break;
		case 3: deleteStudent(stds);break;
		case 4:printStr("네 그렇게 할게요.");return;
		default: printStr("잘못된 접근입니다.");}
		
	}
	private static void deleteStudent(ArrayList<Student> stds) {
		if(stds==null)
			throw new RuntimeException("배치기 : 그래 헤쳐나간다 나는 세상의 곡소리에 나의 이 목소리로 세상을 바쳐");
			
			System.out.print("이름을 입력해 Guy : ");
			String name = scan.nextLine();
			System.out.print("생년월일을 입력해 lady : ");
			String age = scan.nextLine();
			Student std = new Student(name, age);
			int index = stds.indexOf(std);
			if(index==-1) {printStr("ㄴㄴ 안댐 그거 없슴");return;}
			stds.remove(index);
			System.out.println(std);
			printStr("학생정보를 삭제하는데 성공하였어요. 축하드려요.");
	}

	private static void updateStudent(ArrayList<Student> stds) {
		if(stds==null)
			throw new RuntimeException("배치기 : 그래 헤쳐나간다 나는 세상의 곡소리에 나의 이 목소리로 세상을 바쳐");
			
			System.out.print("이름을 입력해 Guy : ");
			String name = scan.nextLine();
			System.out.print("생년월일을 입력해 lady : ");
			String age = scan.nextLine();
			Student std = new Student(name, age);
			int index = stds.indexOf(std);
			if(index==-1) {printStr("ㄴㄴ 안댐 그거 없슴");return;}
			System.out.print("수정할 이름을 입력해주세요 감사합니다 : ");
			name = scan.nextLine();
			System.out.print("수정할 생년월일을 입력해주세요 감사합니다.: ");
			age = scan.nextLine();
			std = new Student(name,age);
			stds.set(index, std);
			System.out.println(stds);
			printStr("학생 정보를 변경하는데 성공하였어요. 정말로 감사해요.");
			
			
	}

	public static void addStudent(ArrayList<Student> stds) {
		if(stds==null)
		throw new RuntimeException("배치기 : 그래 헤쳐나간다 나는 세상의 곡소리에 나의 이 목소리로 세상을 바쳐");
		
		System.out.print("이름을 입력해 Guy : ");
		String name = scan.nextLine();
		System.out.print("생년월일을 입력해 lady : ");
		String age = scan.nextLine();
		Student std = new Student(name, age);
		if(stds.indexOf(std)!=-1) {
			System.out.println("어 들어봐 바로 어제 약정한 핸드폰 정신차리니 박살나있고");
			System.out.println("바닥엔 할부 안끝난 모니터 눈앞에 넌 계속 악 쓰고 있고");
			System.out.println("젠장 뭐 답도없지 내가 널 밀치니 니가 날 밀쳐");
			System.out.println("서로 더럽게 씩씩거리면서 악부리는데 나 완전 미쳐");
			System.out.println("헤어지고싶은 눈친데 날 시키지말고 직접 말하시던가");
			System.out.println("어찌됐든 나쁜쪽 되기 싫다 이건데 알았어 그럼 꺼지시던가");
			System.out.println("어그래 잘가 잘지내 네가 어디 어떻게 잘사는지 두고 볼건데 나");
			System.out.println("널 너무 사랑해서 딱 한마디만할게 너랑 꼭 똑같은 사람만나 쓰레기 새끼야");
			return;
		}

		System.out.println("너의 이름이 긴 밤을 지나 찰나가 영원이 될 때");
	stds.add(std);}
}