package day29;

import lombok.Data;

public class Problem03 {

	public static void main(String[] args) {
		
		Board2 board2 = new Board2();
		board2.setTitle("공지사항");
		String search = "공지";
		if(board2.getTitle().contains(search)) {
			System.out.println("제목에 공지가 포함되어 있습니다.");
		}
		else {
			System.out.println("제목에 공지가 포함되어 있지 않습니다.");
		}

	}

}


@Data
class Board2{
	String title, contents;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board2 other = (Board2) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}



	
}