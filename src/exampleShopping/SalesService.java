package exampleShopping;

import java.util.List;
import java.util.function.Predicate;

public interface SalesService {


	Sales inputSales(String type);

	Sales inputSales();

	void printByYear(List<Sales> salesList);

	void printByMonth(List<Sales> salesList);

	void printByDay(List<Sales> salesList);
	void printSales(List<Sales> salesList,Predicate<Sales> p);

}
