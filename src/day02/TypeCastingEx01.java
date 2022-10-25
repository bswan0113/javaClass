package day02;

public class TypeCastingEx01 {

	public static void main(String[] args) {
		//접미사 f(F)가 없는 실수리터럴은 double형
//		1.23은 8바이트인 double이고, num1은 4바이트인 
//		float이기 때문에 자동형변환이 불가능 -> 접미사를 붙이거나 강제형변환
		float num1 = (float)1.23;
		int num2 = 0b1100101;
		int num4 = (int)12345678901L;
		
		float c = 1.0f + 1.0f;
		System.out.println(c); 
		System.out.println(num4);
		Integer.toBinaryString(num2);
		System.out.println(num2);
		
		    						

		
	}

}
