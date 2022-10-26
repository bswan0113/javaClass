package day03;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		//문자를 입력받아 char에 저장하는 예제
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		System.out.println("문자를 입력하세요.");
		ch = scan.next().charAt(0);
		//charAt(숫자) : 문자열에서 제공하는기능
		//문자열에서 숫자번지에 해당하는 문자를 알려줌. 시작번지는 0부터
		System.out.printf("입력받은 문자는 %c입니다.",ch);
		
		scan.close();
				
	}

}
