package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
	public static void main(String[] args) {
		String regex = "^[010]+\\-+[0-9]{4}+\\-+[0-9]{4}$";
					//^010(-\d{4}){2}$
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("가입자의 전화번호 11자리 혹은 10자리를 입력해주세요.");
			String str =scan.next();
			
			if(Pattern.matches(regex, str)) {
				System.out.println("본인이 맞으면 1번, 본인이 아니면 2번, 상담사 연결은 3번을 눌러주세요.");
				break;
			}
			else {
				System.out.println("잘못된 번호입니다.");
			}
			
		}while(true);
scan.close();
	}
}
