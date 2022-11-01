package day07;

import java.util.Scanner;

public class MethodEx03 {
/*주어진 정수 num이 소수인지 아닌지 판별하는 코드를 작성하시오.
 * 
 * */
	
	
	public static void main(String[] args) {
		System.out.println("임의의 정수를 입력하세요.");
	Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		
	
		prime(num);
		
		System.out.println(prime2(num));
System.out.println(isPrimeNumber(num));
		scan.close();
	}

	
	/* 기능 : 입력 받은 임의의 정수를 소수인지 아닌지 판별하여 출력
	 * 매개변수 : 임의의 정수 => int num;
	 * 리턴타입 : 없음
	 * 매소드명 : prime
	 */
	public static void prime(int num) {

		
		int i;
		int count=0;
		for(i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		
	}

	
	/* 기능 : 소수인지 아닌지를 판별하여, 결과을 돌려주는 메소드
	 * 매개변수 : 임의의 정수 => int num;
	 * 리턴타입 : String
	 * 매소드명 : prime2
	 */
	
	public static String prime2(int num) {
		int i;
		int count=0;
		
		for(i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==1) {
		String prime2  = "소수가 맞습니다.";
			return prime2;
			
		}
		else {
		String prime2 = " 소수가 아닙니다.";
			return prime2;
			
		}
		
	}
	
	/*teacher ver.
	 * 기능 : 정수가 주어지면 소수인지 아닌지 출력하는 메소드
	 * 매개변수 : 정수 -> int num
	 * 리턴타입 : 출력 -> void
	 * 메소드명 : printPrimeNumber
	 * 
	 * */
	public static void printPrimeNumber(int num) {
		int i;
	int count=0;
	for(i=1;i<num;i++) {
		if(num%i==0) {
			count++;
		}
		
	}
	if(count==1) {
		System.out.println("소수입니다.");
	}
	else {
		System.out.println("소수가 아닙니다.");
	}
		
	}
	
	/*기능 : 정수가 주어지면 소수인지 아닌지 알려주는 메소드
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 소수인지 아닌지 => boolean
	 * 메소드명 : isPrimeNumber
	 * 
	 * */
	public static boolean isPrimeNumber(int num) {
		
		int i;
		
		for(i=2;i<num;i++) {
			if(num%i==0) {				
				return false;		 }
							
			
				}
		
		return num <= 1 ? false : true;
		
		
	}


}

