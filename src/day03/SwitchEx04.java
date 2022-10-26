package day03;

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
		// 월을 입력받아 해당하는 월의 마지막 일을 출력하는 코드를 작성하세요.
		// 31 : 1 3 5 7 8 10 12
		// 30 : 4 6 9 11
		// 28 : 2 (윤달 제외)
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Input a month which you want to know");
		int month = scan.nextInt();
		
		switch(month) {
		
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month + "월은 31일까지 있습니다.");
		break;
		
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
		break;
		
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
		break;
		
		default:
			System.out.println("You entered an incorrect value.");	
		
				
		}
	scan.close();

	}

}