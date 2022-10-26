package day03;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		// 정수 num이 홀수인지 짝수인지 판별하라
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num +"은 짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
scan.close();
	}

}
