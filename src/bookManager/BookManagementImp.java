package bookManager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BookManagementImp implements BookManagement {



	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 도서추가");
		System.out.println("2. 도서조회");
		System.out.println("3. 시스템 종료");
		System.out.println("입력 : ");
		
	}

	@Override
	public void runMenu(ArrayList<Book> list, int menu, Scanner scan) {
		switch(menu) {
		case 1: addBook(list, scan);
			break;
		case 2: subMenu(list, scan);
			break;
		case 3:
			break;
			default:
		}
	}


	public void subMenu(ArrayList<Book> list, Scanner scan) {
		printSubMenu();
		int menu=scan.nextInt();
		selectSubMenu(list,menu ,scan);
		scan.nextLine();
		
	}

	public void selectSubMenu(ArrayList<Book> list,int menu, Scanner scan) {
		
		switch(menu) {
		
		case 1:inquireBook(list,scan);
			break;
		case 2:inquireAuthor(list,scan); 
			break;
		case 3:inquirePublisher(list,scan);
			break;
		case 4:inquireCateogory(list,scan);
			break;
		default:
		}
		
	}



	private void printSubMenu() {
		System.out.println("1. 도서명 조회");
		System.out.println("2. 저자별 조회");
		System.out.println("3. 출판사별 조회");
		System.out.println("4. 분류별 조회");
		
	}

	@Override
	public void addBook(ArrayList<Book> list, Scanner scan) {
		scan.nextLine();
		System.out.print("추가하려는 도서명을 입력해주세요. : ");	
		String bookName= scan.nextLine();
		System.out.print(bookName+ "의 저자를 입력해주세요. : ");
		String author = scan.nextLine();
		System.out.print(bookName+ "의 출판사를 입력해주세요. : ");
		String publisher = scan.nextLine();
		System.out.print(bookName+ "의 분류를 0~9의 숫자로 입력해주세요. : ");
		int category = scan.nextInt();
		scan.nextLine();
		System.out.print(bookName+ "의 가격을 입력해주세요. : ");
		int price = scan.nextInt();
		scan.nextLine();
		
		list.add(new Book(bookName, author, publisher, price, category));

	
	
	}
	@Override
	public void inquireAuthor(ArrayList<Book> list, Scanner scan) {
		System.out.println("검색을 원하는 저자명을 입력해주세요.");
		String author = scan.nextLine();				
		for(int i=0; i<list.size();i++) 
			{if(list.get(i).getAuthor().contains(author.trim())) 
				System.out.println(list.get(i));}
				
		

			}
		
		
	

	@Override
	public void inquireBook(ArrayList<Book> list, Scanner scan) {
		System.out.println("검색을 원하는 도서명을 입력해주세요.");
		String book = scan.nextLine();				
		for(int i=0; i<list.size();i++) 
			{if(list.get(i).getBookName().contains(book.trim())) 
				System.out.println(list.get(i));}		
	}

	@Override
	public void inquirePublisher(ArrayList<Book> list, Scanner scan) {
		System.out.println("검색을 원하는 출판사명을 입력해주세요.");
		String pub = scan.nextLine();				
		for(int i=0; i<list.size();i++) 
			{if(list.get(i).getPublisher().contains(pub.trim())) 
				System.out.println(list.get(i));}		
	}

	@Override
	public void inquireCateogory(ArrayList<Book> list, Scanner scan) {
		System.out.println("검색을 원하는 분류를 입력해주세요.");
		int cat = scan.nextInt();
		Book tmp = new Book(cat);
		for(int i=0; i<list.size();i++){
			if( list.get(i).getCategory().equals(tmp.getCategory())) {
				System.out.println(list.get(i));
			}
		}
		
	}


	

}
