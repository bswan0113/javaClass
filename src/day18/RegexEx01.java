package day18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		String regex = "^[A-z0-9_\\-]{5,20}$";
		Scanner scan = new Scanner(System.in);
		while(true){
		String str = scan.next();
		
		boolean res = Pattern.matches(regex, str);
		if(res)
		System.out.println(str + "은 pass");
		else
			System.out.println(str +"는 실패");}

	
	}

}
