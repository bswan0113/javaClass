package day03;

public class ForEx05 {

	public static void main(String[] args) {
		/* 1부터 10까지의 합을 구하는 코드를 작성하시오.
		 * 
		 * */
		
		int i = 1;
		int sum=0;
		

		for(i=1; i<=10; i++) {
			sum +=i;
		} // 시그마
		
		System.out.println(sum);

	}

}
