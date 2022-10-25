package day02;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//next() -> nextLine() 순으로 연산이 처리되면 next()에서 입력한 값으로 nextLine()까지 처리가 되어버림 
		System.out.println("한 단어를 입력하세요. : ");
		String str2 = scan.next();
		System.out.println(str2);
	
		scan.nextLine(); // 앞에서 입력받은 잔여 문자열과 공백을 제거해줌
		
		System.out.println("한 문장을 입력하세요. : ");
		String str1 = scan.nextLine();
		System.out.println(str1);
		
		

		scan.close();
	}

}
