package day05;

public class DoWhileEx01 {

	public static void main(String[] args) {
		/*		for문, while문 상황에 따라서 한번도 동작하지 않을 수 있다.
		 * 		do while문은 최소 1번은 실행됨.
		 * 		do{
		 * 			실행문;
		 * 			}while(조건식);
		 * */
		// for문 : 순차적으로 증감의 경우에 반복문이 실행되어야 하는경우
		// while문 : 특정값을 입력받아 활용하는 경우, 값이 순차적이지 않는경우
		// 단순 횟수만 사용하면 되는경우
		// => 같은 경우에 사용하면 좋음!
		 int j=1;
		 do {
			 System.out.println("Hello,World!");
			 
		 }while(j>=5);
		
	}

}
