package day04;

import java.util.Scanner;

public class ForDivisionEx01 {

	public static void main(String[] args) {
// 정수 num의 약수를 출력하는 코드를 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int num =scan.nextInt();
		int i=1;
		// 1 - 1   2- 1,2 4 - 1,2,4  
		
		for (; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+"  ");
			}
		}
		
		scan.close();
	}

}
