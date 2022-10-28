package day05;

public class DoWhileEx01 {

	public static void main(String[] args) {
		/*		for문, while문 상황에 따라서 한번도 동작하지 않을 수 있다.
		 * 		do while문은 최소 1번은 실행됨.
		 * 		do{
		 * 			실행문;
		 * 			}while(조건식);
		 * */
		 int j=1;
		 do {
			 System.out.println("Hello,World!");
			 j++;
		 }while(j<=5);
		
	}

}
