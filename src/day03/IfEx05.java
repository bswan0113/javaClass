package day03;

import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {
		//정수 num이 2의 배수이면 2의 배수라고 출력하고
		// 3의 배수이면 3의 배수라고 출력하고
		// 6의 배수이면 6의 배수라고 출력하고
		// 2, 3, 6 의 배수가 아니라면 아니라고 출력하는 코드 작성
		// 단, 6의 배수는 6의 배수라고만 출력
		
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		if (num % 2 == 0 && num % 3 != 0) {
			System.out.println(num + "은 2의 배수입니다.");
		}
		else if (num %3 ==0 && num% 2 != 0) {
			System.out.println(num + "은 3의 배수입니다.");
			
		}
		else if(num % 3 == 0 && num %2 ==0){
			System.out.println(num + "은 6의 배수입니다.");
		}
		else {
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		}
			
		scan.close();
		
		
		
		//teacher Ver.
		
		//case.01
		if (num%2==0 && num%3 != 0) {
			System.out.println(num + "는 2의 배수");
		
	}
		else if (num%3==0  && num%2 !=0 ) {
		System.out.println(num + "는 3의 배수");
		
}
		else if(num%6==0) {
	System.out.println(num + "는 6의 배수");
	
}
		else {
	System.out.println(num + "은 2,3,6의 배수가 아님");
	
}
		//case.02
		if(num%6==0) {
			System.out.println(num + "는 6의 배수");
			
		}
		else if (num%3==0) {
			System.out.println(num + "는 3의 배수");
			
		}
		else if (num%2==0) {
			System.out.println(num + "는 2의 배수");
			
		}
		else {
			System.out.println(num + "은 2,3,6의 배수가 아님");
			
		}
	
	}
}
