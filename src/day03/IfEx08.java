package day03;

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {
		//점수를 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		// A : 90 ~ 100
		// B : 80 ~ 89
		// C : 70 ~ 79
		// D : 60 ~ 69
		// F : 0~ 59
		// 잘못된 성적 : 그외 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, input your score.");
//		int score = scan.nextInt();
//		
//		if(score >=90 && score <= 100) {
//			System.out.println("your grade is A. Congratulation!");
//			
//		}
//		
//		else if (score >=80 && score <= 89) {
//			System.out.println("your grade is B");
//			
//		}
//		else if (score >=70 && score <= 79) {
//			System.out.println("your grade is C");
//			
//		}
//		else if (score >=60 && score <= 69) {
//			System.out.println("your grade is D");
//			
//		}
//		else if (score >=0 && score <= 59) {
//			System.out.println("your grade is F, you failed.");
//			
//		}
//		else {
//			System.out.println("Error occured. you inputed with wrong way. please try again.");
//		}
//		
		int score = scan.nextInt();
		
		if(score > 100 || score <0 ) {
			System.out.println("Error occured. you inputed with wrong way. please try again.");}
		
		else if(score >=90) {
			System.out.println("your grade is A. Congratulation!");
			
		}
		
		else if (score >=80) {
			System.out.println("your grade is B");
			
		}
		else if (score >=70) {
			System.out.println("your grade is C");
			
		}
		else if (score >=60) {
			System.out.println("your grade is D");
			
		}
		else  {
			System.out.println("your grade is F, you failed.");
			
		}
		
		

		
scan.close();
	}

}
