package day03;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// 정수 num이 3의 배수이면 3의 배수라고 출력하고 아니면 3의 배수가 아닙니다를 출력하는
		// 코드 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력하시오.");
		int num =scan.nextInt();
		
		if (num % 3 == 0) {
			System.out.printf("%d는 3의 배수입니다.", num);
		}
		else {
			System.out.printf("%d는 3의 배수가 아닙니다.", num);
				
		}
		
		
		
		
		scan.close();

	}

}
