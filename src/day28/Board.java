package day28;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class Board {

	private String title, content,wirter, category;
	private Date regDate, upDate;
	private int views;
	private int num;
	private static int count=0;
	
	public Board(String title, String content, String wirter, String category) {
		this.title = title;
		this.content = content;
		this.wirter = wirter;
		this.category=category;
		this.num = ++count;
		this.regDate=new Date();
	}
	
	public Board(int num) {
		this.num=num;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	
	public String getRegDate() {
		if(regDate==null)return"";
		SimpleDateFormat df = new SimpleDateFormat ("yyyy-mm-dd hh:mm:ss");
		return df.format(regDate);
		
	}
	public String getUpDate() {
		if(upDate==null)return"";
		SimpleDateFormat df = new SimpleDateFormat ("yyyy-mm-dd hh:mm:ss");
		return df.format(upDate);
	}
	
	public void update(String title, String contents) {
		this.title=title;
		this.content=contents;
		this.upDate=new Date();
				
	}
	
	
}
