package day03;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("입력하시오.");
//		
//		char ch;
//		ch=scan.next().charAt(0);
//		
//		if (ch == '+' || ch == '*'|| ch == '/'|| ch == '-'|| ch == '%') {
//			System.out.println(ch + "는 산술 연산자입니다.");
//		}
//		else {
//			System.out.println(ch + "는 산술연산자가 아닙니다.");
//		}
//		 switch문으로 변경	
			char ch;
			ch=scan.next().charAt(0);
			switch(ch) {
			case '+', '-', '*', '/', '%':
				System.out.println(ch + "는 산술 연산자입니다.");
			break;
			default:
				System.out.println(ch + "는 산술 연산자가 아닙니다.");
				
			}
		
		scan.close();

	}

}
