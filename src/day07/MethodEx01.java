package day07;

public class MethodEx01 {

	public static void main(String[] args) {
		
		
		/* 클래스
		 * 	- 멤버변수
		 * 		- 클래스의 속성
		 * 	- 멤버 메소드
		 * 		- 클래스의 기능
		 * 	- 생성자
		 * 		- 객체 생성 초기화
		 *  생성자 : 멤버 변수들의 값들을 초기화 할 때 사용
		 *  
		 *  //기본생성자
		 *  public 클래스명(){
		 *  	초기화;
		 *  }
		 *  
		 *  생성자
		 *  public 클래스명(자료형 변수명, 자료형 변수명, ...){
		 *  	초기화;
		 *  }
		 *  
		 *  복사 생성자
		 *  public 클래스명( 클래스명 객체명) {
		 *  	초기화;
		 *  }
		 *  
		 *  메소드 : 기능
		 *  접근제한자 예약어 리턴타입 메소드명 ( 매개변수들){
		 *  구현;
		 *  }
		 *  메소드 : 자판기
		 *  리턴타입 : 음료수 // 기능이 실행되었을때 돌려주어야 하는 정보의 자료형
		 *  매개변수 : 돈, 메뉴 // 기능이 실행되기 위해 필요한 정보들(필수)
		 *  
		 *  메소드 호출
		 *  메소드명(매개변수or값)
		 * */
		int num1=1, num2=5;
System.out.println(sum1(num1,num2));
sum2(3,4);
	}
	/* 메소드 생성위치 : 클래스 내부
	 * 메소드 생성시 순서
	 *  - 기능정의 : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드
	 *  - 매개변수 : 두 정수 => int num1, int num2
	 *  - 리턴타입 : 두 정수의 합 => 정수 => int
	 *  - 메소드명 : sum1
	 * */
	
	public static int sum1(int num1, int num2) {
		return num1 + num2;
	}
	
	
	/* 메소드 생성위치 : 클래스 내부
	 * 메소드 생성시 순서
	 *  - 기능정의 : 두 정수가 주어지면 두 정수의 합을 출력하는 메소드
	 *  - 매개변수 : 두 정수 => int num1, int num2
	 *  - 리턴타입 : 두 정수의 합 => 정수 => int 없음 => void
	 *  - 메소드명 : sum2
	 * */
	
	public static void sum2(int num1, int num2) {
		System.out.println(num1+num2);
		return;
		//여기선 return 필요 x but void에서 필요할 수 있음
	}
	/*접근제한자 예약어 리턴타입 메소드명 ( 매개변수들){
		 *  구현;
		 *  }
	*/

	
	
}
