package day29;

import lombok.Data;

public class Problem02 {

	public static void main(String[] args) {

		/*아래 코드가 에러가 발생하는 원인과 해결 방안을 설명하시오.
		 * 
		 * 원인 : 매개변수로 정수를 필요로 하는 생성자가 없기때문에 에러가 발생함
		 * 해결방안 : 보이드를 지워줌미다
		 * */
		Board1 board = new Board1(1);
	}

}	
@Data
class Board1{
	int num;
	public Board1(int num) {
		this.num = num;
			
	}
}


