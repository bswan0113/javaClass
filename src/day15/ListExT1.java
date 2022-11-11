package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListExT1 {
	public static void main(String []args ) {
		int menu=-1;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> todoList = new ArrayList<String>();
		
		do {
			//메뉴출력
			printMenu();
			//메뉴선택
			try {
			menu = scan.nextInt();
			runMenu(todoList,menu);
			//선택한 메뉴실행
			
			}catch(InputMismatchException e) {	System.out.println("------------------------");
			System.out.println("에러발생: 에베벱베베베: 정수를 입력하세요.");
			System.out.println("------------------------");
			scan.nextLine();}
				catch(Exception e) {
			
				System.out.println("------------------------");
				System.out.println(e.getMessage());
				System.out.println("------------------------");
				scan.nextLine();
			}
		}while(menu!=4);
		
	}

	private static void runMenu(ArrayList<String> todoList, int menu) throws Exception {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1:
			//할 일을 입력(공백 포함해서 입력)
			//리스트에 입력된 할 일을 추가
			System.out.print("업무 추가 : ");
			String todo = scan.nextLine();
			todoList.add(todo);

			break;
		case 2:
			printToDoList(todoList);
		
		
			break;
			
		case 3: //할 일 확인
			printToDoList(todoList);
				//삭제할 할 일 번호를 입력
			int index = scan.nextInt() -1;
			if(index<0 || index>=todoList.size()) {
				throw new Exception("예외발생 : 삭제할 번호를 잘못 입력했습니다.");
			}
				//입력한 번호에 맞는 할 일을 삭제
			todoList.remove(index);
			break;
		case 4:System.out.println("프로그램 종료.");
			break;
			default:
				throw new Exception("예외처리됩니다.");
		}
		
	}



	private static void printToDoList(ArrayList<String> todoList) {
		if(todoList == null || todoList.size()==0) {
			 System.out.println("할 일이 없슴다.");
			 return;
		}
		for(int i=0; i<todoList.size();i++) {
			System.out.println(i+1 +". " + todoList.get(i));
		}		
	}

	private static void printMenu() {
		System.out.print("메뉴\n1.할일 추가\n2.할일 확인\n3.업무 삭제 \n4.종료\n메뉴 선택 : ");		
	}
}
