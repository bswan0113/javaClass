package exampleShopping;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class SalesServiceImp implements SalesService {

	Scanner scan= new Scanner(System.in);
	@Override
	public Sales inputSales(String type) {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜 : ");
		String date = scan.nextLine();
		System.out.println("분류 : ");
		String type2 =scan.nextLine();
		System.out.println("제품명 : ");
		String title =scan.nextLine();
		System.out.println("수량 : ");
		int count = scan.nextInt();
		if(count<=0)return null;
		Product product = new Product(type, title, 0, 0);
		Sales sales = new Sales(product, count, 0, date, SalesType.valueOf(type));
		return sales;
	}

	@Override
	public Sales inputSales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printByYear(List<Sales> salesList) {
		System.out.println("연도 : ");
		String year = scan.nextLine();
		printSales(salesList, s->{
			String salesYear = s.getDateStr().substring(0,4);
			return salesYear.equals(year);
		});
		
		
	}


	public void printSales(List<Sales> salesList,Predicate<Sales> p) {
		if(salesList==null||salesList.size()==0) {
			System.out.println("결과가 없습니다");return;
		}
		int count=0;
		for(Sales sales : salesList) {
			if(p.test(sales)) {
				System.out.println(sales);
				count++;
			}
			
		}
		if(count==0)System.out.println("결과 없음");
		
	}

	@Override
	public void printByMonth(List<Sales> salesList) {
		System.out.println("연도 : ");
		String year = scan.nextLine();
		System.out.println("월 : ");
		String month = scan.nextLine();
		String date = year+"-"+month;
		printSales(salesList, s->{
			String salesYear = s.getDateStr().substring(0,7);
			return salesYear.equals(date);
		});
		
	}

	@Override
	public void printByDay(List<Sales> salesList) {
		System.out.println("연도 : ");
		String year = scan.nextLine();
		printSales(salesList, s->{
			String salesYear = s.getDateStr().substring(9,10);
			return salesYear.equals(year);
		});
		
	}

}
