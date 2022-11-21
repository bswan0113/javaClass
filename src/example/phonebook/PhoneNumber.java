package example.phonebook;

import java.util.regex.Pattern;

import lombok.Data;

@Data
public class PhoneNumber {
	private String pNmae, number;
	
	public void setNumber(String number) {
		String regex="^\\d{2,3}(-\\d?\\d{3}){2}$";
		
		if(Pattern.matches(regex, number)) {
			this.number=number;
		}
		else {
			throw new  RuntimeException("예외 발생 : 번호를 잘못 입력했습니다.");
		}
	}
	public PhoneNumber(String pNmae, String number) {
		this.pNmae = pNmae;
		setNumber(number);
	}
	public PhoneNumber(String a) {
		setNumber(number);
	}
	@Override
	public String toString() {
		return "" + pNmae + " : " + number+"\n";
	}
	public void update(String pName, String number) {
		this.pNmae=pName;
		this.number=number;
	}
	
}
