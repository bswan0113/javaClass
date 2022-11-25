package day25;

public class RecursionFunctionEx01 {
/*
 * 재귀함수 : 함수의 실행문으로 자기자신을 다시 호출함
 * 	-잘못 작성하면 스택 오버플로우가 발생
 * */
	public static void main(String[] args) {

		//print(0,1);
		
		System.out.println(Factorial(5));
	}

	static void print(int num, int count) {
		if(count>5)return;
		System.out.println(num);
		print(++num,++count);
		
	}
	
	static long Factorial(int num) {
	if(num<0)
		throw new RuntimeException("음수 시져잉");
		if(num<=1)return 1;	
		
		return num*(Factorial(num-1));
	}
}
