package day11;

public class ClassDownCastingEx01 {

	public static void main(String[] args) {
		/* 클래스 다운 캐스팅은 조건부로 가능
		 * 안되는 경우 : 부모클래스의 객체를 바로 자식 클래스의 객체에 저장하는 경우
		 * 	자식 클래스의 객체를 부모클래스의 객체에 저장한 후, 다시 자식 클래스의 객체로 저장하는 경우
		 * Car배열을 이용하여 여러 종류의 자동차들을 관리할 수 있다.
		 * */
//		KiaCar kcar = (KiaCar)(new Car(4,"BOOGATHI CHIRON SUPER SPORTS +300", 0xff0000,"12431"));
//		kcar.print();
		
		KiaCar kcar = new KiaCar(4,"BOOGATHI CHIRON SUPER SPORTS +300", 0xff0000,"12431");
		Car car = kcar;
		KiaCar kcar2 = (KiaCar)car;
		kcar2.print();
		
		Car []carList = new Car[5];
		carList[0] = new KiaCar(4, "K5", 0X00ff00, "521허6621");
		carList[1] = new HyundaiCar(4,"Sonata",0xff0000,"161곎6621"); 
		carList[2] =  new KiaCar(4,"BOOGATHI CHIRON SUPER SPORTS +300", 0xff0000,"12431");
				
		
		// 차 종류에 맞게 hand, auto 기능을 호출하기위해 다운캐스팅을 진행
		for(Car tmp : carList) {
			if(tmp instanceof KiaCar) {
				((KiaCar) tmp).hand();
			}
			else if(tmp instanceof HyundaiCar) {
				((HyundaiCar) tmp).auto();
				
			}
		}
	}

}
