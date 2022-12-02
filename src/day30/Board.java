package day30;


import lombok.Data;

/*
 * 필드 : 게시글 번호, 제목, 내용, 작성자
 * 게시글 번호는 게시글 등록할 때 입력
 * -getter/setter
 * -toString : 번호, 제목, 작성자 순으로 출력
 * -equals/hashCode : 게시글 번호를 이용
 * -print() : 게시글 번호, 제목, 작성자, 순으로 콘솔에 출력하는 메소드
 * -생성자
 * 	-생성자(번호): 번호를 이용하여 게시글 생성
 * 	-생성자(번호, 제목, 내용, 작성자) : 번호, 제목, 내용, 작성자를 이용하여 게시글 객체 생성
 * */

@Data
public class Board {
	private int boardNum;
	private String author, title, contents;

	@Override
	public String toString() {
		return "00000"+boardNum +". 제목 : "+ title +" 작성자 : "+author;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			if(obj instanceof Integer) {
				if(boardNum==(int)obj) return true;}
			return false;}
		Board other = (Board) obj;
		if (boardNum != other.boardNum)
			return false;
		return true;
	}

	void print() {
		System.out.println(toString()+"\n\n"+this.contents);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardNum;
		return result;
	}

	public Board(int boardNum, String title, String contents, String author) {
		this.boardNum = boardNum;
		this.author = author;
		this.title = title;
		this.contents = contents;
		
	}

	public Board(int boardNum) {
		this.boardNum = boardNum;
	}

	
}
