package day09;

import day08.ClassEx01;

public class StaticEx01 {

	public static void main(String[] args) {
		KiaCar k1 = new KiaCar("모닝");
		KiaCar k2 = new KiaCar("레이");
		KiaCar k3 = new KiaCar("K7");
		k1.print();
		k2.print();
		k3.print();
		System.out.println("-----------------------------------");
		k1.name = "K5";
		KiaCar.logo = "HYUNDAI";
		k1.logo = "BOOGATI"; // 가능하지만 일반적이진 않음
		k1.print();
		k2.print();
		k3.print();
		k1.carNum=10;
		k1.print();

		KiaCar.printLogo();
	}

}

class KiaCar{
	public static String logo = "KIA";
	public String name;
	public int carNum;
	
	public KiaCar(String name) {
		this.name=name;
	}
	public void print() {
		System.out.print(logo);
		System.out.println(" : " + name);
		System.out.println(carNum);
	}
	public static void printLogo() {
		System.out.print(logo);
		//System.out.println(" : " + name); static 필드가 아니기에 에러발생
	}
}