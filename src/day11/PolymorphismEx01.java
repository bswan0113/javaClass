package day11;

public class PolymorphismEx01 {
	
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

class Mouse extends UsbProduct{
	{Type = "마우스";}
}
class KeyBoard extends UsbProduct{{Type = "키보드";}}
class Speaker extends UsbProduct{{Type = "스피커";}}
