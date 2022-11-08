package day12;



public class ObjectEx01 {

	public static void main(String[] args) {
		Student std = new Student();
		Student std2 = new Student();
		System.out.println(std);
		System.out.println(std2);
		System.out.println("두 개체를 ==로 비교 : " + (std == std2));
		System.out.println("두 개체를 equals로 비교 : " + std.equals(std2));
		

	}

}
