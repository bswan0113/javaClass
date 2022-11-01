package day07;

public class MethodArrayEx02 {
	/* 1에서 9사이의 랜덤한 수를 배열에 3개 저장하는 코드를 작성하시오.
	 * 
	 * */
	public static void main(String[] args) {
		
		int min =1, max=9;
		int arr1[]=new int[3];
		int size = 3;

createRandomArray(arr1, min, max);
printArray(arr1);
int arr2[] = createRandomArray2(min, max, size);
printArray(arr2);

//		for(int tmp : randomArray(3,1,9)) {
//			System.out.print(tmp+" ");
//		}
		System.out.println(random(1,100));
	}
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
	/* 기능 : 지정된 두 숫자 사이의 랜덤한 정수를 size개 추출 하여 지정된 배열에 저장
	*  매개변수 : 추출할 갯수, 지정할 두 정수 =>int size, int start, int end;
	*  리턴타입 : int arr[];
	*  매소드명 : randomArray();
	*/

	public static int[] randomArray(int size, int start, int end) {
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=random(start,end);
				
		}
				return arr;
	

}
/*	기능 : 최소값과 최대값 사이의 랜덤한 수를 주어진 배열에 저장하는 메소드
 * 	매개변수 : 최소값, 최대값, 배열 => int arr[], int min, int max;
 * 	리턴타입 : void // 배열은 참조 변수 => 리턴값이 없어도 설정된 메서드에서 값이 저장됨
 * 	매소드명 : createRandomArray;
 * */
	public static void createRandomArray(int arr[], int min, int max) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=random(min,max);
		}
	}
	
/*	기능 : 최소값과 최대값사이의 랜덤한 수를 size개 만들어 배열에 저장한 후 저장된 배열을 반환하는 메소드
 *  매개변수 : 최소값, 최대값, 만들 갯수 => int min, int max, int size;
 *  리턴타입 : 랜덤한 수가 저장된 배열 => int[]
 *  매소드명 : createRandomArray2
* */
	public static int[] createRandomArray2(int min, int max, int size) {
	int arr[] = new int[size];
	for(int i=0; i<arr.length; i++) {
		arr[i]=random(min,max);
	}
	
	
	return arr;	
	}

/*	기능 : 최소값과 최대값 사이의 랜덤한 수를 생성하여 알려주는 메소드
 * 	매개변수 : 최소값, 최대값 => int min, int max;
 * 	리턴타입 : 랜덤한 정수 => int;
 * 	메소드명 : random
 * 
 * */

	public static int random(int min, int max) {
	return (int)(Math.random()*(max-min+1)+min);
}

}
	