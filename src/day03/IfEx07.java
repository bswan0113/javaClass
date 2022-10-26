package day03;

import java.util.Scanner;

public class IfEx07 {
	public static void main(String[] args) {
		
//		// 두정수와 문자를 입력받아 산술 연산자이면 산술 연산결과를 출력하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자를 입력해주세요.");
//		int num1 = scan.nextInt();
//
//		System.out.println("두번째 숫자를 입력해주세요.");
//		int num2 = scan.nextInt();
//
//		System.out.println("두 숫자의 연산자를 입력해주세요.");
//		char op = scan.next().charAt(0);
//		
//		if (op == '+') {
//			System.out.println(num1+"과 " + num2 + "의 합은 " + (num1+num2) +"입니다.");
//			
//		}
//		else if(op == '-') {
//			System.out.println(num1+"과 " + num2 + "의 차는 " + (num1-num2) +"입니다.");
//			
//		}
//		else if(op == '*') {
//			System.out.println(num1+"과 " + num2 + "의 곱은 " + (num1*num2) +"입니다.");
//			
//		}
//		else if(op == '/') {
//			double sub = num1/(double)num2;
//			System.out.println(num1+"를 " + num2 + "로 나눈 값은" + (sub) +"입니다.");
//			
//		}
//		else if(op == '%') {
//			System.out.println(num1+"를 " + num2 + "로 나눈 몫의 나머지는 " + (num1%num2) +"입니다.");
//			
//		}
//		
//		else {
//			System.out.println( op + "는 산술 연산자가 아닙니다.");
//		}
//		
//		
//		//teacher Ver.
		
		System.out.println("두 정수와 문자를 입력하세요 (예: 1 + 2) ");
		int num1 = scan.nextInt();
		char ch = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		if (ch =='+') {
		System.out.println("" + num1 + ch + num2 + "=" + (num1+num2));	
		}
		else if(ch == '-') {
			System.out.println("" + num1 + ch + num2 + "=" + (num1-num2));
		}
		else if(ch == '*') {
			System.out.println("" + num1 + ch + num2 + "=" + (num1*num2));
		}
		else if(ch == '/') {
			System.out.println("" + num1 + ch + num2 + "=" + ((double)num1/num2));
		}
		else if(ch == '%') {
			System.out.println("" + num1 + ch + num2 + "=" + (num1%num2));
		}
		else {
			System.out.println(ch + " 는 산술 연산자가 아닙니다.");
		}
		
		
		
		scan.close();
	}
}
