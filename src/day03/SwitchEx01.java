package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		//	switch(식 또는 변수){
		//	case 값1:
		//	실행문;
		//	break;
		//	case 값2:
		//	실행문;
		//	break;
		//	default:
		//	실행문3;}
		// -case 옆에있는값들은 정수, 문자, 문자열만 올 수있음.
		// 변수명은 올 수 없고 상수만이 올 수 있음.
		// break : -> switch 문을 빠져나가는 역할
		// default -> else와 같음
		// switch문 사용 사례 
		// 1. 식의 값이 제한적인경우 ex) %연산자를 이용하는 경우 
		// 2. 사용하는 변수의 값이 제한적인경우 ex)산술 연산자를 이용한 계산 예제 
		
		int num = 5;
		switch(num % 2) {
		
		case 0:
			System.out.println(num + "는 짝수");
			break;
		
		default:
			System.out.println(num + "는 홀수");
		}
	}

}
