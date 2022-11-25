package day25;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	/*정수를 5번 입력하여 배열 /리스트에 저장하는 코드를 작성하시오
	 * 정수가 홀수이면 그대로 저장하고 정수가 짝수이면 -를 붙여서 저장
	 * 
	 * */
	
	static Scanner scan= new Scanner(System.in);
	static {System.out.println("프로그램을 시작합니다.");}
	static ArrayList<Integer> a = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		InputListNum();
	}
	static void InputListNum() {
		System.out.println("정수를 입력해주세요.");
		int size=5;
		for(int i=0;i<size;i++) {
			int tmp = scan.nextInt();
			if(tmp%2==0) {
				a.add(-tmp);
			}
			if(tmp%2==1) {
				a.add(tmp);
			}
		}
		for(Integer tmp : a) {
			System.out.print(tmp+" ");
		}
		
	}

}
