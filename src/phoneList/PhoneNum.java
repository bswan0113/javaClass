package phoneList;

public class PhoneNum {

	private String name;
	private String num;
	
	public PhoneNum(String name, String num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public String toString() {
		return ""+ name + " : " +num;
	}
	
	
	
	
}
