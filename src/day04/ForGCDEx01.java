package day04;

public class ForGCDEx01 {

	public static void main(String[] args) {
		//Greatest Common Divisor
		// 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		//반복횟수 : i는 1부터 num1까지 1씩 증가
		// 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 GCD에 i를 저장
		// 반복문 종료후 GCD를 출력
		
//		int num1 = 12;
//		int num2 = 18;
//		int i;
//		
//		
//		for(i=1; i<= num2 || i<=num1; i++) {
//			if(num1%i==0 && num2%i==0) {
//				
//			}
//			}
//		
//	
//	
	int num1 = 12, num2 = 18;
	int i, gcd = 1;
	
	for(i =1; i <=num1 || i<=num2; i++) {
		if(num1%i==0 && num2%i==0) {
			gcd = i; // i가 num1과 num2의 약수이다.
		}
	}
		
		System.out.println(gcd);
	
			
		
		
	}

}
