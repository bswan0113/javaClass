package mine;

import java.util.Arrays;

public class ccc {

public static void main(String []args) {
	int arr[]= {1,2,3,4,5};
	int arr2[]=new int[5];

	for(int i=0; i<arr.length;i++) {
			
			arr2[i]=arr[i];
			}
	
	
	for(int a : arr2) {
		
		System.out.println(a);
	}
	
	System.out.println(arr);
	System.out.println(arr2);
}

}


