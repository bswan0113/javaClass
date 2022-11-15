package day17;

import lombok.Data;

@Data
public class Member {
	private String pw, name, residentNum;
	private int age;
	public Member(String pw, String name, String residentNum, int age) {
		this.pw = pw;
		this.name = name;
		this.residentNum = residentNum;
		this.age = age;
	}
	public void update(String pW2, String name2, int age2, String num) {
		this.pw = pW2;
		this.name = name2;
		this.residentNum = num;
		this.age = age2;
	}

}
