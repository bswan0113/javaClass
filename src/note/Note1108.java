package note;

public class Note1108 {
	/*추상 클래스
	 * 
	 * abstract class
	 * 
	 * 추상 메소드를 메소드를 포함한 클래스
	 * 접근제한자 예약어 abstract class; 
	 * 
	 * 추상메소드
	 * {} 없는 메소드, 선언부에 abstract사용
	 * 
	 * 추상 클래스를 상속 받은 일반 클래스는 부모의 추상 메소드를 반드시 오버라이딩 해야함.
	 * 추상 클래스를 상속 받은 추상 클래스는 부모의 추상 메소드를 반드시 오버라이딩 해야하는건 아님.
	 * 상속시 반드시 구현해야하는 오버라이딩이 강제화되는 메소드
	 * 
	 * 
	 * 접근제한자 abstract 반환형 메소드명(자료형 변수명)
	 * 
	 * 추상클래스의 특징
	 * 1. 미완성 클래스 자체적으로 객체 생성 불가 => 반드시 상속하여 객체 생성	 
	 * 2. abstract 메소드가 포함된 클래스는 반드시 abstract 클래스
	 * 	abstract 메소드가 없어도 abstract클래스 선언가능 
	 * 3. 클래스내에 일반변수, 메소드포함가능
	 * 4. 객체 생성은 안되지만 참조형 변수타입으로 사용가능
	 * 
	 *
	 * 장점
	 * 1. 일관된 인터페이스 제공
	 * 2. 꼭 필요한 기능을 강제화
	 * 
	 * 인터페이스
	 * 상수형 필드와 추상 메소드만을 작성할 수 있는 추상클래스의 변형체
	 * 메소드의 통일성을 부여하기 위해 추상 메소드만 따로 모아놓은 것으로
	 * 상속 시 인터페이스내에 정의된 모든 추상메소드를 구현해야함
	 * 		[접근제한자] interface 인터페이스명 {
	 * 			public static final 자료형 변수명 = 초기값
	 * 			//상수도 멤버로 표현할수 있음
	 * 
	 * 			//추상 메소드만 선언 가능
	 * 			[public abstract] 반환자료형 메소드명 ( [ 자료형 매개변수 ] ) ;
	 * 			
	 * 
	 * 인터페이스의 특징
	 * 1. 모든 인터페이스의 메소드는 묵시적으로 public이고 abstract
	 * 2. 변수는 묵시적으로 public static final 따라서 인터페이스 변수의 값 변경 시도시 컴파일에러 발생
	 * 3. 객체생성은 안되나 변수로는 가능
	 * 4. 상위 타입 역할로 다형성을 지원하여 연결
	 * 5. 해당 객체가 다양한 기능 제공시에도 인터페이스에 해당하는 기능만을 사용하게 제한 가능
	 * 6. 공통 기능상의 일관성 제공
	 * 7. 공동 작업을 위한 인터페이스 제공
	 * 8. 구현부가 없기때문에 다중 상속이 가능함
	 * 
	 * */		
	/* 클래스 Object
	 * -모든 클래스의 조상 클래스
	 * -Object클래스에 있는 메소드들을 오버라이딩하여 활용할 수 있음
	 * -ex) equals(Object obj)
	 * 		-Object의 equals는 주소를 비교
	 * 		-오버라이딩을 해서 사용해야함
	 * -ex2) toString()
	 * 		-객체의 정보를 문자열로 변환
	 * 		-오버라이딩해서 필드 정보를 쉽게 확인할 수 있게 함
	 * 
	 * */

}
