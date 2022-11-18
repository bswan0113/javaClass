package phoneList;

import java.util.ArrayList;

import lombok.Data;

@Data
public class PhoneList{
	
	private String firstName, lastName, rectal;
	private ArrayList<PhoneNum> phoneNum = new ArrayList<PhoneNum>();
	

	
	public PhoneList (ArrayList<PhoneNum> phoneNum) {
	
		this.lastName= "이름없음";
		this.phoneNum=phoneNum;
	}
	
	public PhoneList(String lastName, String firstName,  ArrayList<PhoneNum> phoneNum ) {
		this.lastName=lastName;
		this.firstName=firstName;;
		this.phoneNum=phoneNum;
	}
	
	
	public PhoneList(String lastName, String firstName, String rectal, ArrayList<PhoneNum> phoneNum ) {
		this.lastName=lastName;
		this.firstName=firstName;
		this.rectal=rectal;
		this.phoneNum=phoneNum;

			
	}
	
	

	public String printPhoneNum() {
		String a="";
		for(int i=0; i<this.phoneNum.size(); i++) {
			if(phoneNum.get(i)!=null) a+="\n"+phoneNum.get(i);
		}
		return a;
	}
	public PhoneList(String last, String first, String rec) {
		this.lastName=last;
		this.firstName=first;
		this.rectal=rec;	}

	@Override
	public String toString() {
		return "\n"+ lastName + ""+firstName+
				"\n직장 : " + rectal+
				"\n"+printPhoneNum()+"\n";
	}
	



}
