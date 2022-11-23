package attendant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AttendanceMain {

	static Scanner scan = new Scanner(System.in);
	static {System.out.println("시스템을 시작합니다.");}
	
	//메인
	public static void main(String[] args) {
		int menu=-111;
		Attendance attendance = new Attendance();
		
		do {
			try {
			printMenu();
			menu=scan.nextInt();
			scan.nextLine();
			printbar();
			runMenu(menu,attendance);
			}catch(Exception e) {
				System.out.println(e.getMessage());
		
			}
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
		case 2:managementLogs(logs,stds);
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
		default: printStr("잘못된 접근입니다.");	managementStudents(stds);}
		
	}
	private static void deleteStudent(ArrayList<Student> stds) {
		if(stds==null)
			throw new RuntimeException("배치기 : 그래 헤쳐나간다 나는 세상의 곡소리에 나의 이 목소리로 가슴을 적셔");
			
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
	private static void managementLogs(ArrayList<Log> logs, ArrayList<Student> stds) {
		printSubMenu(2);
		int subMenu = scan.nextInt();
		scan.nextLine();
		switch(subMenu) {
		case 1: checkLog(logs, stds); sortLogs(logs);break;
		case 2:printLogsByStudent(logs);
			break;
		case 3:printLogsByDate(logs,stds);break;
		case 4:updateLogs(logs);break;
		case 5:deleteLogs(logs);break;
		case 6:	printStr("네 뒤로 돌아가도록 할게요.");return;
			default:printStr("잘못된 접근으로 사료가 돼요."); managementLogs(logs, stds) ;
		}
	}

	private static void deleteLogs(ArrayList<Log> logs) {
		if(logs==null || logs.size()==0)return;
		System.out.println("수정할 날짜를 입력해주시겠어요?");
		String date = scan.nextLine();
		if(!checkLogDate(logs,date)) {
			printStr("등록되어있지 않은 일자네요. 다시 한번 확인을 부탁드려요.");
			return;
		}
		for(int i=0; i< logs.size(); i++) {
			if(logs.get(i).getDate().equals(date)) {
				logs.remove(i);
				System.out.println("삭제를 완료했어요.");return;
			}
		}
	}

	private static void updateLogs(ArrayList<Log> logs) {
		if(logs==null || logs.size()==0)return;
		System.out.println("수정할 날짜를 입력해주시겠어요?");
		String date = scan.nextLine();
		if(!checkLogDate(logs,date)) {
			printStr("등록되어있지 않은 일자네요. 다시 한번 확인을 부탁드려요.");
			return;
		}
		System.out.println(date + "의 출결내역이에요.");
		for(int i=0; i<logs.size();i++) {
			if(logs.get(i).getDate().equals(date)) {
				System.out.println(logs.get(i));
			}
			
		}
		System.out.println("어떤 학생을 수정하시겠어요?");
		String name = scan.nextLine();
		System.out.println(name + "의 생년월일을 입력해주시겠어요?");
		String birth = scan.nextLine();
		System.out.println(name+"의 출결을 어떻게 변경하실건가요?");
		String state = scan.nextLine();
		printStr();
		for(Log log : logs) {
			if(log.getDate().equals(date)) {
				for(StudentLog slog : log.getSLogs()) {
					String tmpName = slog.getStd().getName();
					String tmpBirth = slog.getStd().getBirthday();
					if(tmpName.equals(name) && tmpBirth.equals(birth)) {
						slog.setState(state);
					}
				}printStr("수정이 완료되었어요."); return;
			}
		}
	
	}

	private static void printLogsByDate(ArrayList<Log> logs, ArrayList<Student> stds) {
		if(logs==null || logs.size()==0)return;
		System.out.println("검색할 날짜를 입력해주시겠어요?");
		String date = scan.nextLine();
		printStr();
		for(Log log : logs) {
			if(log.getDate().equals(date)) {
				for(StudentLog slog : log.getSLogs()) {
					String name = slog.getStd().getName();
					String birth = slog.getStd().getBirthday();
					System.out.println(name + " " + birth + " " + slog.getState());
				}
			}
		}

			}
		
	

	private static void printLogsByStudent(ArrayList<Log> logs) {
		if(logs==null || logs.size()==0)return;
		System.out.println("검색할 이름을 입력해주시겠어요?");
		String name = scan.nextLine();
		for(Log log : logs) {
			for(StudentLog slog : log.getSLogs()) {
				if(slog.getStd().getName().equals(name)) {
					System.out.println(log.getDate()+" : " + slog.getState());
				}
			}
		}
		
	}

	private static void sortLogs(ArrayList<Log> logs) {
		if(logs ==null||logs.size()==0) {System.out.println("선행할 작업이 있을거에요!");return;}
		Collections.sort(logs, (o1,o2)->o1.getDate().compareTo(o2.getDate()));
		
	}

	private static void checkLog(ArrayList<Log> logs, ArrayList<Student> stds) {
		printStr("오늘의 날짜를 입력해주세요.");
		String today = scan.nextLine();
		if(checkLogDate(logs,today)){System.out.println("이미 등록된 날짜라고 생각이 되요.");return;}
		System.out.println("출석여부를 입력해주세요.");
		printStr("결석 : X, 출석 :O , 지각 :/, 조퇴 : \\");
		ArrayList<StudentLog> a = new ArrayList<StudentLog>();
		for(int i=0; i<stds.size();i++) {
			System.out.print(stds.get(i)+" : ");
			String stdToday = scan.nextLine();
			a.add(new StudentLog(stds.get(i),stdToday));
			
		}
		logs.add(new Log(a,today));
		System.out.println(logs);
		
	}

	private static boolean checkLogDate(ArrayList<Log> logs, String today) {
		if(logs==null||today==null) throw new RuntimeException("일지 또는 입력된 날짜가 존재하지 않아요.");
		if(logs.size()==0) {return false;}
		for(int i=0; i<logs.size();i++) {
			if(logs.get(i).getDate().equals(today))return true;
		}
		
		return false;
	}
}