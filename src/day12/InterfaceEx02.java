package day12;

public class InterfaceEx02 {

	public static void main(String[] args) {

	}

}

interface TestA{
	void test();
	
	/*
	 *default  메소드를 추가하면 기존 인터페이스에 새로운 메소드를 추가해도 
	 *이미 구현된 구현 클래스에 영향이 가지 않음 */
	default void testB() {}
}

class TestAA implements TestA{

	@Override
	public void test() {
		System.out.println("AAA");
	}}

class TestAB implements TestA{

	@Override
	public void test() {
		System.out.println("AAB");
	}
	
}