package mine;

public class Arrycopy {

	public static void main(String[] args) {
		//배열 얕은 복사 => 하나의 배열을 함께 참조, 배열의 주소값 만을 복사
		// 배열의 깊은 복사 => 새로운 배열을 생성하여 기존 배열의 데이터를 복사
		// System.arraycopy(arr1,0,arr2,0,arr1.length);
		// Arrays.copyOf(arr1, arr1.length);
		// arr2 = arr1.clone();
		
		int arr1[] = new int[4];

				int arr2[];

				arr2 = arr1;
				
				arr2[0] = 4; 
				
				System.out.println(arr1[0]); // arr1[0]이 같이 변경
				
				
				//배열의 깊은 복사
	}

}
