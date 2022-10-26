package day03;

import java.util.Scanner;

public class IfEx06 {

	public static void main(String[] args) {
		// scanner를 입력받아 +, -, *, /, %이면 산술연산자라고 출력
		// 아니면 산술연산자가 아니라고 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하시오.");
		
		char ch;
		ch=scan.next().charAt(0);
		
		if (ch == '+' || ch == '*'|| ch == '/'|| ch == '-'|| ch == '%') {
			System.out.println(ch + "는 산술 연산자입니다.");
		}
		else {
			System.out.println(ch + "는 산술연산자가 아닙니다.");
		}
			

		scan.close();
	}

}
