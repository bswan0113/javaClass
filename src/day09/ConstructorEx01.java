package day09;

public class ConstructorEx01 {

	public static void main(String[] args) {
		Test01 t1 = new Test01();
//		Test02 t2 = new Test02(); // 에러발생
		//Test02는 기본 생성자가 없기때문에 기본 생성자로 초기화 할 수 없음
	
		Test02 t2 = new Test02(0);
		
	
		//Scanner클래스는 기본 생성자를 구현하지 않기때문에 기본생성자를 이용하여 초기화를 할 수 없음
	}
	

}
/*클래스에 생성자를 추가하지 않으면 기본 생성자가 자동으로 추가가 됨
 * 
 * */
class Test01{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
class Test02{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public Test02(int num1) {
		num = num1;
	}
	
}