package exampleShopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingProgram {

	private List<Product> productList = new ArrayList<Product>();
	private ProductController pc = new ProductController(productList);
	private List<Sales> salesList = new ArrayList<Sales>();
	private SalesController sc = new SalesController(salesList, productList);
	private Scanner scan = new Scanner(System.in);
	
	public void run() {
		int menu=-1;
		final int exit = 7;
		do {
			
			try{printMenu();
			menu=inputInt();
			exeMenu(menu);}
			catch(Exception e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			}
		}while(menu!=exit);
		
	}
	private void exeMenu(int menu) {
		switch(menu) {
		case 1: pc.insertProduct();
				System.out.println(productList);
			break;
		case 2:	pc.updateProduct();
			break;
		case 3: pc.deleteProduct();
			break;
		case 4:	sc.buy();
			break;
		case 5:	sc.sell();
			break;
		case 6: sc.print();
			break;
		case 7:
			break;
		default:
			
		}
		
	}
	private int inputInt() {
		int goodgoodgoodgood = scan.nextInt();
		scan.nextLine();
		return goodgoodgoodgood;
	}
	private void printMenu() {
		System.out.println("=======메뉴=======");
		System.out.println("1. 제품 등록");
		System.out.println("2. 제품 수정");
		System.out.println("3. 제품 삭제");
		System.out.println("4. 제품 구매");
		System.out.println("5. 제품 판매");
		System.out.println("6. 매출액 확인");
		System.out.println("7. 프로그램 종료");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
		
	}

}
