package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 하는 코드를 switch문으로 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input two integers and an operator.");

		int num1 = scan.nextInt();
		char oper = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		switch(oper) {
		
		case '+' :
			System.out.println("" + num1 + oper + num2 + "=" + (num1 + num2));
			break; // break 문이 없으면 조건이 맞지 않더라도 다음 실행문까지 연산을 진행함.
		case '-' :
			System.out.println("" + num1 + oper + num2 + "=" + (num1 - num2));
			break;
		case '*' :
			System.out.println("" + num1 + oper + num2 + "=" + (num1 * num2));
			break;
		case '/' :
			System.out.println("" + num1 + oper + num2 + "=" + (num1 / (double)num2));
			break;
		case '%' :
			System.out.println("" + num1 + oper + num2 + "=" + (num1 % num2));
			break;
		default:
			System.out.println("System error occured. cannot operate sequence.");
			
			
			// 여러 경우를 같이 처리하고 싶으면 case 값1, 값2, 값3 : = if (n || m || k)
		}
		
	}

}
