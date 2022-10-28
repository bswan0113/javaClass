package day05;

import java.util.Scanner;

public class ForUpDownEx02 {

	public static void main(String[] args) {
		/* 랜덤한 정수를 맞추는 up down 게임
		 * up down게임의 재 시도
		 * 
		 * 더 하시겠습니까? (y/n)
		 * n 프로그램을 종료합니다.
		 * */
		Scanner scan = new Scanner(System.in);
		int min =1;
		int max =100;
		int r = (int)(Math.random()*(max-min+1)-min);
		int Ans = min-1;
		char replay = 'a';

//		for(;replay!='n';) {
//			
//			r = (int)(Math.random()*(max-min+1)-min);
//			Ans= min-1;
//		for(;Ans!=r;) {
//			System.out.println("1~100사이의 수를 입력해주세요.");
//			System.out.println(r);
//			Ans = scan.nextInt();
//			if(r==Ans) {
//				System.out.println("정답입니다.");
//				
//				System.out.println("게임을 더 하시겠습니까? (y/n): ");
//				replay =scan.next().charAt(0);
//			}
//			else if(r>Ans) {
//				System.out.println("UP");
//			}
//			else if(r<Ans) {
//				System.out.println("DOWN");
//			}
//			
//			
//			
//			
//		}
//		}
//		System.out.println("시스템을 종료합니다.");
//		
	int num;
		for(;;) {
			r = (int)(Math.random()*(max-min+1)-min);
			System.out.println("숫자를 입력하세요. : ");
			System.out.println(r);
			num=min-1;
		
		for(;r!=num;) {
			
			System.out.println("숫자를 입력하세요.");
		num = scan.nextInt();
			
			if( num == r) {
				System.out.println("정답입니다.");
			}
			else if (num>r) {
				System.out.println("Down");
			}
			else {
				System.out.println("Up");
			}
			System.out.println("더하시겠습니까?(y/n) : ");
			if(scan.next().charAt(0) == 'n') {
				break;
			
			}
		}}
		
		}
	}
		
	

