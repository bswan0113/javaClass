package day07;

public class MethodEx05 {
//메소드를 활용하여 1부터 10까지 합을 구하는 코드를 작성하시오.
	public static void main(String[] args) {
		int start = 10;
		int end = 1;
		System.out.println(sigma(start,end));
	
		

	}
	/* 기능 : 시작수부터 마지막수까지 1씩 증가하여 마지막수까지의 총합을 구하여 알려줌 
	 * + 시작수와 마지막수의 크기가 바뀔경우 에러가 안나도록 수정
	*  매개변수 : 시작숫자, 마지막 숫자 = > int start, int end;
	*  리턴타입 : 시작숫자와 마지막숫자의 합 => int
	*  매소드명 : sigma
	*/
	
	public static int sigma(int start, int end) {
		int sigma=0;
		
		if(start>end) {
			int j = start;
			start = end;
			end = j;
		}
		for(int i=start; i<=end;i++) {
			sigma+=i;
		}
		
		return sigma;
	}
	
	/* Teacher Ver.
	*  기능 : 시작숫자부터 끝숫자 사이의 모든 정수를 더하고, 더한 결과를 알려주는 메소드
	*  매개변수 : 시작숫자, 끝숫자 => int start, int end
	*  리턴타입 : 더한 결과 => 정수 =>int
	* 
	*  매소드명 :  sum
	*  
	*/
	public static int sum(int start, int end) {

		
		int sum=0;
		for(int i=start; i<=end; i++) {
			sum+=i;
		}
		return sum;
	}

	
}
