package exampleShopping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class Sales {

	private Product product;
	private int amount, price;
	private Date date;
	private SalesType type;
	public Sales(Product product, int amount, int price, String date, SalesType type) {
		this.product = product;
		this.amount = amount;
		this.price = price;
		SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
		try {
			this.date = f.parse(date);
		} catch (ParseException e) {
System.out.println("날짜 형식이 잘못 입력되었습니다.");
this.date=null;}
		this.type = type;
	}
	public void calculate(String type) {
		if(product==null)	return;
		int price=0;
		if(SalesType.valueOf(type)==SalesType.구매)price=product.getBuyPrice()*amount;
		else if(SalesType.valueOf(type)==SalesType.판매)price=product.getSellPrice()*amount;
		this.price=price;
		
	}
	public String getDateStr() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
		if(date==null)return "";
		return f.format(date);
	}
	
	
}
enum SalesType{
	구매, 판매
}
