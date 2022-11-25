package mine;

import java.util.Vector;

public class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		b.buy(new Audio());
		
		b.summary();
	}

}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(100); // 프로덕트의 생성자 호출
	}
	public String toString() {return "Tv";}
	
}

class Computer extends Product{
	Computer(){super(200);
	}
	
	public String toString() {return "Computer";}
	
}
class Audio extends Product{
	Audio() {super(50);}
	public String toString() {return "Audio";}
	
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
Vector item = new Vector();	
int i=0;
	
	void buy(Product p) {
		if(money <p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p);
		System.out.println(p+" 구입완료");
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		for(int i=0; i<item.size();i++) {
			if(item==null)break;
			itemList+=item.get(i)+", ";
		}
		System.out.println(sum);
		System.out.println(itemList);
		
		
	}
	void refund(Product p) {
		if(item.remove(p)) {
		}
	}
}