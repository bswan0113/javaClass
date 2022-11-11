package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx01 {

	public static void main(String[] args) {
		/*메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 종료
		 * 메뉴 선택:
		 * 
		 * */
		ArrayList<String> todoList = new ArrayList<String>();
		int menu;
		do {
		printMenu();
		menu = selectint();
		runMenu(menu,todoList);}while(menu!=4);
	}

	private static void runMenu(int menu, ArrayList<String> todoList) {
		switch(menu) {
		case 1: addToDo(todoList);
			break;
		case 2:	System.out.print("오늘의 할일 : \n");
				printToDO(todoList);
			break;
		case 3: removeToDo(todoList);
			break;
		case 4: System.out.println("시스템을 종료합니다.");
			break;
			default:System.out.println("입력값이 잘못되었습니다.");
		}
		
	}

	private static void removeToDo(ArrayList<String> todoList) {
		if(todoList == null || todoList.size()==0) {
			 System.out.println("할 일이 없슴다.");
			 return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 업무를 선택하세요.");
		printToDO(todoList);
		System.out.print("삭제할 업무 번호 입력 : ");
		int select = scan.nextInt();
		System.out.println("정말 "+ todoList.get(select-1)+"를 삭제하시겠습니까? 'Y'또는 'y'를 입력하면 삭제 됩니다.");
		String yes = scan.next();
		if(yes.equals("y") || yes.equals("Y")) 
		{System.out.println(todoList.get(select-1) +" 가 삭제되었습니다.");
		todoList.remove(select-1);}
		System.out.println("남은 업무 목록 : ");
		printToDO(todoList);
		

	}

	private static void printToDO(ArrayList<String> todoList) {
		if(todoList == null || todoList.size()==0) {
			 System.out.println("할 일이 없슴다.");
			 return;
		}
		for(int i=0;i<todoList.size();i++) {
			System.out.print( (i+1)+". "+ todoList.get(i) +  "\n");
		}
			
		
		
	}

	private static void addToDo(ArrayList<String> todoList) {
		String todo;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 종료를 원하면 'N'을 입력해주세요.");
		do {
		
		System.out.print("업무 추가 : ");
		todo=scan.nextLine();
		if( !(todo.equals("N"))){todoList.add(todo);}
				
		else if(todo.contains("N")) break;
		}while(true);
		

		}
		
		
		
	

	private static int selectint() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
	}

	private static void printMenu() {
		System.out.print("메뉴\n1.할일 추가\n2.할일 확인\n3.할 일 삭제 \n4.종료\n메뉴 선택 : ");
		
	}


}
