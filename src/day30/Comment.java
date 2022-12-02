package day30;

import lombok.Data;

/**/
@Data
public class Comment {
	int commentNum;
	String commmenter, comment;
	int boardNum;
	
	@Override
	public String toString() {
		return commentNum+ "작성자 : "+commmenter +"\n"+comment;
	}
	public Comment(int commentNum, String commmenter, String comment, int boardNum) {
		this.commentNum = commentNum;
		this.commmenter = commmenter;
		this.comment = comment;
		this.boardNum=boardNum;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (commentNum != other.commentNum)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + commentNum;
		return result;
	}
	

}
