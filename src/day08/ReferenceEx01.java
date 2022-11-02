package day08;

public class ReferenceEx01 {
	
	static String str2;

	public static void main(String[] args) {
		/* 참조변수 => 값이 아닌 주소값을 저장 ex) 변수, 객체, 배열 등;
		 *	//원하는 주소값을 직접적으로 넣을 수 없음
		 *		=> 초기값으로 null(할당되지 않아 값이 없음)이 들어감
		 *		
		 */
		
		String str; //=> 초기화가 자동으로 되지 않음.
		str=null;
		System.out.println(str); // 초기화가 안된 지역변수이기에 에러가 발생
		if(str2 != null)
		System.out.println(str2.charAt(0)); // NullPointException
		//멤버변수는 초기화를 하지 않아도 기본값으로 초기화가 됨
		// 정수 : 0, 실수 : 0.0f, 0.0d char : '\u0000', boolean : false
		// 참조 변수 : null;
	}

}
