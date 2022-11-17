package day19;

import java.util.function.Consumer;

public class LambdaEx02 {

	public static void main(String[] args) {
		Sum sum = (a, b) ->a+b;
		
		
		print(sum.sum(3,4));
	
		Print<Integer> print = (num) -> System.out.print(num);
		print.run(4);
		Consumer<String> print2 = str -> System.out.print(str);
		print2.accept("12");

	}

	static void print(double a) {
		System.out.println(a);
	}
}

interface Sum{
	double sum(double a, double b);
}

interface Print<T>{

	void run(T num);
}
