package mine;

import java.util.Scanner;

public class UsefulMethod {

	//주어진 범위의 시그마 계산
	public static int sum(int start, int end) {

		
		int sum=0;
		for(int i=start; i<=end; i++) {
			sum+=i;
		}
		return sum;
	}
	
	//주어진 배열을 출력
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
	//지정된 범위의 난수 생성
	public static int random(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);}
	
	//지정된 범위와 크기의 랜덤한 배열을 생성
	public static int[] createRandomArray2(int min, int max, int size) {
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*(max-min+1)+min);
		}
		
		return arr;	

}

	// 주어진 배열에 지정된 범위의 난수를 저장
	public static void createRandomArray(int arr[], int min, int max) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*(max-min+1)+min);
		}
	}
	//배열에 특정 수가 있으면 true를 반환
	public static boolean contains(int arr[], int num) {
		
		int i=0;
		for(;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;}
								}				
	return false;
													}

	/**
	 * 기능 : Scanner가 주어지면 정수를 size개 만큼 입력받아 배열에 저장하고,
	 * 			저장된 배열을 돌려주는 메소드
	 * 매개변수 : Scanner, size => scanner scan, int size;
	 * 리턴타입 : 정수 배열 => int []
	 * 매소드명 : scanArray
	 * @param scan Scanner
	 * @param size 입력받을 정수의 개수
	 * @return 입력받은 값들이 저장된 배열
	 * */
	public static int[] scanArray(Scanner scan, int size) {
		if(size <=0) {
			return null;
		}
		int [] arr = new int[size];
		for(int i = 0; i< size; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
}