package day07;

public class MethodArrayEx04 {
// 배열에 정수 num이 있는지 없는지 확인하는 메서드
	public static void main(String[] args) {
	
		
		int arr[]=createRandomArray2(1, 30, 10);
		
		boolean a = checkArray(arr,10);
		System.out.println(a);
		printArray(arr);
		
		int [] arr2 = {1,3,5,7,9};
		
		int num = 3;
		if(contains(arr2,num)) {
			System.out.println(num + "는 배열에 있습니다.");
		}
		else {
			System.out.println(num + "는 배열에 없습니다.");
		}
		
	}

	/* 기능 : 주어진 배열에 정수 num이 있는지 확인하여 참or거짓을 확인하여 돌려줌
	*  매개변수 : 주어진 배열, 주어진 정수 => int arr[], int num;
	*  리턴타입 : 참 or 거짓
	*  매소드명 : checkArray;
	*/
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static boolean checkArray(int arr[], int num) {
		
			int i=0;
			for(;i<arr.length;i++) {
				if(arr[i]==num) {
					return true;}
									}				
		return false;
														}
	/* 기능 : 배열에 정수 num이 있는지 없는지 알려주는 메소드
	*  매개변수 : 배열, 정수 => int []arr, int num;
	*  리턴타입 : 있는지 없는지 => boolean;
	*  매소드명 : contains
	*/
	public static boolean contains(int[]arr, int num) {
		for(int tmp : arr) {
			if (num == tmp){
				return true;
			}
		}
		return false;
		
	}
	
	
	public static int[] createRandomArray2(int min, int max, int size) {
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=random(min,max);
		}
		
		
		return arr;	
		}
	
	public static int random(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
}
