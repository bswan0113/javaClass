package day11;

public class ClassUpCastingEx01 {

	public static void main(String[] args) {
		/*자식클래스인 KiaCar 객체를 부모클래스인 Car객체에 저장  : 업캐스팅
		 * 업캐스팅은 자동으로 동작
		 * */
		//Car car = new KiaCar(4, "K5", 0X00ff00, "521허6621");
		//car.print();
		//Car배열을 이용하여 여러 종류의 자동차들을 관리할 수 있다.
		Car []carList = new Car[5];
		carList[0] = new KiaCar(4, "K5", 0X00ff00, "521허6621");
		carList[1] = new HyundaiCar(4,"Sonata",0xff0000,"161곎6621"); // 하나의 배열로 여러타입의 객체를 관리할 수 있음
		
		for(int i=0;i<carList.length;i++) {
		carList[i].print();
		}
	}

}
