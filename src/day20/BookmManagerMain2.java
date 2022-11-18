package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class BookmManagerMain2 {

	static Scanner scan = new Scanner(System.in);
	
	static { System.out.println("시스템을 시작합니다.");}
	
	public static void main(String[] args) {
		int menu=0;
		ArrayList<Book> list = new ArrayList<Book>();
		
		
		do {
		
			printMeun();
			menu=scan.nextInt();
			runMenu(menu, list);
			
		}while(menu!=3);
	}

	private static void runMenu(int menu, ArrayList<Book> list) {
		
		switch(menu) {
		case 1:
			Book newbook=createBook();
			if(!inserBook(list, newbook)) {System.out.println("ISBN이 중복되었어요.");}
			else{System.out.println("추가완료되었어요.");}
			break;			
		case 2:
			printSubmenu();			
			int subMenu = scan.nextInt();
			runSubMenu(subMenu, list);
		case 3:	System.out.println("시스템을 종료합니다.");
		break;
	default: System.out.println("잘못된 메뉴를 선택했습니다.");
	}		
		
		
		
		
	
	}


	public static void printBookList(ArrayList<Book> list, Predicate<Book> p) {
		int count=0;
		
		for(Book tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
				count++;
			}
		
		}
		if(count==0)System.out.println("검색결과가 없음");
	}

	private static void runSubMenu(int subMenu,  ArrayList<Book> list) {
		int count;
		switch(subMenu) {
		
		case 1:
			scan.nextLine();
		System.out.print("\n\n도서명 : ");
		String title = scan.nextLine();
		printBookList(list, (b)->b.getTitle().contains(title.trim()));
		break;
		case 2:
			scan.nextLine();
		System.out.print("\n\n저자명 : ");
		title = scan.nextLine();
		printBookList(list, (b)->b.getAuthor().contains(title.trim()));

			break;
		case 3:
			scan.nextLine();
		System.out.print("\n\n출판사명 : ");
		title = scan.nextLine();
		printBookList(list, (b)->b.getPublisher().contains(title.trim()));
			break;
		case 4:scan.nextLine();
		System.out.print("\n\n분류명 : ");
		title = scan.nextLine();
		printBookList(list, (b)->b.getGenre().contains(title.trim()));
			break;
		case 5: return;
			default:System.out.println("잘못된 메뉴를 선택했습니다.");
		}
		
	
	}



	private static void printSubmenu() {
		System.out.println("\n\n1. 도서명 조회");
		System.out.println("2. 저자명 조회");
		System.out.println("3. 출판사명 조회");
		System.out.println("4. 분류별 조회");
		System.out.println("5. 메인메뉴");		
	}

	private static boolean inserBook(ArrayList<Book> list, Book newbook) {
		if(list.contains(newbook.getIsbn()))return false;
		
		list.add(newbook);
		Collections.sort(list, (o1,o2) -> o1.getIsbn().compareTo(o2.getIsbn()));
			
		return 	true;
	}

	private static Book createBook() {
		scan.nextLine();
		System.out.print("\n\n도서명 : ");
	String	title = scan.nextLine();
		System.out.print("저자명 : ");
		String	author = scan.nextLine();
		System.out.print("출판사명 : ");
		String	publisher = scan.nextLine();
		System.out.print("가격명 : ");
		int	price = scan.nextInt();
		scan.nextLine();
		System.out.print("분류 : ");
		String	genre = scan.nextLine();
		System.out.println("식별분류 : ");
		String		isbn = scan.nextLine();
		
		return new Book(title, author, publisher, genre, isbn, price);	
		
	}

	private static void printMeun() {
		System.out.println("\n\n메뉴");
		System.out.println("1. 도서추가");
		System.out.println("2. 도서조회");
		System.out.println("3. 시스템 종료");
		System.out.println("입력 : ");		
	}


}
