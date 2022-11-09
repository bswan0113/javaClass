package day13;

import java.util.Scanner;

public class StudentManagerT {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//반복
		Student [] stds  = new Student[30];
		int count = 0;
		for(;;) {
			//메뉴출력
			System.out.println("메뉴");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 성적 추가");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			//메뉴선택
			int menu = scan.nextInt();
			//선택한 메뉴에 따른 기능 실행
			if(menu == 1) {
				System.out.println("1. 학생 정보 추가기능 구현 예정");
				//1. 학생 정보 추가
				//학생 정보를 입력(학년, 반, 번호, 이름)
				System.out.println("추가할 학생 정보 입력");
				System.out.print("학년 : ");
				int grade = scan.nextInt();
				System.out.print("반 : ");
				int classNum = scan.nextInt();
				System.out.print("번호 : ");
				int num =scan.nextInt();
				System.out.print("이름 : ");
				String name = scan.next();
				int index = -1;
				Student tmp = new Student(grade, classNum, num, name);
				for(int i = 0 ; i<count; i++) {
					if(stds[i].equals(tmp)) {
						index=i; // 일치하는 학생의 위치(번지)
					}
				}
				if(index ==-1 && count < stds.length) {
					stds[count]=tmp;
					}
				count++;
				
			}
			
			//입력한 학생 정보가 없으면 추가
			//학생 정보들 중에서 하나씩 비교하여 학년, 반, 번호가 같은 학생이 있는지 확인해서
			//없으면 마지막 학생 뒤에 추가
		
			else if(menu == 2) {
				System.out.println("성적 추가할 학생 정보 입력");
				System.out.print("학년 : ");
				int grade = scan.nextInt();
				System.out.print("반 : ");
				int classNum = scan.nextInt();
				System.out.print("번호 : ");
				int num =scan.nextInt();
				System.out.println(grade + "학년 " + classNum + "반 " + num + " 번");
				int index = -1;
				Student tmp = new Student(grade, classNum, num);
				for(int i = 0 ; i<count; i++) {
					if(stds[i].equals(tmp)) {
						index=i; // 일치하는 학생의 위치(번지)
					}
				}
				if(index ==-1) {
					continue;
				
			}
			
				System.out.println("성적 정보를 입력하세요.");
				System.out.print("과목 : ");
				String title = scan.next();
				System.out.print("학기 : ");
				int term = scan.nextInt();
				System.out.print("중간 : ");
				int midScore = scan.nextInt();
				System.out.print("기말 : ");
				int finalScore=scan.nextInt();
				System.out.print("수행평가 : ");
				int perfomance = scan.nextInt();
								
				//입력한 성적 정보가 없으면 추가
				//선택한 학생의 성적 정보들 중에서 과목, 학기가 같은 성적 정보가 없으면 추가
			boolean res = stds[index].addScore(new Score(title, term, midScore, finalScore, perfomance));
			if(res) {	
				System.out.println("성적을 등록했습니다.");
			}
			else {
				System.out.println("성적 등록에 실패했습니다.");
			}
			stds[index].printScore();
			
			
			}
			else if(menu == 3) {
				for(int i=0; i<count; i++) {
					System.out.println(stds[i]);
				}
				
				
			}
			else if(menu == 4) {
				System.out.println("프로그램 종료");
			break;}
			else {
				System.out.println("잘못된 선택입니다.");
			}
			//1.학생정보 추가
				//학생정보 입력(학년, 반, 번호, 이름)
				//입력한 학생 정보가 없으면 추가
			//2. 학생 성적 추가
				//학생 정보를 입력(학년, 반, 번호)
				//입력한 학생 정보가 없으면 끝
				//성적 정보를 입력(과목, 학기, 중간, 기말, 수행평가
			//3. 학생 정보 출력
				//저장된 학생 정보를 출력
		}
	}

}
