package day04;

public class ForPrimeNumberEx01 {

	public static void main(String[] args) {
		// 정수 num이 소수인지 아닌지 판별하는 코드를 작성하세요.
		// 반복횟수 : i는 1부터 num까지 1씩 증가
		// 규칙성 : i가 num의 약수이면 count(약수의갯수)의 갯수를 1증가
		// 반복문 종료후 count가 2이면 소수라고 출력, 2보다 크면 합성수라고 출력
		
//		int num=8317;
//		int i;
//		
//		
//		for(i=2; i<=num; i++) {
//			if(num%i==0) {
//				if(i==num) {
//					System.out.println("소수가 맞습니다.");
//				}
//				else {
//					System.out.println("소수가 아닙니다.");
//					break;
//				}
//			}
		
		//Teacher Ver.
		int num = 101273;
		int i;
		int count=0;
		
		for(i=1, count=0;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if (count ==2 ) {
			
			System.out.println("소수입니다.");
		}
		
		else{
			System.out.println("소수가 아닙니다.");
		}
		
		
		

	}

}
