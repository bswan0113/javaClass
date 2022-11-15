package day17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private String title, content, writter;
	private int views, num;
	private Date date;
	private static int count=0;
	
	public Board(String title2, String content2) {
		title=title2;
		content=content2;
	}
	
	public Board(String title, String content, String writter) {
		this.title = title;
		this.content = content;
		this.writter = writter;
		date = new Date();
		count++;
		num=count;
	}
	
	
	public Board(int num2) {
		num=num2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			// obj가 integer로 클래스 변환이 가능하면 게시글 번호와 obj를 비교
			if(obj instanceof Integer) {if(num==(Integer)obj) return true;}return false;}
		Board other = (Board) obj;
		if (num != other.num)
			return false;
		return true;
	}

	public String getDate() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
		return format.format(date);
		}
	@Override
	public String toString() {
		return num + "\t" + title + "  " + writter + "  " +views + "  " + getDate();
	}
	
	public String print() {
		return "게시글번호 : 00000" + num+
				"\n제목 : "+title +
				"\n작성자 : " + writter+ 
				"\n날짜 : "+getDate()+
				"\n조회수 : " + views +
				"\n내용 : " +content +"\n\n";
	}

	public void updateViews() {
		this.views++;
		
	}
	
	
}
