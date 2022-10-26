package day03;

public class ForEx04 {

	public static void main(String[] args) {
		// 1부터 10 사이의 짝수를 출력하는 코드를 작성하시오.
		// ex) 2 4 6 8 10....
		
		
		int Even;
		
		for(Even=2; Even <= 10; Even++) {
			if(Even%2 == 0) {
				System.out.print(Even + " ");
			}
				
		}
		System.out.println();

		//Teacher Ver.
		// case1 : 반복횟수 i는 1부터 5까지 1씩 증가
		// 규칙성 : 2*i를 출력
		// case2 : i는 2부터 10까지 2씩 증가
		// 규칙성 : i를 출력
		// case3 : i는 1부터 10까지 1씩 증가
		// 규칙성 : i가 짝수이면 i를 출력
		
		int i;
		for(i=1;i<=5;i++) {
			System.out.print(i*2 + " ");
		}
		System.out.println();
		for(i=1; 2*i<=10;i++) {
			System.out.print(i*2 + " ");
		}
		
		System.out.println();
		for(i=2; i<=10; i+=2) {
			System.out.print(i + " ");
		}
			

	}

}
