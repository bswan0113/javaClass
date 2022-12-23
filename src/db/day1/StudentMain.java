package db.day1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {

	static Scanner scan = new Scanner(System.in);
	static StudentDB stdDB;
	static ArrayList<Student1> list = new ArrayList<Student1>();
	public static void main(String[] args) {
	     String url = "jdbc:mysql://localhost/university"; 
	        String id = "root";
	        String pw = "root";
	        
	        
	        try {
				stdDB = new StudentDB(url, id, pw);
			}catch (Exception e) {
				System.out.println("치명적인 오류가 발생했습니다. 해당 컴퓨터는 10초후 폭발합니다.");
				return;
			}
	        System.out.println("프로그램 시작");
	        int menu=111111111;
	        load();
	        do {
	        	printMenu();
	        	menu=scan.nextInt();scan.nextLine();
	        	runMenu(menu);
	        	
	        }while(menu!=3);
	}
	private static void load() {
		
		try {
			list=stdDB.selectStudent();
		} catch (SQLException e) {
			System.out.println("로딩에 실패했습니다 폭파합니다.");
			list = new ArrayList<Student1>();
		}		
	}
	private static void runMenu(int menu) {
		 switch(menu) {
	        case 1: printStudentList();
	        	break;
	        case 2: insertStudent();
	        	break;
	        case 3: System.out.println("시스템을 종료합니다.");
	        	break;
	        default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	        }		
	}
	private static void insertStudent() {
		System.out.println("학번 : ");
		String st_num = scan.nextLine();
		System.out.println("이름 : ");
		String st_name = scan.nextLine();
		System.out.println("학기 : ");
		int semester= scan.nextInt();scan.nextLine();
		System.out.println("학적 : ");
		String st_state = scan.nextLine();
		System.out.println("담당교수 : ");
		String st_pr_num = scan.nextLine();
		try {
			stdDB.insertStudent(st_num, st_name, semester, st_state, st_pr_num);
			Student1 std = new Student1(st_num, st_name, semester, st_state, st_pr_num);
			list.add(std);
			Collections.sort(list,(o1,o2)->{
				return o1.getSt_num().compareTo(o2.getSt_num());
			});
		} catch (SQLException e) {
			System.out.println("몰라 폭발 쾅");
		}
		
	}
	private static void printStudentList() {
		if(list.size()==0)System.out.println("잘못되었습니다. 폭발합니다.");
		for(Student1 std : list) {
			System.out.println(std);
		}
		
	}
	private static void printMenu() {
		System.out.println("안녕하세요. 학생등록 및 학생 조회 프로그램을 시작합니다. \n이 프로그램은 서기 1989년 제작되어 현재는 앙리 푸앵카레의 정리를 통한 우주의 비밀을 찾아 헤메이고 있으며 본질적이고 기초적인 기능이 물론 고작 학생을 조회하고 추가하는것뿐일지라할지라도 그 토대와\n 근간에 버티고 있는것은 생명체의 무궁한 진화를 위한 대들보가 될것임에 틀림이 없는것임을 이 프로그램의 사용자는 한명도 빠짐없이 숙지해야합니다. "
				+ "먼저 이 시스템의 종료를 원한다면 콘솔창에 숫자 3과 엔터를 입력하십시오. 그것은 이 프로그램의 종료를 도와줄것입니다. 그리고 만약 학생정보의 조회를 원한다면 1번을 입력하세요. 마지막으로 학생정보를 추가하고싶다면 1과 3사이에 존재하는 양의 정수를 입력하세요.");
	}

}
