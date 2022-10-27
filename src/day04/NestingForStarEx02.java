package day04;

public class NestingForStarEx02 {

	public static void main(String[] args) {
		/* * row = 1 *=1
		 * ** row = 2 *=2
		 * *** row = 3 *=3
		 * **** row = 4 *=4
		 * ***** row = 5 *=5
		 *  				*=row
		 * 
		 * */
		
		int i;
		int j;
		
		for(i=1; i<=5; i++) {
			for(j=0; j!=i ; j++ ) {
			
			System.out.print("*");
			// j=i에 너무 집착해서 해결하는데 시간이 오래걸림//
		}
			System.out.println();
	}
		
		System.out.println("-----------------------");
	
		for(i=1; i<=5; i++) {
			for(j=0; j<i; j++) {
				System.out.print('*');
			}System.out.println();
			//이게 정답인듯
			// '반복'문 '반복'문 '반복'문
		}
		System.out.println();
		System.out.println("----------------------");
		
		/* 		*
		 * 	   **
		 * 	  ***	
		 *   ****	
		 * 	*****
		 * */
		for(i=1; i<=5; i++) {
			for(j=0; j<=5; j++) {
				if(j>=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		
	}
		
		System.out.println();
		System.out.println("----------------------");
		
		int row, col;
		
	
		//teacher Ver.
		
		for(row =1; row<=5; row++) {
			for (col=1; col <=5-row ; col++){
				System.out.print(" ");
			}
			for(col=1; col<=row; col++) {
				System.out.print("*");
			}System.out.println();
		
	
		}
		
		
		/*    *
		 *   ***
		 *  *****
		 * *******
		 **********
		 * */
		
		System.out.println("-------------------------");
		
		for(row=1; row<=5; row++) {
			for(col=1; col+row<=5; col++ ) {
				System.out.print(" ");
			}
			for(col=1; col<=row; col++ ) {
				System.out.print("*");
			}
			for(col=1; col<=row-1; col++ ) {
				System.out.print("*");
			}System.out.println();
		}// 전체에서 부분으로 나누어서 생각할 수 있어야함
	}	
		
	}

