package day25;

import java.util.Scanner;

public class Ex01 {

	/*정수를 입력받아
	 *0부터 입력받은 수까지 절대값의 합을 구하는 코드를 작성하시오.
	 * */
	
	static Scanner scan= new Scanner(System.in);
	static {System.out.println("프로그램을 시작합니다.");}
	public static void main(String[] args) {
		
		
		
		//printAbsolte1();
		//teacherVer();
		printAbsolute2();
	
	}
	
	private static void printAbsolute2() {
		int a = scan.nextInt();
		int sum=0;
		for(int i=0; ;) {
			sum+=i;
			if(a>0) {
				i++;
			}
			else {
				i--;
			}
			if(i>=a)break;
			if(i<=-a)break;
			
		}
		if(sum<0) {
			sum=-sum;
		}
		System.out.println(sum);
	}

	private static void printAbsolte1() {
		int input=1;
		do {
			System.out.println("정수를 입력해주세요. 0을 입력하면 종료됩니다.");
		input = scan.nextInt();
		int sum=0;
		if(input>=0) {
			if(input==0) {System.out.println("시스템을 종료합니다.");break;}
		for(int i=0; i<=input;i++) {
			sum+=i;
			
		}
		System.out.println("0부터 "+input+"까지의 절대값의 합은 " +sum+"입니다.");
		}
		else {
			for(int i=0; i>=input;i--) {
				sum-=i;
				
			}
			System.out.println("0부터 "+input+"까지의 절대값의 합은 " +sum+"입니다.");
		}
		}while(input!=0);		
	}
	

	
	
	
	
		
		
		
	
	

}
