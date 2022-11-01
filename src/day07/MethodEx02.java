package day07;



public class MethodEx02 {


	
	public static void main(String[] args) {
	// 7단을 출력하는 코드를 작성하시오. 단, 메소드를 이용할것	

		int dan = 7;
		
		printMultiTable1(dan);
		System.out.println("-----------------------");
		printMultiTable2(dan,1,9);
		
	}

	
	public static void sevenTimes() {
		
		for(int i=1; i<10; i++) {
			System.out.println("7 X " + i + " = " + 7*i);
		}
		
	}
	
	public static void multiplicationTable() {
		
	for(int j=2; j<10; j++) {
		for(int i=1; i<10; i++) {
			System.out.println(j + " X " + i + " = " + j*i);
		}System.out.println();
		
	}
	
}
	
/* 기능 : 단이 주어지면 해당 하는 단을 콘솔에 출력하는 메소드
 * 매개변수 : 단 => 정수 => int num
 * 리턴타입 : void 
 * 메소드명 : printMultiTable1
 */
	public static void printMultiTable1(int num) {
		for(int i=1; i<10; i++) {
			System.out.println( num + "X " + i + " = " +  num*i);
		}
	}
 
	/* 기능 : 단과 시작정수, 끝정수가 주어지면 
 * 해당 하는 단을 단 x 시작숫자에서 단x 끝숫자까지 콘솔에 출력하는 메소드
 * 매개변수 : 단, 시작정수, 끝 숫자 => int num, int start, int end
 * 리턴타입 : void
 * 리턴타입 : printMultiTable2
 * */
	public static void printMultiTable2(int num, int start, int end) {
		for(int i=start; i<=end; i++) {
			System.out.println(num+" X " + i + " = " + num*i);
		}
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 :  두 정수의 곱 => int 
	 * 메소드명 : multi
	 * 
	 * */
	public static int printMultiTable3(int num1, int num2) {
		return num1*num2;
	}
	
	
}

