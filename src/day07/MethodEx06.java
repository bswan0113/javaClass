package day07;

public class MethodEx06 {

	public static void main(String[] args) {
		int [] arr = { 1, 3, 5} ;
		test(arr);
		for (int tmp : arr) {
			System.out.print(tmp + "  ");
		}

	}

	public static void test(int[]arr) {
		arr = new int[3]; // 이 코드에 의해 main method의 arr가 영향을 받지 않음
		// main과 공유하던 배열을 끊고 새 배열을 만들어서 사용
		arr[0] = 10;
	}
}
