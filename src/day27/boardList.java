package day27;


import lombok.Data;
@Data
public class boardList {

	Board board = new Board();
	Member member = new Member();
	public boardList(Board board, Member member) {
		this.board = board;
		this.member = member;
	}

	
	
	
}
