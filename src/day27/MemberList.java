package day27;

import lombok.Data;

@Data
public class MemberList {
	private Member member;
	static int count=0;
	int membernum;
	
	public MemberList(Member member) {
		this.member = member;
		{membernum=count; count++;	}
	}

	@Override
	public String toString() {
		return "회원번호 : " + membernum + "\n ID : " + this.member.getId();
	}
	
	
	
	
	

	
}
