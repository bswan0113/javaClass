package day06;

import java.util.Arrays;

public class ArrayCopyEx02 {

	public static void main(String[] args) {
		// 깊은 복사 예제
		
		System.out.println();

		int arr1[] = new int[] {1,2,3};
		int arr2[];
		
//		// 예제 1
		int tmpArr[] = new int[arr1.length];
		for(int i =0; i<arr1.length; i++) {
			tmpArr[i] =arr1[i];
		}
		arr2 = tmpArr;
		
//		// 예제 2
//		arr2 = new int [arr1.length];
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // 각 요소는 무슨 의미?
//		System.arraycopy(src, srcPos, dest, destPos,length);
		
//		// 예제 3
//		arr2 = Arrays.copyOf(arr1, arr1.length); => 예제1의 for문을 축약
		
//		
		
		// arr1과 arr2값 확인
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"] = " + arr1[i] 
					+ ", " +"arr2["+i+"] = "+ arr2[i]);

		}

		arr1[0] = 10;
		System.out.println("                             ");

		System.out.println("----------------------------");
		System.out.println("                             ");
		for (int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"] = " + arr1[i]
					+ ", " +"arr2["+i+"] = "+ arr2[i]);

		}

	}

}
