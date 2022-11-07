package day11;

public class InheritanceEx01 {

	public static void main(String[] args) {
		
		Child1 child = new Child1();
		child.print();
		
	}

}


class Child1 extends Parent1{
	public Child1() {
		super(1,2,3);
		//super(); 자식생존자의
	//	num1 = 10; // 접근제한자가 private이어서 자식 클래스에서 사용하지 못함
		num2 = 20; // 접근제한자가 default 같은 패키지에 있기때문에 사용 가능
					// 상속여부와 상관이 없음
		num3 = 30; //접근제한자가 protected여서 자식클래스에서 사용이 가능함
					//다른 패키지여도 사용이 가능
		
	}
	@Override
	public void print() {
		super.print();
		System.out.println("자식 클래스의 메소드 입니다.");
		
	}
}

class Parent1{
	private int num1 = 1;
	int num2 = 2;
	protected int num3 = 3;
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("Hello");
	}
	public Parent1(int num1, int num2, int num) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
}
