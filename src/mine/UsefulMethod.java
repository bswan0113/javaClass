package mine;

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

}