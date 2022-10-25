package day02;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요. : ");
		int num = scan.nextInt();
		System.out.println(num + 2);
		System.out.println("실수를 입력하세요 : ");
		double num2 = scan.nextDouble();
		System.out.println(num2*3);
		
		System.out.println("정수 A와 정수 B를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a*b);
		
		scan.close();
		
		
	
		

	}

}
