package kioskManager;

import lombok.Data;

@Data
public class Goods {
/*필드
 * 제품명, 제품분류
 * 구매가, 판매가
 * */
	
	String name, category;
	int purchase, price;
	int goodsCode;
	static int count=0;
	
	public Goods(String category,String name,  int purchase, int price) {
		this.name = name;
		this.category = category;
		this.purchase = purchase;
		this.price = price;
		goodsCode=count;
		count++;
	}

	@Override
	public String toString() {
		return "제품코드 : "+ goodsCode + " / 분류 : " + category +" / 제품명 : "+ name +"\n구매가/판매가 : " +purchase+"/"+price+"\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (goodsCode != other.goodsCode)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + goodsCode;
		return result;
	}


	
}
