package mine;

public class Test {

	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe =new FireEngine();
		
		FireEngine fe2 =null;
				
				fe.water();
				car=(FireEngine)fe;
			//	car.water();
				fe2 =(FireEngine)car;
				fe2.water();
	


}
}

class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water!!");
	}
}