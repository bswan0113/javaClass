package bookManager;

import java.util.ArrayList;
import java.util.Scanner;




public class Library {
	ArrayList<Book> list = new ArrayList<Book>();
	BookManagement manage = new BookManagementImp();
	Scanner scan;

	public void run() {
		
		System.out.println("도서관리 프로그램을 실행합니다.");
		int menu=-1;
		do {
			manage.printMenu();
			menu=scan.nextInt();
			manage.runMenu(list, menu, scan);
			
			
			
		}while(menu!=4);
		System.out.println("도서관리 프로그램을 종료합니다.");

	}



	public Library(Scanner scan) {
		if(scan == null) {
			this.scan = new Scanner(System.in);
		}else {
			this.scan = scan;
		}	}


}
