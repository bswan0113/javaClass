package exampleShopping;

import java.util.List;
import java.util.Scanner;

public class SalesController {
	private List<Sales> salesList;
	private List<Product> productList;
	private ProductService	ps;
	private SalesService ss;
	
	public SalesController(List<Sales> salesList, List<Product> productList) {
		this.salesList = salesList;
		this.productList = productList;
		ps = new ProductServiceImp();
		ss = new SalesServiceImp();
	}

	public void buy() {
		Sales sales = ss.inputSales();
		Product product = ps.getProduct(productList, sales.getProduct());
		if(product==null)	return;
		sales.setProduct(new Product(product));
		product.addAmount(+sales.getAmount());
		sales.calculate("구매");
		salesList.add(sales);
		
	}

	public void sell() {
		
	}

	public void print() {
		int subMenu=1213;
		final int exit=4;
		Scanner scan = new Scanner(System.in);
		do {
			printSubMenu();
			subMenu=scan.nextInt();
			exePrintMenu(subMenu);
	
		}while(subMenu!=exit);
	}

	private void exePrintMenu(int subMenu) {
	switch(subMenu) {
	case 1: ss.printByYear(salesList);
		break;
	case 2: ss.printByYear(salesList);
		break;
	case 3: ss.printByMonth(salesList);
		break;
	case 4: ss.printByMonth(salesList);
		break;
	case 5: ss.printByDay(salesList);
		break;
	case 6: ss.printByDay(salesList);
		break;
	case 7:return;
		default: System.out.println("잘못된 접근입니다.");
	}
	}

	private void printSubMenu() {
		System.out.println("1. 연 전체매출조회");
		System.out.println("2. 연 항목별 매출조회");
		System.out.println("3. 월별 매출조회");
		System.out.println("4. 월 항목별 매출조회");
		System.out.println("5. 일일 매출조회");
		System.out.println("6. 일 항목별 매출조회");
		System.out.println("7. 이전으로");
	}


}
