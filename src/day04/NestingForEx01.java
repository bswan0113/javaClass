package day04;

public class NestingForEx01 {

	public static void main(String[] args) {
		/*구구단 3단을 출력하는 코드를 작성하시오.
		 * */
		
		int i;
		int j;
	for(j=2; j<=9; j++) {
		System.out.print("\n");
		for(i=1; i<=9; i++) {
			System.out.println( j +" X " + i + " = " + j*i);
		}
	}

	}

}
