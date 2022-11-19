package accountBook;

import java.util.ArrayList;
import java.util.Objects;



public class Account {
	private boolean come;
	private String category;
	private String content;
	private int price;
	Date date = new Date();
	static int count = 0;
	int serialNum;
	
	{
		count++;
		serialNum=count;
	}
	
	public Account() {
		
	}
	
public int setDay() {return this.date.getDay();}
public int setMonth() {return this.date.getMonth();}
public int setYear() {return this.date.getYear();}

	public Account(int come, String category, String content, int price, Date date) {
		if(come==1){this.come=true;}
		else if(come==2) {this.come=false;}
		this.category = category;
		this.content = content;
		this.price = price;
		this.date = date;
	}


	public void copy(ArrayList<Account> account, int i) {
		Account ac = new Account();
		ac =account.get(i);
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			if(!( obj instanceof Integer)) {
				return false;
			}
			return date.equals(obj);
		}
		Account other = (Account) obj;
		return Objects.equals(date, other.date);
	}

	@Override
	public String toString() {
		return ""+date + "\ncategory : " + category + "\ncontent : " + content + "\nprice : " + price;
	}

	public boolean isCome() {
		return come;
	}

	public void setCome(boolean come) {
		this.come = come;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}




	
	
}