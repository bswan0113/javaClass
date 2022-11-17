package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex01 {

	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9\\-_]+@[a-zA-Z0-9]{2,}+(\\.[A-z]+){1,2}+(\\.[A-z]+){0,5}$";
		Scanner scan = new Scanner(System.in);
		
		do {
			String str =scan.next();
			
			if(Pattern.matches(regex, str)) {
				System.out.println("비밀번호를 입력하세요,");
				break;
			}
			else {
				System.out.println("정확한 이메일을 입력해주세요.");
			}
			
		}while(true);
scan.close();
	}

}
