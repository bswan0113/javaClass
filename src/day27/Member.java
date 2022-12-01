package day27;


import lombok.Data;

@Data
public class Member {

	private String id, pw;
	Member() {
		
	}
	Member(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
}
