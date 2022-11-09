package day13;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class LombokTest {


	public static void main(String[] args) {
		TestA a = new TestA();
		a.setNum(10);
		a.setNum2(20);
		System.out.println(a.getNum());
		System.out.println(a);
		TestA b = new TestA(10, 20);
	System.out.println(b);
		System.out.println(a.equals(b));
		
		a.print();
System.out.println(a.print2(1,2));		

	a.print3(0);
	}

}
//@Data
//@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
class TestA{
	private int num=1;
	private int num2=2;
	public TestA(int num, int num2) {
		super();
		this.num = num;
		this.num2 = num2;
	}
	public void print() {
		System.out.println(num+num2);
	}
	public int print2(int num1, int num2) {
		return num1 + num2 + this.num;
	}
	public static void print3(int num) {
		System.out.println(num);
	}
}
