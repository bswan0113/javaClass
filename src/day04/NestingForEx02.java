package day04;

public class NestingForEx02 {

	public static void main(String[] args) {
		// 2부터 100사이의 소수를 출력
		//반복횟수 : nu을 2부터 100까지 1씩 증가
		//규칙성 : num이 소수이면 num을 출력
		// 반복횟수 : i는 1부터 num까지 1씩 증가
		// 규칙성 : num을 i로 나누었을때 나머지가 0과 같다면 count++
		// 반복문 종료후 : count가 2이면 num을 출력
		int num=2 ;
		int i;
		int count=0;
	
	for(; num <100; num++) {
		for(i=1, count=0;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if (count ==2 ) {
			
			System.out.print(num+" ");
		}
		}

}
}
