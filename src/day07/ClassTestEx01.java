package day07;

public class ClassTestEx01 {

	public static void main(String[] args) {
		/*  객체(instance)화 방법
		 *  클래스명 객체명 = new 클래스명();
		 *  		 
		 * */
		String str = new String();
		str = "abcdedf";
		Person person1 = new Person();
		//person1.pNo("111111");
		//pNo에 private을 추가하기 전에는 외부접근이 가능
		// 캡슐화를 통해 pNo의 접근제한자를 private으로 설정하면 직접접근 불가능
		// 캡슐화된 pNo에 접근하려면 getter/setter를 통해 접근해야함
		person1.setpNo("123456-1234567");
		System.out.println("주민 번호 : " + person1.getpNo());
		System.out.println(str.charAt(3));
		


		
	}

}
/* class 클래스명{
  접근제한자 자료형 변수명;// => 멤버변수

	접근 제한자의 종류
	- private : 클래스 내부에서만 사용가능.
	- (default) : 본인클래스 + 같은 패키지내부에서 사용가능
	- protected : 본인 클래스 + 같은 패키지 + 자식 클래스
	- public : 본인 클래스 + 같은 패키지 + 자식 클래스 + 외부 클래스

} */

class Person{ // 클래스명은 대문자로 시작 // 일반적으로 멤버변수는 private
	private	String pNo;
	private	String name;
	private	char gender;
	private	String address;
	private	String phone;
	private	int age;
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	
}