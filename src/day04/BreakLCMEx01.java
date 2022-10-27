package day04;

public class BreakLCMEx01 {
	public static void main(String[] args) {
		//Least Common Multiple
		// 두 정수의 최소 공배수를 구하는 코드를 작성하시오.
		// i는 num1부터 num1*num2까지 num1씩 증가 -> 최소공배수를 정의하는 시각1
		// 규칙성 : i가 num1과 num2의 배수이면 i를 출력후 반복문 종료
		// i가 num1의 배수이고 num2의 배수이면 i출력후 반복문 종료
		
		int num1= 47;
		int num2= 43;
		int i;
		
		for(i=num1; i <= num1*num2; i+=num1) {
			if(i%num1==0 && i%num2==0) {// i는 최소공배수이자 num1 num2의 약수
				System.out.println(i);
				break;}
		
		}
		
		
		
		// Another way
		
		
			}
	
		
	}

