package day14;


public class ExceptionEx01 {
/*
 * printStackTrace() : 예외가 발생했을 때 실행된 메소드드들을 차례대로 역순으로 출력
 * 						발생한 예외와 예외 메세지를 함께 출력
 * 
 * getMessage() : 
 * 		-예외가 발생한 이유를 출력, 사용자가 발생시킨 예외라면 생성자에 넘겨준 문자열이 출력
 * */
	
	public static void main(String[] args) {
		try {throwException();}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());}
	}
	
	public static void throwException() throws Exception{
		throw new Exception("디지몬 진화");
	}
}
