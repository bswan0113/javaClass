package day04;

public class BreakEx01 {

	public static void main(String[] args) {
		for(int i =0; i<5; i++) {
			System.out.println(i +"번째의 Hello, Wolrd!");
			if(i==3) {
				break;
			}
		}//break;를 만나면 증감식으로 가지않고, 가장 가까운 반복문을 빠져나감.
		// 조건문과 함께 사용해야함.
	}

}
