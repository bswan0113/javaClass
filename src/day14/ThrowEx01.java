package day14;

public class ThrowEx01 {

	public static void main(String[] args) {
		/*throws : 메소드가 실행되었을때 발생할 수 있는 예외를 표시하여줌. ,를 통해 추가 가능
		 * 			RuntimeException과 자식 예외 클래스들은 생략 가능
		 * 			그 외의 예외 클래스들은 생략 불가
		 * 
		 * throw : 조건에 따라 의도적으로 예외를 발생시킴
		 * 			예외 객체를 던져줌 => throw를 통해 예외가 발생하면 메소드를 빠져나옴
		 * */
//		System.out.println(mod(4, 0));
		
		try {
		throwTest();
		}catch(Exception e) {
			System.out.println("예외 발생");
		}

	}
	public static int mod(int num1, int num2) throws ArithmeticException,RuntimeException {
		return num1%num2;
	}
	
	public static void throwTest() throws Exception {
		throw new Exception();
	}
}