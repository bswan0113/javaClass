package day02;

import java.util.Scanner;

public class OperatorEx07 {

	public static void main(String[] args) {
		/*조건선택 연산자
		 * - 조건식 ? 참일떄 : 거짓일떄 ;
		 * 
		 * */
		//주어진 성적이 60점이상이면 pass 거짓이면 failed 출력되도록 코드작성
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력해주세요.");
		int score = scan.nextInt();
		
		String result = score >= 60 ? "pass" : "fail";
		System.out.printf("%d점은 %s입니다.",score, result);
			
scan.close();
	}
}
