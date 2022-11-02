package day08;

public class MethodOverloading {
/*	메소드 오버로딩 : 동일한 이름을 가진 메소드가 여러개 있는 것
 * 		-매개변수의 개수가 달라야함
 * 		-매개변수의 자료형이 달라야함
 * 			ex)기존에 사용중인 오버로딩의 예시
			System.out.println(1);
			System.out.println("1");
			System.out.println(1.1f);
			System.out.println('1');
			System.out.println(1.0);
 * 	
 * */
	
	
	public static void main(String[] args) {

		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2));
	}

	public static int sum(int num1, int num2) { 
		// 그럼 오버로딩을 할때 매개변수가 계속해서 늘어나야하는 경우에는?
		return num1 + num2 ;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3 ;
	}
	// 리턴타입은 매소드 오버로딩과 관계 없음
	public static double sum(double num1, double num2) { 
		return num1 + num2 ;
	}

}
