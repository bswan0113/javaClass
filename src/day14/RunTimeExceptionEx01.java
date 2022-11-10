package day14;

public class RunTimeExceptionEx01 {

	public static void main(String[] args) {
		//RuntimeException은 코드상 에러 표시가 안나고, 실행 시 예외가 발생할 수 있음
		//예외처리가 필수가 아님
//		ArithmeticException 발생 case
//		int num1=1, num2 =0;
//		System.out.println(num1/num2);
//		System.out.println(num1%num2);
//		
//		NullPointException : null참조변수로 객체 멤버 참조 시도시 발생
//		Parent a = null;		
//		exceptionTest(a);
//		
//		NegativeArraySizeException : 배열의 크기가 음수
//		int arr[] = new int[-1];
//		
//		ArrayIndexOutOfBoundsException 접근할 수 없는 배열의 번지에 접근을 시도
//		int[]arr2 = new int[5];
//		arr2[5] =5;
//
//	ClassCastException : 강제 클래스 변환이 불가능한 경우
//	Parent p = new Parent();
//	Child c = (Child)p;
	
	}

	public static void exceptionTest(Parent a) {
		a.print();
	}
}

class Parent{
	private int num;
	public void print() {
		System.out.println(num);
	}
}

class Child extends Parent{}