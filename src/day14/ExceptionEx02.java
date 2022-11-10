package day14;

import java.util.Scanner;

public class ExceptionEx02 {

	public static void main(String[] args) throws RuntimeException{
		/* Scanner를 통해 정수를 입력 받아 입력받은 정수를 출력하는 코드를 작성하세요.
		 * 정수 대신 문자열을 입력하면 예외가 발생, 이 예외를 처리하는 코드를 작성하세요.
		 * */
		
		Scanner scan = new Scanner(System.in);		
		
		int num=0;
		try {
			num=scan.nextInt();
			
		}
		catch(Exception hgjgklsjgssdgaaaaaaaaaaaaaaa){
			System.out.println("정수를 입력하세요.");
			
		}
		 

	}

}
