package day02;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받아 정수가 홀수인지 짝수인지 출력하는 코드를 작성하시오.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하시오.");
		int input = scan.nextInt();
		int a = input %2;
		String result = a == 1 ? "홀수" : "짝수";
		
		System.out.printf("%d은/는 %s입니다.\n\n",input,result);

		
		//teacher Ver.
		
		//정수를 입력
		System.out.print("정수를 입력하세요. : ");
		int num = scan.nextInt();
		
		//입력받은 정수가 2로 나누었을 때 나머지가 0과 같은지를 변수에 저장
		boolean isEven = num % 2 == 0 ;
		
		//나머지가 0과 같으면 짝수를, 같지않으면 홀수를 저장.
		String resultT = isEven ? "짝수" : "홀수" ;
		//결과를 출력
		System.out.println(num + "는 " + resultT + "입니다.");
		
		

		if(input-num <=0) {
			System.out.println(input+num);
		}
		else {
		System.out.println(input-num);
		}
		
		scan.close();
	}

}
