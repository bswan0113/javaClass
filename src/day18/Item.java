package day18;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;
@Data
public class Item {
	private String type, purpose, content;
	private int money;
	private Date date;
	public Item() {}
	public Item(String type, String purpose, String content, int money, String date) throws ParseException {
		this.type = type;
		this.purpose = purpose;
		this.content = content;
		this.money = money;
		setDate(date);
	}
	
	
	public void setDate(String date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.date=format.parse(date);
		
	
		
	}
	
	public String getDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}
	public void print() {
		System.out.println("=================\n구분 : " + type+
							"\n분류 : " + purpose+
							"\n내역 : " +content +
							"\n금액 : " + getMoneyStr()+
							"\n일시 : " + getDateStr()+"\n=================");
	}
	
	public String getMoneyStr() {
		DecimalFormat df = new DecimalFormat("###,###");
		
		return df.format(money);
	}
	@Override
	public String toString() {
		return type +" | " +getDateStr() + " | "+ purpose + " | " + getMoneyStr()  + "원 | " + content;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			if(obj instanceof Date) {if(date==(Date)obj) {return true;} return false;}
		
		Item other = (Item) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (money != other.money)
			return false;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + money;
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	
	
	
}