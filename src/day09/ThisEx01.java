package day09;

public class ThisEx01 {

	public static void main(String[] args) {
		
		Test03 t1 = new Test03();
		Test03 t2 = new Test03(10);
		t1.print();
		t2.print();

}
}

class Test03{
	private int num;
	public void setNum(int num) {
		this.num = num;
		
	}
	public int getNum() {
		return num;
	}
	public void print() {
		System.out.println(this.getNum());
		
	}
	public Test03(){
		this(10);
		num = 20;
	}
	public Test03(int num) {
		this.num=num*4;
	}
}
