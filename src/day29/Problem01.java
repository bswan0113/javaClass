package day29;

import java.util.Scanner;

import lombok.Data;

public class Problem01 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String str ="abc";
		String str1 ="abc";
		/*	리터럴 문자열은 이미 선언이 되어 있는 경우에는
		 * 새롭게 문자열을 생성하지 않고 주소를 배정하게됨
		 * 그러므로 str1 ==str2 은 true를 출력하게됨
		 * Scanner를 이용해서 입력받은 문자열은 리터럴 문자열이 아니기때문에
		 * 입력한 문자열이 앞에 사용중인 리터릴 문자열이더라도 새로 할당하여 넘겨주게됨
		 * */
		String str2 =str1;
	//	String str3 = scan.next();
		
		//System.out.println(str1==str2);
	//	System.out.println(str1.equals(str3));
		
			str2="111";
		//	System.out.println(str1==str2);
			
			int b= scan.nextInt();
			
			
			abc a = new abc();
			a.setNum(1);
			System.out.println(b==a.getNum());
			

	}

}

@Data
class abc{
	int num;
}