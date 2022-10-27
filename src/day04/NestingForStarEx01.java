package day04;

public class NestingForStarEx01 {

	public static void main(String[] args) {
		/*  5x5 사각형을 출력
		 * 
		 * 
		 * 
		 * */
		int i=0;
		int j;
		
		for(; i <5; i++) {
			System.out.println();
			for(j=0; j<5; j++) {
				System.out.print('*');
			}

	}
		System.out.println();
		for(i=0; i <8; i++) {
			System.out.println();
			for(j=0; j<8; j++) {
				System.out.print('*');
			}

	}
		System.out.println();
		System.out.println();
		// teacher Ver.
		int cols, row;
		for(row=1; row <=5; row++) {
			System.out.println("*****");
		}
		System.out.println();
		System.out.println();
		
		for(row=1; row <=5; row++) {
			for(cols=1; cols<=5; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
