package zboardmanager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Post {
	static int count=0;
	int postNum;
	int views;
	String postTitle;
	String postDate;
	Contents text;
	BoardUser User;	
	Scanner scan = new Scanner(System.in);
	
	
	Date formatDate(String postDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd kk:mm:ss");		
		Date date = format.parse(postDate);
		return date;
	}


}
