package day12;

import java.util.Scanner;

public class StudentManagerT {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//반복
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
			}
			else if(menu == 2) {
				System.out.println("2. 성적 정보 추가기능 구현 예정");
			}
			else if(menu == 3) {
				System.out.println("3. 학생 정보 출력 기능 구현 예정");
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
