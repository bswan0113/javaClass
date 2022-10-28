package day05;

import java.util.Scanner;

public class WhileCharEx01 {

	public static void main(String[] args) {
		//문자를 입력받아 q이면 종료하고, 아니면 반복하는 코드를 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		
		char q='z';
		
		while(q!='q') {
			System.out.println("문자를 입력해주세요.");
			q = scan.next().charAt(0);

			
		}
		System.out.println("시스템을 종료합니다.");
		
		
		//teacher ver.
		
		char ch;
		while(true) {
			System.out.print("문자를 입력하시오. 종료는(q): ");
			ch = scan.next().charAt(0);
			if( ch == 'q') {
				break;
			}
			
		}
		scan.close();
	}
	

}
