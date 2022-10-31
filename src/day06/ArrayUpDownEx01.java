package day06;

import java.util.Scanner;

public class ArrayUpDownEx01 {

	public static void main(String[] args) {
		// UP down 게임을 무조건 3번 반복해서 맞춘 횟수를 배열에 저장하는 코드를 작성하시오.
//		
//		int min =1;
//		int max=100;
//		
//		
//		int num = min -1;
//		int count=0;
//		int upD[]= new int[3];
//		int cor[] = new int[3];
//		Scanner scan= new Scanner(System.in);
//		
//	for(int i=0;count<3;i++) {
//		int r = (int)(Math.random()*(max-min+1) + min);
//		System.out.println(r);
//		for(int j=1;r!=num;j++) {
//			System.out.println("숫자를 입력하세요. : ");
//			num=scan.nextInt();
//			if( num == r) {
//				System.out.println("정답입니다.");
//				upD[i] = j;
//				cor[i] = num;
//				count++;
//				if(count!=3) {System.out.println("다음 게임을 시작합니다.");}
//							
//				
//				
//				
//			}
//			else if (num>r) {
//				System.out.println("Down");
//			}
//			else {
//				System.out.println("Up");
//			}
//		}
//	
//	}
//	System.out.println("게임을 종료합니다.");
//	
//	for(int i=0; i<3; i++) {
//		System.out.println(i+1+"회차 게임의 시행횟수는 " +upD[i]+"번 이며 정답은 "
//				+ cor[i]+" 입니다.");
//	
//	}
//		
//		scan.close();
		
		int coin = 3;
		int record[] = new int[coin];
		int min = 1;
		int max = 100;
		
		Scanner scan = new Scanner(System.in);
		
		while(coin-- > 0) {
			int r = (int)(Math.random()*(max-min+1)+min);
			System.out.println(r);
			System.out.println(min + " ~ " +max+" 사이의 랜덤한 수를 맞춰보세요.");
			int tryCount = 0;
			int num;
			do {
				
				System.out.print("숫자입력 : ");
				num = scan.nextInt();
				tryCount++;
				if(num==r) 
				{
					System.out.println("정답입니다.");
					record[record.length - coin - 1]=tryCount;}
				else if(r>num){
						System.out.println("UP");
					}
				
				else if (r<num) {
					System.out.println("DOWN");
				}
				
			}while(r!=num);
		}
		
			for (int i=0; i<record.length; i++) {
				System.out.println(i+1 + " 번째 게임 횟수 : " + record[i]);
		
			scan.close();
		}
	}

}
