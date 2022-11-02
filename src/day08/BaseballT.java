package day08;

import java.util.Scanner;

public class BaseballT {

	public static void main(String[] args) {
		
		//1. 랜덤으로 3개의 수를 선택
		int min = 1, max=9, size = 3;
		int[]com = createRandomArray(min, max, size);
		
		printArray(com);
		
		// 2. 사용자가 숫자를 선택
		Scanner scan = new Scanner(System.in);
		
		
		//3. 판별
		int strike, ball;
		do {
			System.out.print("\n입력 : ");
		int []user = scanArray(scan, size);
		strike = getStrike(com, user);
		ball = getBall(com, user);
		printGame(strike, ball);
		
		}while(strike<3);
		System.out.println("게임 종료");
		scan.close();

	}
	/**기능 :strike와 ball의 개수가 주어지면 콘솔에 결과를 출력
	 * @param strike 스트라이크의 개수
	 * @param ball 볼의 개수
	 * */
	public static void printGame(int strike, int ball) {
		if(strike !=0) {
			System.out.print(strike +"S ");
		}
		if(ball !=0) {
			System.out.println(ball + "B ");
			
		}
		if(strike==0 && ball==0) {
			System.out.println("OUT");
		}
		
	}
	
	/**
	 * 기능 : 두 배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇개 있는지 
	 * 		 알려주는 메소드
	 * @param arr1 int[] : 첫번째 정수 배열
	 * @param arr2 int[] : 두번째 정수 배열
	 * @return 같은 번지에서 일치하는 숫자들의 개수
	 * */
	public static int getStrike(int []arr1, int []arr2) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		int strike=0;
		for(int i=0; i<size; i++) {
			if(arr1[i]==arr2[i]) {
				strike++;
			}
		}
		return strike;
	}
/**
 * 기능 : 두 정수 배열이 주어지면 같은 숫자들 중에서 번지가 서로 다,른 숫자들의 개수를 
 * 			알려주는 매서드 
 *  @param scan Scanner
  @param size 입력받을 정수의 개수
 @return 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수
 * */	
	public static int getBall(int arr1[] , int []arr2) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int ball=0;
		int strike= getStrike(arr1, arr2);
		for(int num : arr1) {
			if(contains(arr2, num))
				ball++;
		}
	return ball - strike;
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

	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
		// 주어진 배열에 지정된 범위의 난수를 저장
		public static int[] createRandomArray(int min, int max, int size) {
		if(max - min +1<=size) {
			return null;
		}
		int arr[] = new int[size];
		for(int i=0; i<arr.length;) {
			int r=(int)(Math.random()*(max-min+1)+min);
			if(!contains(arr,r)) {
				arr[i]=r;
				i++;
			}
		}
		
		return arr;	

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
		public static int random(int min, int max) {
			return (int)(Math.random()*(max-min+1)+min);}

		public static int countarray(int array[], int user[]) {
			if (array == null || user == null) {
				return 0;
			}
			
			int countarray=0;
	
			for(int tmp : array) {
				if(contains(user, tmp)) {
					countarray++;
				}
			}
			
			
			return countarray;
		}
}
