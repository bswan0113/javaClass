package day14;

public class TryCatchEx01 {

	public static void main(String[] args) {
		/* try{예외가 발생할 수 있는 코드}
		 * catch(예외클래스1 e){예외처리;}
		 * catch(예외클래스2 e){예외처리;}
		 * finally{ 실행문;}
		 * 
		 * -try, catch는 필수, catch는 1개 이상
		 * -catch가 여러개인경우 위에 있는 예외 클래스는 아래 클래스의 조상 클래스가 오면 안됨
		 * 	ex) 예외클래스 1에 RuntimeException, 예외클래스2에 ArithmeticException이 오는 경우
		 * -finally는 기술유무선택가능, 다중기술불가능	
		 * */
		
		exception();
	}

	public static void exception() {
		try {System.out.println(1/0);}
		catch(ArithmeticException e){System.out.println("0으로 나누지 마세요");return;}
		catch(RuntimeException e){System.out.println("예외가 발생했어요.");}
		finally {System.out.println("메소드 종료 뿅");} // return문이 있어서 메소드를 바로 빠져나간다해도 finally는 출력이 됨
		System.out.println("안녕 디지몬.");//return문으로 인해 메소드가 바로 종료가 되었기때문에 실행이 되지 않음
	}
}
