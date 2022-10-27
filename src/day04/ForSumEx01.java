package day04;

public class ForSumEx01 {

	public static void main(String[] args) {
// 1부터 10사이 짝수의 합을 구하시오.
		
		int i;
		int sum;
		
		
		for(i=1, sum=0; i<=10;i++) {
			if(i%2==0) {
			sum = sum + i;
			System.out.println("1부터 "+ i + "까지 짝수의 합은" + sum + "입니다." );}
		
		}
		System.out.println();
		for(i=1, sum=0; i<=10;i++) {
			if(i%2==1) {
			sum = sum + i;
			System.out.println("1부터 "+ i + "까지 홀수의 합은" + sum + "입니다." );}
		
		}
		System.out.println();
		for(i=1, sum=0; i<=10;i++) {
			
			sum = sum + i;
			System.out.println("1부터 "+ i + "까지의 합은" + sum + "입니다." );
		
		}
		System.out.println();
		for(i=1, sum=0; i<=10;i++) {
			if(i%3==0) {
			sum = sum + i;
			System.out.println("1부터 "+ i + "까지 3의 배수의 합은" + sum + "입니다." );}
		
		}
		System.out.println();
		for(i=1, sum=0; sum<=100;i++) {
			
			sum = sum + i;
			
		
		}System.out.println("1부터 i까지의 합이 처음으로 100이 되는것은 " +i + "이며 총합은" + sum + "입니다." );
		
		
	}

}
