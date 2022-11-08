package day12;

import java.util.Scanner;

public class StudentManagerTest {
	/* 1. 프로그램에 필요한 기능을 정리
	 *  메뉴
	 *  1. 학생 정보 추가
	 *  2. 학생 성적 추가
	 *  3. 학생 정보 출력
	 *  4. 프로그램 종료.
	 * 
	 * 2. 프로그램 실행 과정은 어떻게 할 것인지
	 *	기능
	 *	1. 학생정보 추가
	 *		-학년, 반, 번호, 이름을 입력하여 학생의 정보를 추가함
	 *		-학년, 반, 번호가 같은 학생이 이미 있으면 추가하지 않음
	 *
	 *	2. 학생 성적 추가
	 *		-학년, 반, 번호로 학생을 검색한 후 있으면 성적을 추가
	 *		-성적 추가시 과목명, 학기, 중간, 기말, 수행 평가를 입력하여 성적 정보 추가
	 *		-이미 추가된 과목(학기 = 과목)이면 추가하지 않음
	 * 
	 * 	3. 학생 정보 출력
	 *  
	 * 3. 정보를 효율적으로 관리하기 위해 클래스를 만들것인가? 만든다면 어떤 클래스를 만들 것인지?
	 * 		- 학생클래스 HighStudent
	 * 		- 성적클래스 Score
	 * 
	 * 4. 프로그램 실행 과정 주석으로 작성 
	 * 
	 * 	
	 * */
	public static void main(String[] args) {
		
int menu;
int count=0;
HighStudent std[] = new HighStudent[5];
do {

	
		
		// 프로그램 실행시 메뉴출력
		/*  1. 학생 정보 추가
		 *  2. 학생 성적 추가
		 *  3. 학생 정보 출력
		   4. 프로그램 종료.*/
		printMenu("1. 학생 정보 추가",
				 "2. 학생 성적 추가",
				 "3. 학생 정보 출력",
				 "4. 프로그램 종료.");
		
		//메뉴선택
		menu = selectMenu();
		//항목별 실행
		runMenu(menu, std, count );}while(menu!=4);
		
		
		
		
		
	}
	
	private static void runMenu(int menu, HighStudent []std, int count) {
		switch(menu) {
		case 1: setStdProfile(std, count);
			break;
		case 2:	System.out.println("학생성적 추가 프로그램 생성");
			break;
		case 3: printStdProfile(std);
			break;
		case 4: System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 접근입니다.");
		}
		
	}

	private static void printStdProfile(HighStudent[] std) {
		if(std!=null) {
		
		for(int i=0; i<std.length; i++) {
		System.out.println(std[i]);
		}}
	}

	private static HighStudent setStdProfile(HighStudent []std, int count) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("입력을 원하는 학생의 학년을 입력하세요. : ");
		int grade = scan.nextInt();
		System.out.println();
		System.out.print("입력을 원하는 학생의 반을 입력하세요. : ");
		int classNum = scan.nextInt();
		System.out.println();

		System.out.print("입력을 원하는 학생의 번호를 입력하세요. : ");
		int stdNum = scan.nextInt();
		System.out.println();

		System.out.print("입력을 원하는 학생의 이름을 입력하세요. : ");
		String name = scan.next();
		System.out.println();
		return std[count] = new HighStudent(grade, classNum, stdNum, name);
		
		
			
	}

	private static int selectMenu() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static void printMenu(String ...str) {
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
	}

	
	
}
