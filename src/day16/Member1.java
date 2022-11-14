package day16;

import lombok.Data;

@Data
public class Member1 {
	private String id, pw, name, residentNum;
	private int age;
	static final int totalPass = 4885;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member1 other = (Member1) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	public Member1(String id, String pw, String name, String residentNum, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.residentNum = residentNum;
		this.age = age;
	}
	public Member1(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	public Member1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ID : " +id + "\npassword : " + pw + "\nname : " + name + "\nage : " + age + "\nresidentNum : " + residentNum + "";
	}
	public void update(String iD, String pW, String name, int age, String num) {
		this.id = iD;
		this.pw = pW;
		this.name = name;
		this.residentNum = num;
		this.age = age;
	}
	
	
	
}
