package day05;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		/* 정수 4개짜리 배열을 생성한 후, 4자리 숫자를 입력받아 배열에 저장하는 코드를 작성하시오.
		 * ex)
		 * 1234
		 * 0 :1
		 * 1 : 2
		 * 2: 3
		 * 3: 4
		 * 
		 * 4자리 정수를 입력
		 * */
		/*
		 * 반복횟수 : 4번 =?
		 * num 에서 1의자리를 추출
		 * 추출된 1의 자리를 배열에 저장
		 * =>%10
		 * num에서 1의 자리를 제거하여 num에 저장
		 * => /10
		 * 반복문종료후 배열에 있는 값을 출력
		 * */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("만들고 싶은 배열의 size를 입력하세요.");
	int size = scan.nextInt();
	System.out.println(size + "자리 정수를 입력하세요 : ");
	int num = scan.nextInt();
	
	int arr[] = new int[size]; // size 생각 못함 !
	
	int num2 = num;
	for(int i= size-1;i>=0;i--) {
		arr[i] = num % 10;
		num /= 10;  			}
	for(int tmp : arr) {
		System.out.println(tmp);
	}
	
	int i = size -1;
	while(num2 > 0) {
		arr[i--] = num2 %10;
		num2 = num2 / 10;
	}
	for(int tmp : arr) {
		System.out.println(tmp);
	}
	
		
		scan.close();
	}

}
