package note;

public class clone {

	public static void main(String[] args) {
		int arr[] = new int[4];
		for(int i=0; i<arr.length;i++) {
			arr[i]=i;
		}
		int arr1[] = arr.clone();
		int arr2[] = arr;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		arr1[0]=10;
		arr1[1]=5;
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr2[i]+" ");
		
		}
		
		arr[1]=11;
		arr2[0]=5;
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr2[i]+" ");
		
		}
		
		
		
		
		
	}

}
