package day20;

import java.util.ArrayList;
import java.util.Scanner;

import mine.Arrycopy;

public class BookmManagerMain {

	static Scanner scan = new Scanner(System.in);
	
	static { System.out.println("시스템을 시작합니다.");}
	
	public static void main(String[] args) {
		int menu=0;
		ArrayList<Book> list = new ArrayList<Book>();
		
		
		do {
			System.out.println("\n\n메뉴");
			System.out.println("1. 도서추가");
			System.out.println("2. 도서조회");
			System.out.println("3. 시스템 종료");
			System.out.println("입력 : ");
			menu=scan.nextInt();
			String title, author, publisher, genre, isbn;
			int price;
			switch(menu) {
			case 1:
				scan.nextLine();
				System.out.print("\n\n도서명 : ");
				title = scan.nextLine();
				System.out.print("저자명 : ");
				author = scan.nextLine();
				System.out.print("출판사명 : ");
				publisher = scan.nextLine();
				System.out.print("가격명 : ");
				price = scan.nextInt();
				scan.nextLine();
				System.out.print("분류 : ");
				genre = scan.nextLine();
				System.out.println("식별분류 : ");
				isbn = scan.nextLine();
				Book book = new Book(title, author, publisher, genre, isbn, price);
				if(list.contains(isbn)) {System.out.println("중복되었습니다."); continue;}
				list.add(book);
				
		
				
				
				
				break;
			case 2:
				System.out.println("\n\n1. 도서명 조회");
				System.out.println("2. 저자명 조회");
				System.out.println("3. 출판사명 조회");
				System.out.println("4. 분류별 조회");
				System.out.println("5. 메인메뉴");
				int subMenu = scan.nextInt();
				int count;
				switch(subMenu) {
				case 1:
					scan.nextLine();
				System.out.print("\n\n도서명 : ");
				title = scan.nextLine();
				count=0;
				for(Book tmp : list) {
					if(tmp.getTitle().contains(title)) {
						System.out.println(tmp);
						count++;
					}
				}
				if(count==0)System.out.println("검색결과가 없음");
					break;
				case 2:
					scan.nextLine();
				System.out.print("\n\n저자명 : ");
				title = scan.nextLine();
				count=0;
				for(Book tmp : list) {
					if(tmp.getAuthor().contains(title)) {
						System.out.println(tmp);
						count++;
					}
				}
				if(count==0)System.out.println("검색결과가 없음");
					break;
				case 3:
					scan.nextLine();
				System.out.print("\n\n출판사명 : ");
				title = scan.nextLine();
				count=0;
				for(Book tmp : list) {
					if(tmp.getAuthor().contains(title)) {
						System.out.println(tmp);
						count++;
					}
				}
				if(count==0)System.out.println("검색결과가 없음");
					break;
				case 4:scan.nextLine();
				System.out.print("\n\n분류명 : ");
				title = scan.nextLine();
				count=0;
				for(Book tmp : list) {
					if(tmp.getGenre().contains(title)) {
						System.out.println(tmp);
						count++;
					}
				}
				if(count==0)System.out.println("검색결과가 없음");
					break;
				case 5: return;
					default:
				}
				break;
			case 3:	System.out.println("시스템을 종료합니다.");
				break;
			default: System.out.println("잘못된 메뉴를 선택했습니다.");
			}
			
			
			
			
		}while(menu!=3);
	}

}
