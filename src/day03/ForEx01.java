package day03;

public class ForEx01 {

	public static void main(String[] args) {
		/* for( 1.초기화; 2.5.8조건식; 4.7증감식){
		 * 		3.6.실행문;
		 * } 9. for문탈출
		 * 
		 * 1. 초기화 : 조건식 또는 실행문에서 사용하는 변수를 초기화,
		 * 				for문 시작시 한번만 실행되며, 생략이 가능함.
		 * 2. 조건식 : 거짓이면 반복문을 종료, 참이면 반복문을 실행함.
		 * 				생략이 가능, 생략하면 무조건 참으로 인식이 됨.
		 * 4. 증감식 : 조건식에서 사용하는 변수를 증가/감소시켜서 반복문의 시행 횟수를 결정함.
		 * 				생략이 가능함 	
		 * 		-초기화 + 조건식 + 증감식 => 반복 횟수를 결정할 수 있음.
		 * 		-실행문 : 규칙적인 작업.
		 * */
		
		int i=1;
		for(i = 1; i<=5; i++) {
			System.out.println("Hello World!");
		}

	}

}
