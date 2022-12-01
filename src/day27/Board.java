package day27;

public class Board {

	String title;
	String contents;
	int boardNum;
	static int count=0;;
	@Override
	public String toString() {
		return boardNum+"번 제목 : " +title+"\n"+contents;
	}
	public Board(String title, String contents) {
		this.title = title;
		this.contents = contents;
		{boardNum =count; count++;}
	}
	public Board() {
	}
	
	
}
