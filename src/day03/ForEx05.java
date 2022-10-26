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
			System.out.println(1 + "부터" + i + "의 합은" + sum );
		} // 시그마
		
		System.out.println(sum);

		
		//Teacher Ver.
		
		int j, Sum;
		for(j=1, Sum=0; j<=10; j++) {
			Sum=Sum+j;
		
		}
		System.out.println("1부터 10까지의 합은" + Sum + " 입니다.");
	}

}
