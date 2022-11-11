package accountBook;

public class Detail {
	private boolean come;
	private String category;
	private String content;
	private int price;
	private String date;
	
	
	public Detail(boolean come, String category, String content, int price, String date) {
		this.come = come;
		this.category = category;
		this.content = content;
		this.price = price;
		this.date = date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
