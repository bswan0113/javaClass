package day03;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		/*	if(조건식1){
		 * 		실행문1;
		 * }	
		 * 	else if(조건식2){
		 * 		실행문2;
		 * }	
		 * 	else{
		 * 실행문3;
		 * }
		 * 
		 * 
		 * if는 반드시 필요하며 1개임.
		 * else if : 0개 이상
		 * else : 0 or 1개
		 * */
		//정수가 양수, 음수, 0인지 판별하는 코드를 작성
	Scanner scan = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해주세요.");
		
		int num = scan.nextInt();
		if(num>0) {
			System.out.println(num +"은 양수입니다.");
		}
			else if (num==0) {
			System.out.println("0입니다.");
		}
			else {
			System.out.println(num +"은 음수입니다.");
		}
		
		scan.close();

	}

}
