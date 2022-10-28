package day05;

import java.util.Scanner;

public class ForUpDownEx01 {

	public static void main(String[] args) {
		/* 랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하시오.
		 * 
		 * 1~100 사이의 랜덤한 수를 맞추세요.
		 * 
		 * 50 Up
		 * 75 down
		 *
		 *랜덤한 수 생성
		 *무작위수 맞추기
		 *
		 *반복횟수 : 맞출때까지 => 랜덤수 r과 입력한 수가 일치하지 않을때까지
		 *규칙성 :
		 *	1. 숫자를 입력하세요.
		 *	2. 정수를 입력
		 *	3. 입력받은 정수가 r과 같으면 정답이라고 출력,  r보다 크면 down, r보다 작으면 up이라 출력
		 * */
		
	Scanner scan = new Scanner(System.in);
		int max =1 ;
		int min =100;
		int r = (int)(Math.random()*(max-min+1) + min);
		
		System.out.println(r);
		System.out.println("1~100사이의 수를 입력해주세요. : ");
		int correct=scan.nextInt();
		for(;;) {
			
			if(correct==r) {
				System.out.println("정답입니다.");
				break;
			}
			else if (correct>r){
				System.out.println("DOWN");
				correct=scan.nextInt();
			}
			else if (correct<r){
				System.out.println("UP");
				correct=scan.nextInt();
			}
		}
		
		
		

		
		scan.close();
	//Teacher Ver.
//		
//		int min =1;
//		int max=100;
//		int r = (int)(Math.random()*(max-min+1) + min);
//		System.out.println(r);
//		int num = min -1;
		//변수를 새로 쓰여지는걸 생각해서 임의의 정수를 설정해도 됨
//		Scanner scan= new Scanner(System.in);
//		
//		for(;r!=num;) {
//			System.out.println("숫자를 입력하세요. : ");
//			num=scan.nextInt();
//			if( num == r) {
//				System.out.println("정답입니다.");
//			}
//			else if (num>r) {
//				System.out.println("Down");
//			}
//			else {
//				System.out.println("Up");
//			}
//		}
//	
//		scan.close();
	}

}
