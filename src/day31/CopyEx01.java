package day31;

import lombok.Data;

public class CopyEx01 {

	public static void main(String[] args) {
		Test t1 = new Test(10,20, "김개똥");
		Test t2 = t1;
		Test t3 = new Test(t1);
		
		System.out.println("t1"+t1);
		System.out.println("t2"+t2);
		System.out.println("t3"+t3);
		
		t3.setNum1(100);
		t1.getSub().setName("개똥아");
		System.out.println("t1"+t1);
		System.out.println("t2"+t2);
		System.out.println("t3"+t3);
		
		

	}
	
	

}
@Data
class Test{
	int num1, num2;
	Sub sub;
	public Test(int num1, int num2, String name) {
		this.num1 = num1;
		this.num2 = num2;
		this.sub=new Sub(name);
	}

	public Test(Test t1) {
		this.num1=t1.num1;
		this.num2=t1.num2;
		this.sub=new Sub(t1.sub);
	}

	public Test() {
		// TODO Auto-generated constructor stub
	}

	 
}

@Data
class Sub{
	String name;
	public Sub(String name) {
		this.name=name;
	}
	public Sub(Sub sub) {
		this.name=sub.getName();
	}
}