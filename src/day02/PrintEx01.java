package day02;

public class PrintEx01 {

	public static void main(String[] args) {
		/* println() : -> 원하는 값을 출력한 후 \n, 괄호 안의 값을 생략가능
		 * print() : -> 원하는 값을 출력, 괄호 안의 값을 생략할 수 없음
		 * 
		 * 문자열 + 정수 => 문자열
		 * 정수 + 문자열 => 문자열
		 * 문자 + 문자열 => 문자열
		 * 
		 */
		


		
		String name = "홍길동";
		int age = 20;
		System.out.print(name + "의 나이는 " + age + "살 입니다." + "\n");
		
		int num1 = 10;
		int num2 = 20;
		char operator = '+';
			
		System.out.print(""+num1 + operator + num2+  "\n");

		
	}

}

