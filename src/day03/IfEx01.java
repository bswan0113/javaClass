package day03;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		/*
		 * ~하면 ...한다
		 * ~: 조건식
		 * ... : 실행문
		 * if (조건식) {
		 * 	실행문;}
		 * */
		//정수 num이 0보다 크면 양수라고 출력하는 코드를 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해주세요.");
		
		int num = scan.nextInt();
		if(num>0) {
			System.out.println(num +"은 양수입니다.");
		}
		if (num==0) {
			System.out.println("0입니다.");
		}
		if (num<0) {
			System.out.println(num +"은 음수입니다.");
		}
		
		scan.close();
		
		
	}

}
