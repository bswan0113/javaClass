package day30;

import java.util.function.Consumer;

public class LamdaEx01 {
	static String fieldStr="필드";
	
	public static void main(String[] args) {
		String str = "main 지역변수";
		Consumer<Object> con;
		con = o ->{
			fieldStr="람다식에서 변경";
			System.out.println(str);
			//str +="kgb"; 지역변수는 람다식에서 상수취급을 받음
		};
		con.accept(" ");
		System.out.println(fieldStr);

	}

}
