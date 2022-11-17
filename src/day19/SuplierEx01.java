package day19;

import java.util.function.Supplier;

public class SuplierEx01 {

	public static void main(String[] args) {
		
		System.out.println(num(()-> (int)(Math.random()*1000)));
	
	}
	public static int num(Supplier<Integer> s ) {
		return s.get();
	}

}
