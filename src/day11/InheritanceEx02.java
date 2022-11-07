package day11;

public class InheritanceEx02 {

	public static void main(String[] args) {
		
		KiaCar kcar = new KiaCar(4,"K5",0xff000,"134가1234");
		
		kcar.powerOn();
		kcar.changeGear('D');
		for (int i=0; i<30; i++) {
			kcar.accel();
		}
		//자동차 상태확인
		kcar.print();
		for(int i=0; i<30; i++) {
			kcar.breaker();
		}
		kcar.changeGear('P');
		kcar.powerOff();
		
HyundaiCar hcar = new HyundaiCar(4,"쏘나타",0xff000,"126가1514");
		
		hcar.powerOn();
		hcar.changeGear('D');
		for (int i=0; i<30; i++) {
			hcar.accel();
		}
		//자동차 상태확인
		hcar.print();
		for(int i=0; i<30; i++) {
			hcar.breaker();
		}
		hcar.changeGear('P');
		hcar.powerOff();
	}

}
/*자동차 클래스, 타이어 클래스, 기아자동차클래스, 현대차 자동차 클래스를 만들어보세요 
 * 
 * 자동차
 * 	- 타이어, 차종, 색상, 번호, 전원(시동), 속력, 기어, 제조사, 타이어개수
 * 	- 전원 켜기/끄기, 기어변경, 속력업/다운
 * 타이어
 * 	- 제조사, 크기, 종류(snow, 일반), 상태
 * 	- 상태출력
 * 
 * 기아자동차
 *	- 제조사가 기아, 자동차 상속
 *
 * 현대자동차
 * - 제조사가 현대, 자동차 상속
 *
 * */

//자동차에 타이어가 들어가기때문에 타이어 먼저 생성

class Tire{
	public String company;
	public int size;
	public boolean isSnow;
	public boolean isStop;
	
	public void print() {
		if(isStop) {
			System.out.println("정지해있습니다.");
		}
		else {
			System.out.println("굴러가는중입니다.");
		}
	}
}

class Car{
	public Tire[] tires;
	public int tireCount;
	public String type;
	public int color;
	public String carNum;
	public boolean power;
	public int speed;
	public char gear;
	public String company;
	
	public Car(int tireCount, String type, int color, String carNum) {
		
		this.tireCount = tireCount <=0 ? 4 : tireCount;
		this.type = type;
		this.color = color;
		this.carNum = carNum;
		this.company = company;
		this.gear = 'P';
		tires = new Tire[tireCount];
	}
	public void powerOn() {power = true; }
	public void powerOff() {power = false; }
	public void changeGear(char gear) {
		if(gear =='P' && speed != 0) {
			return;
		
		}
			this.gear=gear;
			
		
	}
	public void accel() {
		speed++;
	}
	public void breaker() {
		speed--;
		if(speed<0) {
			speed=0;
		}
		speed = speed < 0?0:speed;
	}
	public void print() {
		System.out.println("전원 : " + (power ? "ON" : "OFF"));
		System.out.println("속력 : " + speed);
		System.out.println("기어 : " + gear);
		System.out.println("회사 : " + company);
		System.out.println("차종 : " + type);}	
}

class KiaCar extends Car{

	public KiaCar(int tireCount, String type, int color, String carNum) {
		super(tireCount, type, color, carNum);
		this.company = "기아";
	
	}
	public void hand() {
		System.out.println("1종 수동입니다.");
	}
}
class HyundaiCar extends Car{

	public HyundaiCar(int tireCount, String type, int color, String carNum) {
		super(tireCount, type, color, carNum);
		this.company = "현대";
	
	}
	public void auto() {
		System.out.println("2종 보통입니다.");
	}
}