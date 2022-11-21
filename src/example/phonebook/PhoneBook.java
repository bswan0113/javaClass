package example.phonebook;

import java.util.ArrayList;

import lombok.Data;

@Data
public class PhoneBook {
	private String name, company;
	ArrayList<PhoneNumber> pnlist;

	public PhoneBook(String name, String company, ArrayList<PhoneNumber> pnlist) {
		this.name = name;
		this.company = company;
		this.pnlist = pnlist;
	}

	public void update(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public void print() {
	for(int i=0; i<pnlist.size(); i++) {
		System.out.println(i+1 + " ." + pnlist.get(i).getNumber());
		}
		
	}

}
