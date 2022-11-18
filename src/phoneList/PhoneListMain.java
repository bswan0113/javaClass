package phoneList;

import java.util.Scanner;



public class PhoneListMain {
	/* 전화번호를 관리하는 프로그램을 작성하세요.
	 * 1. 전화번호 추가(성, 이름, 직장, 전화번호들)
	 * 2. 전화번호 수정
	 * 		- 이름으로 검색(성+이름)
	 * 		- 검색된 사람들중에서 선택
	 * 		- 성, 이름을 수정할건지, 기존 등록된 전화번호를 수정할것인지, 또는 새 전화번호를 추가할 것인지
	 * 3. 전화번호 삭제
	 * 		-이름으로 검색(성+이름)
	 * 		-검색된 사람들중에서 선택
	 * 		-선택된 사람의 연락처를 삭제
	 * 4. 전화번호 조회
	 * 		-전체조회
	 * 		-이름으로 검색
	 * 		-검색된 사람들중에서 선택
	 * 		-선택된 사람의 연락처를 출력
	 * */

	public static void main(String[] args) {

		 PhoneListSystem phone = new  PhoneListSystem(new Scanner(System.in));
		phone.run();
		
		
	}

}
