package bookManager;

import java.util.Scanner;

public class BookManagerMain {


	
	
	
	
	/*도서관리 프로그램을 작성하세요.
	 * 
	 * 도서 정보 
	 * -도서명, 작가(여러명, 엮은이, 옮긴이 다 포함), 출판사, 가격, 분류, ISBN
	 *
	 * 기능 
	 * -도서추가
	 * 	-ISBN으로 정렬
	 * 
	 * -도서 조회
	 * 	-도서명 조회, 저자 조회, 출판사 조회, 분류 조회
	 * 
	 * */
	public static void main(String[] args) {
		
		 Library library = new Library(new Scanner(System.in));
		library.run();
	

	}

}
