package day05;

public class VariableEx01 {

	public static void main(String[] args) {
		/*변수는 선언된 위체어서 같은 {}내에서 사용이 가능
		 * 
		 * */
		
		int i = 0;
		// 반복문 초기화에서 변수를 선언하면 이미 선언된 변수를 초기화 할 수 없음.
		// ex) for(int j =1, i=5;;) => 오류
		for(int j=1; j<=5; j++) {
			System.out.println(j);
		}
//		System.out.println(j);  => 에러발생, j는 선언된 for문 안에서만 사용가능.

	}

}
