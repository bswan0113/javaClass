package day02;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		/*
		 * next() -> 공백을 제외한 한 단어를 입력받음, 다음 공백이 나오기 전까지 문자열을 가져옵니다.
		 * nextLine() -> 공백(스페이스, 탭)을 포함한 문자열을 가져옵니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 문장을 입력하세요. : ");
		String  str1 = scan.nextLine();
		
		System.out.println("다음 문장을 입력하세요. : ");
		String  str2 = scan.nextLine();
		System.out.println(str1+" "+ str2);
		
		System.out.println("가수를 입력하세요. : ");
		String str3 = scan.next();
		System.out.println(str3);
		
		
		scan.close();

	
	}

}
