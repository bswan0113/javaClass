package day06;

import java.util.Scanner;

public class ArrayRandomEx01 {

	public static void main(String[] args) {
		// 랜덤으로 1~9사이의 숫자를 3개 생성하여 배열에 저장하는 코드를 작성하시오.
		
		int max=1;
		int min=9;
		
//		int i;
//		int size=3;
//		int random[] = new int[size];
//		
//		
//		for(i=0;i<size;i++) {
//			int r = (int)(Math.random()*(max-min+1) + min);
//			random[i] = r;
//			System.out.println("랜덤한 수 : " + r);
//			
//			
//		}
		// teacher Ver.
		int arr[] = new int[3];
		
		for (int i = 0; i<3; i++) {
			arr[i] = (int)(Math.random()*(max-min+1) + min);
		
		}
		
		//정수를 입력받아 랜덤한 수에 있는지 없는지 확인 해서 알려주는 코드를 작성
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("임의의 정수를 입력해주세요.");
//		int a = scan.nextInt();
//		int count = 0;
//	
//		for(int i = 0; i<3; i++) {
//			
//			if(a == arr[i]) 
//			{
//				count++;
//			}
//				
//			
//				
//			
//		}
//		if(count==0) {
//			System.out.println("일치하는 정수가 없습니다.");
//		}
//		else {
//			System.out.println(a+ "는 무작위 정수와 일치합니다.");
//		}
//		
//		for (int i = 0; i<3; i++) {
//		System.out.print(arr[i]+" ");}

		//Teacher Ver.
		System.out.println();
		System.out.print("정수를 입력하시오. : ");
		int num = scan.nextInt();
		boolean isDuplicated = false;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==num) {
				isDuplicated = true;
				break;
			}
		}
		
		if(isDuplicated) {
			System.out.println(num + "가 있습니다.");
		}
		else {
			System.out.println(num + "가 없습니다.");
		}

		
		
		
scan.close();
	}

}
