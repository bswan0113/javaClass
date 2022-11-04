package day10;


import day10_1.TestB;

public class AccessModifierEx01 {

	public static void main(String[] args) {
		TestA a = new TestA();

		TestB b = new TestB();
//		a.num1 = 1; // private 외부에서 접근 불가
		a.num2 = 2; // default 이고 같은 패키지이기에 정상 동작
		a.num3 = 3;	
//		b.num1 = 1; // private 외부에서 접근 불가
//		b.num2 = 2; // default 이기에 다른패키지에서 접근할 수 없음
		b.num3 = 3;
	}

}
