package day11;

public class PolymorphismEx01 {
	
	
	/* 매개변수의 다형성 => 메소드 오버로딩을 줄여줌
	 * 매개변수로 부모 클래스의 객체를 전달하여, 같은 부모를 가진 자식 클래스 객체를 매개변수로 활용 할 수 있게 하는 것
	 * */
		public static void main (String[] args) {
		connectToComputer(new Mouse());
		connectToComputer(new KeyBoard());
		connectToComputer(new Speaker());}

		
		public static void connectToComputer(UsbProduct obj) {
			System.out.println(obj.Type+ " 와 연결되었습니다.");
		}
		
}
class UsbProduct{
	public String Type;
}

class Mouse extends UsbProduct{{Type = "마우스";}}
class KeyBoard extends UsbProduct{{Type = "키보드";}}
class Speaker extends UsbProduct{{Type = "스피커";}}
